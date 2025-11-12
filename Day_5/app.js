const express = require('express');
const app = express();
const mysql = require('mysql');
const conn = mysql.createConnection({
    host: 'localhost',
    user: 'root',
    password: '',
    database: 'nodejs'
})
conn.connect((err)=>{
    if(err) throw err;
    console.log("database connected");
})

const insertQuery = "INSERT INTO `users`(`name`, `email`, `password`) VALUES ('siddharth','siddharth@123','123456')";
const updateQuery = "UPDATE `users` SET `name` = 'siddharth' WHERE `users`.`id` = 1";
const DeleteQuery = "DELETE FROM `users` WHERE `users`.`id` = 1";
const Data = //optional

conn.query(insertQuery,Data,(err,result)=>{
    if(err) throw err;
    console.log(result);
})

conn.query(updateQuery,(err,result)=>{
    if(err) throw err;
    console.log(result);
})

conn.query(DeleteQuery,(err,result)=>{
    if(err) throw err;
    console.log(result);
})

app.get("/",(req,res)=>{
res.send("hello world");
})
app.listen(3000,()=>{
console.log("server started");
})