<?php
if(isset($_POST[email]) && !empty($_POST['email']) && isset($_POST['senha']) && !empty($_POST['senha'])){

require 'cadastro2.php';
require 'usuario.class.php'
$u =new usuario();

$email=addslashes$_POST['email'];
$senha=addslasches $_POST['senha'];
$u->login($email,$senha == true);
if(isset($_SESSION['iduser'])){
    header("location:nutribem.php")

}
}else{
 header("location: login.php");
}