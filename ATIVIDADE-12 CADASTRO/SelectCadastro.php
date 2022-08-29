<?php
	$conexao = mysqli_connect("localhost", "ivobarbosa", "dedsec00", "projetoweb2");
	if(!$conexao) {
		die('Could not connect: ' .mysqli_error());
	} else {	
		mysqli_select_db($conexao, "projetoweb2");
		$result = mysqli_query($conexao, 'SELECT * FROM cad_cliente');
		$valores = array();
		while ($row = mysqli_fetch_array($result, MYSQLI_NUM)){
			$valores[] = $row;
		}
				echo '<p style="background:#D3CDBB;" align="center"><font size="3" face="Verdana">RELAÇÃO DE CLIENTES</font></p>';
		foreach ($valores as $linha){
				echo "<table border='1' style='background:#D4CDBB'><font size='2' face='Calibri'>";
				echo "<tr>";
				echo "<td> Nome: $linha[0] </td>" . "<td> E-mail: $linha[1] </td>" . "<td> Sexo: $linha[2] </td>" . "<td> Endereço: $linha[3]</td>" . "<td> CEP: $linha[4] </td>" . "<td> UF: $linha[5] </td>" . "<td> Login: $linha[6] </td>" . "<td> Senha: $linha[7] </td>" . "<td> Rep. Senha: $linha[8] </td>" . "<td> Data Nasc: $linha[9] </td>" . "<br>";
		}		echo "</tr>";
		mysqli_close ($conexao);
	}
?>