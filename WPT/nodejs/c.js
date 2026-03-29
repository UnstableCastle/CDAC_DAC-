
const { SocketAddress } = require('net');
const os = require('os');
const path = require('path');
//core module 

console.log(os.arch());
console.log(os.hostname());
console.log(os.homedir());
console.log("total memory",os.totalmem());
console.log("free memory",os.freemem());
console.log(os.cpus());
console.log(__dirname);
console.log(__filename);

console.log(path.extname(__filename));
console.log(path.isAbsolute(__filename));
console.log(path.join(__filename));
console.log(path.basename(__dirname));
console.log(path.basename(__filename));
console.log(path.join(__dirname,"/any/path"));

