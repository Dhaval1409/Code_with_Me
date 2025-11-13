const express = require('express');
const mysql = require("mysql2");

const app = express();

const db = mysql.CreateConnection({
    host : "localhost",
    user : "root",
    password : "",
    database : "p^"
});

app.get("/user",(req,res)=>{
    const sql = Select * from users;
    db.query(sql,(err,result)=>{
        if(err){
            console.log(err);
        }else{
            res.json(result);
        }
    })

})

app.listen(3000,()=>{
    console.log("server is running on port 3000");
})