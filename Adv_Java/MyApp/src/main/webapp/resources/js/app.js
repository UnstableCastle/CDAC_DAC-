function validate() {

    
    if(document.regform.txtName.value == "") {
        alert("Enter Name");
        return false;
    }

    
    if(document.regform.txtPassword.value == "") {
        alert("Enter Password");
        return false;
    }

    
    if(document.regform.txtEmail.value == "") {
        alert("Enter Email");
        return false;
    }

    
    if(
        document.regform.gender[0].checked == false &&
        document.regform.gender[1].checked == false
    ) {
        alert("Select Gender");
        return false;
    }

    
    if(document.regform.age.value == "select") {
        alert("Select Age");
        return false;
    }

    
    if(document.regform.chbx.checked == false) {
        alert("Accept Terms & Conditions");
        return false;
    }

    return true;
}