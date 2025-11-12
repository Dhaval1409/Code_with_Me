const express = require('express');
const mongoose = require('mongoose');

app.use = express.json();

mongoose.connect("mongodb//120120/db")
.then(()=>{
    console.log("database connected")
})

const app = express();
app.get('/',(req,res)=>{
    console,log("hello")
}) 

const userSchema = new mongoose.Schema({
  name: String,
  age: Number,
  email: String
});

const User = mongoose.model("User", userSchema);

app.listen(3000,(req,res)=>{
    console.log("server is running on port 3000")
});