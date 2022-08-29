package exercico;

import javax.swing.*;

public class L2Q10 {

    public static void main(String[] args) {
        float conta, contafinal, consumo;
        int classe;
        consumo = Float.parseFloat(JOptionPane.showInputDialog("Informe o Consumo"));
        while (consumo != 0) {
            classe = Integer.parseInt(JOptionPane.showInputDialog("Informe a Classe "));
            if (classe == 1) {
                conta = consumo * 0.5f;
            } else if (classe == 2) {
                conta = consumo * 0.8f;
            } else {
                conta = consumo * 1.0f;
            }
            contafinal = conta + conta * 0.3f;

            JOptionPane.showMessageDialog(null, "Fatura Consumo: R$ " + contafinal);
            consumo = Float.parseFloat(JOptionPane.showInputDialog("Informe o Consumo"));
        }
    }
}
