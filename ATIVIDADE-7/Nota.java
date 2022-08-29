/*
Lê duas notas de um aluno, calcula a média e informa se foi aprovado ou não  
 */
package JMLS;
import javax.swing.*;
public class Nota {
    public static void main(String[] args) {
        float n1, n2, media;
        String texto;
        texto= JOptionPane.showInputDialog("Digite a primeita nota");
        n1= Float.parseFloat (texto);
        texto= JOptionPane.showInputDialog("Digite a segunda nota");
        n2= Float.parseFloat (texto);
        media= (n1+n2)/2;
        if(media>=6){
            JOptionPane.showMessageDialog(null,"média = "+media+" - Aprovado");
             }
        else{
          JOptionPane.showMessageDialog(null,"média = "+media+" - Reprovado");  
        }
                
    }
}
