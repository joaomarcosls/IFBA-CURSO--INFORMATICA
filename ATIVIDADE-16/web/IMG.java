/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import javax.imageio.ImageIO;

/**
 *
 * @author Aluno
 */
public class IMG {

    public static void main(String[] args) throws IOException {
        String caminhoImagem = "C:\\Users\\Aluno\\Desktop\\bola.jpg";
        IMG mi = new IMG();
        byte[] retornoMetodo = mi.deImagemParaArray(caminhoImagem);
        mi.deArrayParaImagem(retornoMetodo);
     }      public byte[] deImagemParaArray(String caminhoImagem) throws IOException {
        BufferedImage imagem = ImageIO.read(new File(caminhoImagem));   // crio a imagem
        ByteArrayOutputStream baos = new ByteArrayOutputStream();   // crio um OS de array de bytes
        ImageIO.write(imagem, "jpg", baos);   // Uso o write pra escrever os dados da imagem no OS do array de bytes
        
        
        
        return baos.toByteArray();    // pego o array de bytes

       
        
    }
      public byte[] deImagemParaArray(String caminhoImagem) throws IOException {
        BufferedImage imagem = ImageIO.read(new File(caminhoImagem));   // crio a imagem
        ByteArrayOutputStream baos = new ByteArrayOutputStream();   // crio um OS de array de bytes
        ImageIO.write(imagem, "jpg", baos);   // Uso o write pra escrever os dados da imagem no OS do array de bytes
        
        
        
        return baos.toByteArray();    // pego o array de bytes

       
        
    }
    
   
        
    }

 
