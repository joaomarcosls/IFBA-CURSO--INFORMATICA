<html>
<head>
<meta http-equiv="Content-Type" charset="utf-8"/>
</head>
<body>
<?php
$arquivo = fopen("clientes.txt","r");
print "<table border='2'>";
while (!feof($arquivo)){
$linha =fgets($arquivo);
$partes=explode("**", $linha);
$img =" <img src='".$partes[2]."' width='50' height='50'></img>";
print $linha."<br/>";
print "<tr>";
print "<td>". $partes[0] . "</td>" ."<td>". $partes[1] . "</td>"."<td>". $img . "</td>";
print "</tr>";
}
print "</table>";
fclose($arquivo);
?>
