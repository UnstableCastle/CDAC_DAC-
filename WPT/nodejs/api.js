//server using express 
//create read put request using express js
// 
//  const express = require("express");
// const app = express();

// app.get("/", (req, res, next) => {
//     res.send("this is simple get request");
// });

// app.delete("/", (req, res, next) => {
//     res.send("this is simple delete request");
// });

// app.post("/", (req, res, next) => {
//     res.send("this is simple post request");
// });

// app.put("/", (req, res, next) => {
//     res.send("this is simple put request");
// });

// app.listen(4444, () => {
//     console.log("api server got started on port 4444");
// });

const express = require("express");
const app = express();

app.get("/product", (req, res, next) => {
    res.send(`this is simple get request for ${req.url}`);
});

app.delete("/product", (req, res, next) => {
    res.send(`this is simple get request for ${req.url}`);
});

app.post("/product", (req, res, next) => {
    res.send(`this is simple get request for ${req.url}`);
});

app.put("/product", (req, res, next) => {
    res.send(`this is simple get request for ${req.url}`);
});

app.listen(4444, () => {
    console.log("api server got started on port 4444");
});