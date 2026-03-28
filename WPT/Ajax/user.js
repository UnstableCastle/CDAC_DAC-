var currentUpdateId = null;

// READ
function getdata() {
    var xhr = new XMLHttpRequest();
    xhr.open("GET", "http://localhost:8888/users");

    xhr.onload = function () {
        if (xhr.status == 200) {
            var users = JSON.parse(xhr.responseText);
            var tbody = document.getElementById("tb");
            tbody.innerHTML = "";

            for (var i = 0; i < users.length; i++) {
                var u = users[i];

                var row = "<tr>";
                row += "<td>" + u.id + "</td>";
                row += "<td>" + u.userid + "</td>";
                row += "<td>" + u.status + "</td>";
                row += "<td>" + u.last_login + "</td>";
                row += "</tr>";

                tbody.innerHTML += row;
            }
        }
    };

    xhr.send();
}

// CREATE
function addData() {
    var obj = {
        userid: document.getElementById("c_userid").value,
        upass: document.getElementById("c_pass").value,
        status: document.getElementById("c_status").value,
        last_login: document.getElementById("c_login").value
    };

    var xhr = new XMLHttpRequest();
    xhr.open("POST", "http://localhost:8888/users");
    xhr.setRequestHeader("Content-Type", "application/json");

    xhr.onload = function () {
        if (xhr.status == 201) {
            alert("Record Inserted");
            getdata();
        }
    };

    xhr.send(JSON.stringify(obj));
}

// UPDATE (Step 1)
function getSingleID() {
    currentUpdateId = document.getElementById("gid").value;

    var xhr = new XMLHttpRequest();
    xhr.open("GET", "http://localhost:8888/users/" + currentUpdateId);

    xhr.onload = function () {
        if (xhr.status == 200) {
            var u = JSON.parse(xhr.responseText);

            document.getElementById("nuserid").value = u.userid;
            document.getElementById("npass").value = u.upass;
            document.getElementById("nstatus").value = u.status;
            document.getElementById("nlogin").value = u.last_login;
        } else {
            alert("User not found");
        }
    };

    xhr.send();
}

// UPDATE (Step 2)
function updateRecord() {
    if (currentUpdateId == null) {
        alert("Load user first");
        return;
    }

    var obj = {
        userid: document.getElementById("nuserid").value,
        upass: document.getElementById("npass").value,
        status: document.getElementById("nstatus").value,
        last_login: document.getElementById("nlogin").value
    };

    var xhr = new XMLHttpRequest();
    xhr.open("PUT", "http://localhost:8888/users/" + currentUpdateId);
    xhr.setRequestHeader("Content-Type", "application/json");

    xhr.onload = function () {
        if (xhr.status == 200) {
            alert("Record Updated");
            getdata();
        }
    };

    xhr.send(JSON.stringify(obj));
}

// DELETE
function deleterecord() {
    var id = document.getElementById("uid").value;

    if (id == "") {
        alert("Enter ID");
        return;
    }

    var confirmDelete = confirm("Delete record?");
    if (!confirmDelete) return;

    var xhr = new XMLHttpRequest();
    xhr.open("DELETE", "http://localhost:8888/users/" + id);

    xhr.onload = function () {
        if (xhr.status == 200 || xhr.status == 204) {
            alert("Record Deleted");
            getdata();
        }
    };

    xhr.send();
}
