import java.io.*;
import java.net.*;

public class UDPServidor {

	public static void main(String args[]) throws Exception { 
		//recepção dos dados da rede
		DatagramSocket tomada = new DatagramSocket(1000);
		
		byte[] cartaRecebida = new byte[1024];
		DatagramPacket envelopeRecebido = new DatagramPacket(cartaRecebida, cartaRecebida.length);
		tomada.receive(envelopeRecebido);
		byte[] conteudo = envelopeRecebido.getData();
		String texto = new String(conteudo);
		
		//processamento do servidor
		String textoMaiusculo = texto.toUpperCase();
		
		          System.out.println(textoMaiusculo);
	}
}