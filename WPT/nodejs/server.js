require('dotenv').config();
const http = require('http');
const fs = require('fs');

let host = process.env.HOST || 'localhost';
let port = process.env.PORT || 9999;

let server = http.createServer((req, res) => {

    if (req.url === "/" || req.url === "/home") {
        res.writeHead(200, { "Content-Type": "text/html" });
        fs.createReadStream(__dirname + "/index.html").pipe(res);
    } 
    else if (req.url === "/about") {
        res.writeHead(200, { "Content-Type": "text/html" });
        fs.createReadStream(__dirname + "/about.html").pipe(res);
    } 
    else if (req.url === "/service") {
        res.writeHead(200, { "Content-Type": "text/html" });
        fs.createReadStream(__dirname + "/service.html").pipe(res);
    } 
    else if (req.url === "/contact") {
        res.writeHead(200, { "Content-Type": "text/html" });
        fs.createReadStream(__dirname + "/contact.html").pipe(res);
    } 
    else {
        res.writeHead(404, { "Content-Type": "text/html" });
        res.end("<h1>404 - Page Not Found</h1>");
    }

});

server.listen(port, host, () => {
    console.log(`Server started on http://${host}:${port}`);
});
