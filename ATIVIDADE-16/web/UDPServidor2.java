import java.io.*;
import java.net.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class UDPServidor2 {

	public static void main(String args[]) throws Exception { 
		//***RECEPÇÃO DE DADOS PELA REDE***//
		//Cria uma tomada servidora registrada perante o SO na porta 1000
		DatagramSocket tomada = new DatagramSocket(1000);
		//carta que contem o array de bytes que guardará os dados recebidos
		byte[] cartaRecebida = new byte[20000];
		//envelope que contem o array de bytes que guardará os dados recebidos
		DatagramPacket envelopeRecebido = new DatagramPacket(cartaRecebida, cartaRecebida.length);
		//preenchendo o array de dados com os dados recebidos pela rede
		tomada.receive(envelopeRecebido);
		byte[] conteudo = envelopeRecebido.getData();
		//cria a imagem a partir do array recebido
		deArrayParaImagem(conteudo);
	}
	
	//Converte um array de bytes em uma imagem
	public static void deArrayParaImagem(byte[] arr) throws IOException {
		//colocar aqui o código que transforma de array de bytes para imagem
        byte[] imgBytes = arr;
        FileOutputStream fos = new FileOutputStream("C:\\Users\\Aluno\\Desktop\\bola2.jpg");
        fos.write(imgBytes);
        FileDescriptor fd = fos.getFD();
        fos.flush();
        fd.sync();
        fos.close();
    }
}