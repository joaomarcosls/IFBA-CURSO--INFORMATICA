<?php
	$nome = $_GET["nome"];
	$email = $_GET["email"];
	$sexo = $_GET["sexo"];
	$cpf = $_GET["cpf"];
	$endereco = $_GET["endereco"];
	$cep = $_GET["cep"];
	$uf = $_GET["uf"];
	$nasc = $_GET["datanasc"];
	$login = $_GET["login"];
	$senha = $_GET["senha"];
	$repsenha = $_GET["repsenha"];
	$conexao = mysqli_connect("localhost", "ivobarbosa", "dedsec00", "projetoweb2");
	
	$comando = "INSERT INTO cad_cliente (nome, email, sexo, cpf, endereco, cep, uf, datanasc, login, senha, repsenha) VALUES (\"".$nome."\",\"".$email."\",\"".$sexo."\",\"".$cpf."\",\"".$endereco."\",\"".$cep."\",\"".$uf."\",\"".$nasc."\",\"".$login."\",\"".$senha."\",\"".$repsenha."\");";
	//$comando = "INSERT INTO cliente (nome, email, cpf, data_nascimento, peso, dependentes, sexo) VALUES (\"Ivo\",\"ivo.barbosa@live.com\",\"03310781550\",\"1988-08-12\", 85.5, 0, \"M\")";
	
	mysqli_query ($conexao, $comando);
	mysqli_close ($conexao);
	
	//echo $comando;
?>

