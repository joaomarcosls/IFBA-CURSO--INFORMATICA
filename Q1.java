/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.*;
/**
 *
 * @author Aluno IFBA
 */
public class Q1 {
    public static void main(String[] args) {
    
    float pressaom, pressaod, diferenca;
   pressaom = Float.parseFloat(JOptionPane.showInputDialog("Pressão de inicial: "));
   pressaod = Float.parseFloat(JOptionPane.showInputDialog("Pressão Desejada: "));
   diferenca=pressaom-pressaod;
   if(diferenca<0){
       JOptionPane.showMessageDialog(null,"Diferença pressão: "+diferenca+"\n NECESSIDADE DE ENCHER PNEU!");
   }
   else if (diferenca==0){
       JOptionPane.showMessageDialog(null,"Diferença pressão: "+diferenca+"\n PRESSÃO IDEAL!");
   }
   else{
     JOptionPane.showMessageDialog(null,"Diferença pressão: "+diferenca+"\n NECESSIDADE DE ESVAZIAMENTO DO PNEU!");  
   }
    }
}