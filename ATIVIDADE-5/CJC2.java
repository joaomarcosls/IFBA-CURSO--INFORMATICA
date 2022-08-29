/*
João Marcos Lacerda Dos Santos: marcoslacerda99@hotmail.com / marcoslacerda99.jmls@gmail.com
Carlos Eduardo Da Silva Oliveira: excavi.sk3@gmail.com
Claudio Custodio Da Silva Junior: claudiojunior1@outlook.com.br
 */
package carloseduardojoaomarcosclaudio;

import javax.swing.*;

public class CJC2 {

    public static void main(String[] args) {
        String ler;
        int paes, broas;
        float total, poupança;
        ler = JOptionPane.showInputDialog("Digite a quantidade de pães: ");
        paes = Integer.parseInt(ler);
        ler = JOptionPane.showInputDialog("Digite a quantidade de broas: ");
        broas = Integer.parseInt(ler);
        total = 0.12f * paes + 1.50f * broas;
        poupança = total * 0.1f;
        JOptionPane.showMessageDialog(null, "A quantidade arrecadada hoje é de R$" + total + "\nO valor que você guardará na poupança será de R$" + poupança);

    }

}
