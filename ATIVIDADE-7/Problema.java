/*
 escrva uma clase em java que leia o sexo (Caracteres) e a idade (inteira)de uam pessoa 
 */
package JMLS;
import javax.swing.*;
public class Problema {
    public static void main(String[] args) {
        String ler; 
        int idade; 
        char sexo;
        ler=JOptionPane.showInputDialog ("Digite o codio do idade");
        idade= Integer.parseInt(ler);
        ler=JOptionPane.showInputDialog("Digite o código do sexo M ou F");
        sexo=ler.charAt(0);
         if((idade<25)&&(sexo=='F')||(sexo=='f')){
         JOptionPane.showMessageDialog(null,"Idade= "+idade+"-aceita ");
         }
     
      
    }
}
