const fs = require('fs');

//create new dir asynchronously

fs.mkdir("./newDir", (error, result)=>{});

// delete file asynchronously

fs.unlink("./delete.txt", (error, result)=>{});//deletes file from folder ....


// make dirf with files
//new dir
fs.mkdir("newDir_two", (error, result)=>{ 
    fs.writeFile("./newDir_two/writenew.txt", "yoooo new file in new dir", (error, data) => { 
        console.log("new folder with a new file is created")
        ; });
     });

     //task delete dir newDir_ along with file   
fs.rmdir("./newDir_two", { recursive: true }, (error) => {
    if (error) {console.error(error);
        return;
    }
console.log("dir deleted");
});
