<html>
    <head>
    </head>
    <body>
     <?php 
   $arquivo= fopen("cliente.txt","w");
 $texto= "Uiviram do Ipiranga as margens pláscidas";
 $texto2= "de um povo heróico um brado retumbante";
 fwrite($arquivo, $texto);
 fwrite($arquivo, $texto2);
   fclose($arquivo)
     ?>
    </body>
</html>