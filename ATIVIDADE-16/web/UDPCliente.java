import java.io.*;
import java.net.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class UDPCliente {
	public static void main(String[] args ) throws Exception {
		//***OBTENÇÃO DA IMAGEM***//
		//url da imagem
		String imagem = "C:\\Users\\Aluno\\Desktop\\bola.jpg";
		//chamada do metodo que converte a imagem em um array de bytes
        byte[] imagemComoArray = deImagemParaArray(imagem);

		//***ENVIO DOS DADOS PELA REDE***//
		byte[] carta = imagemComoArray;	
		//criacao do envelope com dados, tamanhos dos dados 
		//e endereço e porta de destino
		DatagramPacket envelope1 = new DatagramPacket(carta,carta.length, InetAddress.getByName("10.12.0.45"),1000);		
		//criacao da tomada para enviar e receber dados pela rede
		DatagramSocket tomada = new DatagramSocket();
		//envia o envelope pela rede
		tomada.send(envelope1);
		
		//desativa a tomada, impedindo seu uso futuro		
		tomada.close(); 
	}
	
	//Metodo que transforma uma imagem jpg em um array de bytes
	public static byte[] deImagemParaArray(String caminhoImagem) throws IOException {
        // crio a imagem
		BufferedImage imagem = ImageIO.read(new File(caminhoImagem));   
        // crio um OutputStream de array de bytes
		ByteArrayOutputStream baos = new ByteArrayOutputStream();   
        // Uso o write pra escrever os dados da imagem no OutputStream do array de bytes
		ImageIO.write(imagem, "jpg", baos);   
        // retorno o array de bytes
		return baos.toByteArray();    
    }
}