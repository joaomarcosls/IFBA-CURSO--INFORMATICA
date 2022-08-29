package web;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import javax.imageio.ImageIO;

/**
 *
 * @author Alex
 */
public class udp {
    public static void main(String[] args) throws Exception {
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        String texto = teclado.readLine();
        //String textoMaiusculo = texto.toUpperCase();
        
        DatagramSocket tomada = new DatagramSocket();
   
        byte[] carta = new byte[1024];
       // byte [] conteudoEmBytes = texto.getBytes();
        carta = deImagemParaArray("C:\\Users\\Aluno\\Desktop\\bola.jpg");
        DatagramPacket envelope = new DatagramPacket(carta, carta.length, InetAddress.getByName("10.12.3.6"), 1000);
    //    DatagramPacket envelope1 = new DatagramPacket(carta, carta.length, InetAddress.getByName("10.12.0.132"), 1000);
        tomada.send(envelope);
     //   tomada.send(envelope1);
        //String textoMaiusculo = texto.toUpperCase();
        //System.out.println(textoMaiusculo);
    //    byte[] bytes = Files.readAllBytes(Paths.get("deImagemParaArray"));
    }
         
    public static byte[] deImagemParaArray(String caminhoImagem) throws IOException {
        BufferedImage imagem = ImageIO.read(new File(caminhoImagem));   // crio a imagem
        ByteArrayOutputStream baos = new ByteArrayOutputStream();   // crio um OS de array de bytes
        ImageIO.write(imagem, "jpg", baos);   // Uso o write pra escrever os dados da imagem no OS do array de bytes       
        return baos.toByteArray();    // pego o array de bytes       
    }
    
}
