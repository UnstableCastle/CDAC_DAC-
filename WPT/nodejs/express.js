

const express = require("express");
const app = express();

app.get("/",(req,res,next)=>{
    //res.send("this is simple get request")
    res.sendFile(__dirname+"/index.html")
});
app.get("/home",(req,res,next)=>{
    // res.send("this is simple get request")
    res.sendFile(__dirname+"/home.html")

});
app.get("/about/:id",(req,res,next)=>{ // parameterized routing
    // res.send("this is simple get request")
    res.sendFile(__dirname+"/about.html")
});
app.get("/about/",(req,res,next)=>{ // non -parameterized routing
    // res.send("this is simple get request")
    res.sendFile(__dirname+"/about.html")
});
app.get("/service",(req,res,next)=>{
    // res.send("this is simple get request")
    res.sendFile(__dirname+"/service.html")
});
app.get("/contact",(req,res,next)=>{
    // res.send("this is simple get request")
    res.sendFile(__dirname+"/contact.html")
});

//wild routing
app.get("/*splat",(req,res,next)=>{
    res.send("404 not found")
});

app.listen(8888,()=>{
    console.log("server gets started");
});

