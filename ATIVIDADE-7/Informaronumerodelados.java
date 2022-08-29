/*
 Escreva um logaritomo que leia o número de lados e a medida do lado de um poligno regular e, comforme o numero de lados informe:
A se for 3 escrever triângulo e o valor de lados infoeme:

 */
package JMLS;

import javax.swing.*;

public class Informaronumerodelados {

    public static void main(String[] args) {
        int lados;
        float media, perimetro, area;
        String ler;
        ler = JOptionPane.showInputDialog("Informe o número de lados poligono:");
        lados = Integer.parseInt(ler);
        ler = JOptionPane.showInputDialog("Informe a medida dos lados:");
        media = Float.parseFloat(ler);
        switch (lados) {
            case 3:
                JOptionPane.showMessageDialog(null, "Triângulo  \nPerimetro: " + (media * media));
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Quadrado  \nPerimetro: " + (media * media));
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Pentágono  \nPerimetro: " + (media * media));
                break;
            default:

                JOptionPane.showMessageDialog(null, "Poligono não indentificado");

        }
    }
}
