/*
 escreva uma clase em java que leia 4 numeros inteiros e que informe se cada um
numero inteiro lido é multiplo de 11 ou não.

 */
package JMLS;
import javax.swing.*;
public class Lermutiplos {
    public static void main(String[] args) {
        int numero, contador;
        String ler;
        for(contador=1;contador<=4;contador++){
          ler =JOptionPane.showInputDialog("Digite um numero iteiro");
          numero=Integer.parseInt(ler);
          if(numero % 11==0){
              JOptionPane.showMessageDialog(null,numero+"é mútliplo de 11");
            } 
          else {
              JOptionPane.showMessageDialog(null,numero+" NÃO mútliplo de 11");
          } 
        }
            
    }
}
