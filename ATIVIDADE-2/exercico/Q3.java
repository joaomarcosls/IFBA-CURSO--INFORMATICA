/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercico;
import javax.swing.*;

public class Q3 {
    public static void main(String[] args) {
        float horas, calculo, minutos ;
        horas= Integer.parseInt(JOptionPane.showInputDialog("Informe a Hora desejado!"));
        minutos= Integer.parseInt(JOptionPane.showInputDialog("Informe os minutos desejado!"));
        calculo= horas*60+minutos;
        JOptionPane.showMessageDialog(null,  "total de minutos:  "+calculo ); 
                
    }
}
