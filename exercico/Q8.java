/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercico;
import javax.swing.*;
public class Q8 {
    public static void main(String[] args) {        
        int nascimento, idade, ano;
        
        nascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua data de nascimento!!"));
        ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual!!!"));
        
        idade = ano - nascimento;
        
        if (0 <= idade && idade <=11){
            JOptionPane.showMessageDialog(null, "Você é uma criança!");
        }
        else if (12 <= idade && idade <= 17){
            JOptionPane.showMessageDialog(null, "Você é um adolescente!");
        }
        else if (18 <= idade && idade <= 64){
            JOptionPane.showMessageDialog(null, "Você é um adulto!");
        }
        else{
            JOptionPane.showMessageDialog(null, "Você é um idoso!");
        }        
        
    }
}
