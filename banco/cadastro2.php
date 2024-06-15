<?php
session_start();
$localhost="localhost";
$user = "root";
$passow= "";
$banco="nutribem";
global $pdo;
try{
    $pdo = new pdo("mysql:dbname=".$banco."; host=".$localhost,$user,$passow);
    $pdo->setattribute(pdo::ATTR_ERRMODE, pdo:: ERRMODE_EXCEPTION);
}catch{PDOExeption $e}{
echo"ERRO:".$e-> getMessage();
}

 


?>