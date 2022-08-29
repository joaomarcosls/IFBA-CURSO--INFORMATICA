/*
 Lê e soma dois números inteiros 
 */
package JMLS;
import javax.swing.JOptionPane;

/**
 *
 * @author alunoifba2
 */ 

public class Soma2 {
    public static void main(String[] args) {
       int n1, n2, soma;
       String auxiliar;
       auxiliar= JOptionPane.showInputDialog("Digite um numero inteiro");
       n1= Integer.parseInt(auxiliar);
       auxiliar= JOptionPane.showInputDialog("Digite outro número inteiro");
       n2= Integer.parseInt(auxiliar);
       soma= n1+n2;
       JOptionPane.showMessageDialog(null,n1+"+"+n2+"="+soma);
    }
    
}
