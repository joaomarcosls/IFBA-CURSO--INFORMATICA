/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JMLS;
import javax.swing.JOptionPane;
/**
 *
 * @author alunoifba2
 */
public class Programazeca {
     public static void main(String[] args) {
        float despesa, zeca, zico, zezao, zoiao;
        String auxiliar;
        auxiliar= JOptionPane.showInputDialog("Informe a despesa dos quatro amigos");
        despesa= Float.parseFloat(auxiliar);
        zoiao= despesa/ 2;
        zezao= despesa/4;
        zico= despesa*0.1f;
        zeca=despesa-zoiao-zezao-zico;
        JOptionPane.showMessageDialog(null,"despesa total = "+despesa+"\nZoião = "+zoiao+
                "\nZezão = "+zezao+"\nZico = "+zico+"\nZeca = "+zeca);
    }
           
}
