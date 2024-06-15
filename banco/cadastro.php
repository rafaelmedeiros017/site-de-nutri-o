<?php
$localhost="localhost";
$user = "root";
$passow= "";
$banco="nutribem";

$conecta = sysqli_connect($localhost,$user,$passow,$banco);
$sql= mysqli_query($conecta,"SELECT * FROM usuários");

echo "existem" mysqli_num_rows()"registros";
?>