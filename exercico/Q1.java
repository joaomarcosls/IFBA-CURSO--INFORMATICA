/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercico;

import javax.swing.*;


public class Q1 {

    public static void main(String[] args) {
        int metros, decimetros, centimetros, milimetros;
        
         metros = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor em metros para ser convertido!!!!"));
        
        decimetros = metros * 10;
        centimetros = metros * 100;
        milimetros = metros * 1000;
        JOptionPane.showMessageDialog(null, "valor a ser convertido:  " + metros
                + "\n Convertido em Decímetros:  " + decimetros
                + "\n Convertido em Centímetros:  " + centimetros
                + "\n Convertido em Milímetros : " + milimetros);
        
    }
}
