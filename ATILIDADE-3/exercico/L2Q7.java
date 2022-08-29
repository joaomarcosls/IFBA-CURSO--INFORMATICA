package exercico;

import javax.swing.*;

public class L2Q7 {

    public static void main(String[] args) {
        double media, somai = 0, qtd = 0, resto, somap = 0;
        int n;
        n = Integer.parseInt(JOptionPane.showInputDialog("Informe o Primeiro Número "));
        while (n != 0) {
           resto = n % 2;
            if (resto == 0) {
                somap = somap + n;
            } else {
                somai = somai + n;
                qtd++;
            }
            n = Integer.parseInt(JOptionPane.showInputDialog("informe Proxímo Número "));
        }
        media = somai / qtd;

        JOptionPane.showMessageDialog(null, "Média: " + media + "\nSoma dos Numeros pares: " + somap);

    }

}
