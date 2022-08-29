/*

 */
package JMLS;
import javax.swing.JOptionPane;
public class TestaParInpa {
   public static void main(String[] args) {
        int numero, resto;
        String leitura;
        leitura= JOptionPane.showInputDialog("Digite um Número inteiro ");
        numero= Integer.parseInt(leitura);
        resto= numero%2;
        if(resto==0){
            JOptionPane.showMessageDialog(null,numero + " é par");
                }
        else{JOptionPane.showMessageDialog(null,numero + " é inpar");}
        }
        } 

