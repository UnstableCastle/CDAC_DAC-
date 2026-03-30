//
// 
//  require('dotenv').config();
// const express = require('express');
// const path = require('path');
// const app = express();



// let host = process.env.HOST;
// let port = process.env.PORT;

// let staticFilePath = path.join(__dirname,"/public");
// app.use(express.static(staticFilePath));


// app.get("/home",(req,res,next)=>{
//     res.send("get  req for /home ");
// });
// app.get("/about",(req,res,next)=>{
//     res.send("get  req for /about ");
// });
// app.get("/service",(req,res,next)=>{
//     res.send("get  req for /service ");
// });
// app.get("/contact",(req,res,next)=>{
//     res.send("get  req for /contact ");
// });
// app.get("/*splat",(req,res,next)=>{
//     res.send("404 not found")
// });

// app.listen(port,()=>{
//     console.log(`my webserver got started on ${host}:${port}`);
// });


///
// ----------hbs---------------------

const hbs = require("hbs");
const express = require("express");
const app = express();
const path = require("path");

let host = process.env.HOST || "localhost";
let port = process.env.PORT || 8888;

let viewPath = (path.join(__dirname, "templates/views"));



app.set("view engine", "hbs");

app.set("views", path.join(__dirname, "templates", "views"));

app.use(express.static(path.join(__dirname, "templates/templates")));

// Routes
app.get("/", (req, res) => {  
  res.render("index");
});

app.get("/home", (req, res) => {
  res.render("index");
});

app.get("/about", (req, res) => {
  res.render("about");
});

app.get("/service", (req, res) => {
  res.render("service");
});

app.get("/contact", (req, res) => {
  res.render("contact");
});

// 404 (must be last)
app.use((req, res) => {
  res.status(404).render("error_404");
});

// Server
app.listen(port, () => {
  console.log(`my webserver get started on http://${host}:${port}`);
});
