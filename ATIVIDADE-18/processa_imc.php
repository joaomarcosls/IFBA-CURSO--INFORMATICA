<?php
$a= $_GET["altura"];
$p= $_GET["peso"];
$imc=$p/$a*$a;
if ($imc <20){
    print"Você está com subpeso";
}
 elseif ($imc<25) {
    print "Você está com o pesso normal";
}
 else {
    
    print "você está com sobrepeso";
    
 }
?>


