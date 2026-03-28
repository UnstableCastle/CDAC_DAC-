// 1. Fetch all data
function getdata() {
    let xmlhttp = new XMLHttpRequest();
    xmlhttp.onload = function () {
        if (xmlhttp.status === 200) {
            try {
                let jsObjData = JSON.parse(this.responseText);
                let tbody = document.getElementById("tb");
                tbody.innerHTML = ""; 
                jsObjData.forEach(emp => {
                    let newRow = document.createElement("tr");
                    newRow.innerHTML = `
                        <td>${emp.id}</td>
                        <td>${emp.name}</td>
                        <td>${emp.role}</td>
                        <td>${emp.salary}</td>
                        <td>${emp.department}</td>`;
                    tbody.appendChild(newRow);
                });
            } catch (e) {
                console.error("Error parsing JSON: ", e);
            }
        } else {
            console.error("Server error: " + xmlhttp.status);
        }
    };
    xmlhttp.open("GET", "http://localhost:8888/employees");
    xmlhttp.send();
}

// 2. Delete a record
function deleterecord() {
    const id = document.getElementById("uid").value;

    if (id && window.confirm(`Are you sure you want to delete record ${id}?`)) {
        fetch(`http://localhost:8888/employees/${id}`, { method: 'DELETE' })
            .then(response => {
                if (response.ok) {
                    window.alert("Record deleted");
                    document.getElementById("uid").value = ""; 
                    getdata(); 
                } else {
                    window.alert(`Failed: Status ${response.status}`);
                }
            })
            .catch(err => window.alert("Network error: Is the server running?"));
    }
}

// 3. Add a new record
function addData() {
    let empObj = {
        name: document.getElementById("uname").value,
        role: document.getElementById("urole").value,
        salary: document.getElementById("usalary").value,
        department: document.getElementById("udet").value
    };

    let xmlhttp = new XMLHttpRequest();
    xmlhttp.onload = function () {
        // Checking for 201 (Created)
        if (xmlhttp.status === 200 || xmlhttp.status === 201) {
            window.alert("Record inserted successfully");

            document.getElementById("uname").value = "";
            document.getElementById("urole").value = "";
            document.getElementById("usalary").value = "";
            document.getElementById("udet").value = "";

            getdata(); 
        } else {
            window.alert("Error: " + xmlhttp.status);
        }
    };

    xmlhttp.open("POST", "http://localhost:8888/employees");
    // Added header so server knows it's JSON
    xmlhttp.setRequestHeader("Content-Type", "application/json");
    xmlhttp.send(JSON.stringify(empObj));
}

let updateId; // Global variable to store the ID for update

function getSingleID() {
    updateId = document.getElementById("gid").value;
    let xmlhttp = new XMLHttpRequest();

    xmlhttp.onload = function() {
        if (this.status === 200) {
            let data = JSON.parse(this.responseText);

            // Populate the update fields
            document.getElementById("nname").value = data.name;
            document.getElementById("nrole").value = data.role;
            document.getElementById("nsalary").value = data.salary;
            document.getElementById("ndet").value = data.department;
        } else {
            alert("Record not found!");
        }
    };

    xmlhttp.open("GET", `http://localhost:8888/employees/${updateId}`);
    xmlhttp.send();
}

function updateRecord() {
    if (!updateId) {
        alert("Please fetch a record first!");
        return;
    }

    let xmlhttp = new XMLHttpRequest();
    let empObj = {
        name: document.getElementById("nname").value,
        role: document.getElementById("nrole").value,
        salary: document.getElementById("nsalary").value,
        department: document.getElementById("ndet").value
    };

    xmlhttp.onload = function() {
        if (this.status === 200 || this.status === 204) {
            window.alert("Data updated successfully!");
            getdata(); // Refresh the table
        } else {
            alert("Update failed: " + this.status);
        }
    };

    xmlhttp.open("PUT", `http://localhost:8888/employees/${updateId}`);
    xmlhttp.send(JSON.stringify(empObj));
}