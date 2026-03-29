require('dotenv').config();
const http = require('http');
const fs = require('fs');

let host = process.env.HOST;
let port = process.env.PORT;

let server = http.createServer((req, res) => {

    if (req.url === "/" || req.url === "/home") {
        res.writeHead(200, { "content-type": "text-html" });
        let readStream = fs.createReadStream(__dirname + "/index.html", "utf-8");
        readStream.pipe(res);
    }

    if (req.url === "/" || req.url === "/about") {
        res.writeHead(200, { "content-type": "text-html" });
        let readStream = fs.createReadStream(__dirname + "/about.html", "utf-8");
        readStream.pipe(res);
    }
    if (req.url === "/" || req.url === "/service") {
        res.writeHead(200, { "content-type": "text-html" });
        let readStream = fs.createReadStream(__dirname + "/service.html", "utf-8");
        readStream.pipe(res);
    }

});

server.listen(9999, () => {

    console.log(`server started on ${host}:${port}`)
});

