// const http = require('http');

// let server = http.createServer((req, res) => {
//     res.setHeader('Content-Type', 'text/plain');

//     if (req.url === "/") {
//         res.write("This is the Home Page");
//     } else if (req.url === "/about") {
//         res.write("This is the About Page");
//     } else if (req.url === "/service") {
//         res.write("This is the Service Page");
//     } else {
//         res.statusCode = 404;
//         res.write("404: Page Not Found");
//     }

//     res.end();
// });

// server.listen(9999, () => {
//     console.log("Server started on http://localhost:9999");
// }); ..........................................................................................server
//=============================================================================================================================
require("dotenv").config();
const http = require('http'); // Removed the duplicate line

// Fallback values are great practice in case .env is missing
const host = process.env.HOST || 'localhost';
const port = process.env.PORT || 3000;

const server = http.createServer((req, res) => {
    res.setHeader('Content-Type', 'text/plain');

    if (req.url === "/") {
        res.end("This is the Home Page");
    } else if (req.url === "/about") {
        res.end("This is the About Page");
    } else if (req.url === "/service") {
        res.end("This is the Service Page");
    } else {
        res.statusCode = 404;
        res.end("404: Page Not Found");
    }
});

server.listen(port, host, () => {
    console.log(`Server started on http://${host}:${port}`);
});