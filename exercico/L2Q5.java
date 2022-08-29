package exercico;

import javax.swing.*;
public class L2Q5 {


    public static void main(String[] args) {
        double media, n, soma = 0, qtd = 0;
        int i;
        n = Double.parseDouble(JOptionPane.showInputDialog("Informe o Primeiro Número "));
        while (n != 0) {
            soma = soma + n;
            n = Double.parseDouble(JOptionPane.showInputDialog("informe Proxímo Número "));
            qtd++;
        }
        media = soma / qtd;

        JOptionPane.showMessageDialog(null, "Média;  " + media);
   
    }

}