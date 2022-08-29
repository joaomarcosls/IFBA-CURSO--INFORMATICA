<?php
$nome = $_GET["nome"];
$tel = $_GET["telefone"];
$end = $_GET["endereco"];
$cliente = fopen("cliente.txt","a");
fwrite($cliente, $nome. "\r\n".$tel."\r\n".$end);
fclose($cliente)
?>

