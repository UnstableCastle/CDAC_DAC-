// read and write stream data

const fs = require('fs');

let readStream = fs.createReadStream(__dirname + "/writethree.txt", "utf-8");
let writeStream = fs.createWriteStream(__dirname + "/newStream.txt",(error,result)=>{});
readStream.on("data", (chunk)=>{
    console.log(chunk);
    writeStream.write(chunk);
});

