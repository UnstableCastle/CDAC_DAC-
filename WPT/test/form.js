 function validatePassword() {
            let pass = document.getElementById("pass").value;
            let errorSpan = document.getElementById("passError");
            let passInput = document.getElementById("pass");

            if (pass.length < 6) {
                errorSpan.innerText = "Too short! (Min 6 chars)";
                passInput.style.borderColor = "red";
                return false;
            } else {
                errorSpan.innerText = "";
                passInput.style.borderColor = "green";
                return true;
            }
        }

        function validateAll() {
            let uid = document.getElementById("uid").value;
            let uname = document.getElementById("uname").value;
            let email = document.getElementById("email").value;
            let contact = document.getElementById("contact").value;
            let gender = document.regForm.gender;

            let uidReg = /^[a-zA-Z0-9]+$/;
            let emailReg = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
            let contactReg = /^[0-9]{10}$/;

            if (uid === "" || !uidReg.test(uid)) {
                alert("User ID is required and must be alphanumeric (no spaces).");
                return false;
            }

            if (uname.length < 3 || uname.length > 15) {
                alert("Username must be between 3 and 15 characters.");
                return false;
            }

            if (!emailReg.test(email)) {
                alert("Invalid Email Format");
                return false;
            }

            if (!contactReg.test(contact)) {
                alert("Contact must be exactly 10 digits");
                return false;
            }

            if (!gender.value) {
                alert("Please select a Gender");
                return false;
            }

            if (!validatePassword()) {
                alert("Please fix the password field.");
                return false;
            }

            alert("All validations passed! Form Submitted.");
            return true;
        }