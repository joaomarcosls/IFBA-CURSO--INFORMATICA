<?php
$nome=$_POST["nome"];
$curso= $_POST["curso"];
$tipo_foto= $_FILES["foto"]["type"];
$nome_foto= $_FILES["foto"]["name"];
$tamanho_foto= $_FILES["foto"]["size"];
$temporario_foto= $_FILES["foto"]["tmp_name"];
$diretorio_imagem_produtos = "C:/wamp/www/Aula de criar formulario/fotos/";
move_uploaded_file($temporario_foto, $diretorio_imagem_produtos . $nome_foto);


print $tipo_foto. "</br>";
print $nome_foto. "</br>";
print $tamanho_foto. "</br>";
print $temporario_foto. "</br>";
$arquivo= fopen("clientes.txt","a");
$linha= $nome. "**". $curso."**".$diretorio_imagem_produtos. $nome_foto."\r\n";
fwrite($arquivo, $linha);
fclose($arquivo);


?>