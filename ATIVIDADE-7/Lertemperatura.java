
package JMLS;
import javax.swing.*;
/*
 faça um logaritomo que leia 5 temperaturas informadas em graus fhrenheit e as trasforme em graus celsius. A fórmula de conversãoé:c=(f-32)/1.8
 */

/**
 *
 * @author alunoifba2
 */
public class Lertemperatura {
    public static void main(String[] args) {
        int conta;
        float c,f ;
        String ler;
        conta=0;
        while (conta <5){
          ler=JOptionPane.showInputDialog("Digite a temperatura em °F");
          f = Float.parseFloat(ler);
          c = (f-32)/1.8f;
          JOptionPane.showMessageDialog(null, f+" °F  ,  "+c+" ºC");
          conta= conta+1;
        }
        JOptionPane.showMessageDialog(null, "Fim!!!!!!!");
    }
}
