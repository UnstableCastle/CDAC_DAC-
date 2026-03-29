const fs = require('fs');

//write file operations synchronously

let writeData = fs.writeFileSync("./writeone.txt","hello world!!!");

// let readData = fs.readFileSync("./writetwo.txt"); //hexa
// console.log(readData);

let readData = fs.readFileSync("./writetwo.txt","utf-8");//encoded
console.log(readData);

let appendData = fs.appendFileSync("./writeone.txt","Welcome you all ");