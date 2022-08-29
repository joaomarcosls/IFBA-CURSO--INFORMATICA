/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercico;

import javax.swing.*;

public class Q2 {

    public static void main(String[] args) {
        int n1, n2, soma, quadradon1, quadradon2, produto;
        String ler;
        ler = JOptionPane.showInputDialog("Informe o primero numero !!!");
        n1 = Integer.parseInt(ler);
        ler = JOptionPane.showInputDialog("Informe o segundo numero !!!");
        n2 = Integer.parseInt(ler);
        quadradon1 = n1 * n1;
        quadradon2 = n2 * n2;
        soma = n1 + n2;
        produto = n1 * quadradon2;
        JOptionPane.showMessageDialog(null, 
                "Primeiro Valor:  " + n1 + 
                "\n Segundo Valor:  " + n2+
                 "\n Soma dos valores:  " + soma+
                 "\n O primeiro numero pelo Quadrado Segundo :  " + produto+
                 "\n Quadrado do Segundo Numero: " + quadradon1);
    }
}
