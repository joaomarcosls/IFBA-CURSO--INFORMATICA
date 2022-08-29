/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercico;
import javax.swing.*;

public class Q4 {
    public static void main(String[] args) {
       int f,c;
       f= Integer.parseInt(JOptionPane.showInputDialog("Informea a quantidade de Fahrenheit!"));
       c=(f-32)*5/9;
       JOptionPane.showMessageDialog(null,  "Quantidade de Fahrenheit a ser convertida e Graus Celsius:  "+f+
               "\n Total em Graus Celsius:  "+c );
    }
}
