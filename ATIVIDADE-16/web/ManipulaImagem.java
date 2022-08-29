import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ManipulaImagem {

    public static void main(String[] args) throws IOException {
        String imagem = "C:/Users/asus/Desktop/pd/bola.jpg";
        ManipulaImagem mi = new ManipulaImagem();
        byte[] retornoMetodo = mi.deImagemParaArray(imagem);
        mi.deArrayParaImagem(retornoMetodo);
    }

    public byte[] deImagemParaArray(String caminhoImagem) throws IOException {
        BufferedImage imagem = ImageIO.read(new File(caminhoImagem));   // crio a imagem
        ByteArrayOutputStream baos = new ByteArrayOutputStream();   // crio um OS de array de bytes
        ImageIO.write(imagem, "jpg", baos);   // Uso o write pra escrever os dados da imagem no OS do array de bytes
        return baos.toByteArray();    // pego o array de bytes
    }

    public void deArrayParaImagem(byte[] arr) throws IOException {
        //colocar aqui o código que transforma de array de bytes para imagem
        byte[] imgBytes = arr;
        FileOutputStream fos = new FileOutputStream("C:/Users/asus/Desktop/pd/bola2.jpg");
        fos.write(imgBytes);
        FileDescriptor fd = fos.getFD();
        fos.flush();
        fd.sync();
        fos.close();
    }
}