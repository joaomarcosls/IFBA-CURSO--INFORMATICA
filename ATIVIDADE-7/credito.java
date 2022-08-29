/*
 
 */
package JMLS;

import javax.swing.*;

public class credito {

    public static void main(String[] args) {
        float smedio, credito;
        String auxiliar;
        char classe;
        auxiliar = JOptionPane.showInputDialog("Digite a classe sujeito: (Z/C/B/A)");
        classe = auxiliar.charAt(0);
        auxiliar = JOptionPane.showInputDialog("Digite o valor so salario medio)");
        smedio = Float.parseFloat(auxiliar);
        switch (classe) {
            case 'Z':
            case 'z':
                credito = 0f;
                break;
            case 'C':
            case 'c':
                credito = 0.2f * smedio;
                break;
            case 'B':
            case 'b':
                credito = 0.3f * smedio;
                break;
            case 'A':
            case 'a':
                credito = 0.4f * smedio;
                break;
            default:
                credito = 0f;
                JOptionPane.showMessageDialog(null, "Clase invalida: )" + classe);
        }
        JOptionPane.showMessageDialog(null, "Salario Médio: " + smedio + "\nClasse: "+classe+ "\nCrédito:" +credito);
    }

}

