<html>
    <head>
    </head>
    <body>
     <?php 
   $arquivo= fopen("cliente.txt","r");
   while (!feof($arquivo)){
       echo fgetc($arquivo) . "<br>";
   }
   fclose($arquivo)
     ?>
    </body>
</html>