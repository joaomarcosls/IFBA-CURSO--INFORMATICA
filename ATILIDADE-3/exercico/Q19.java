/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercico; 

import javax.swing.*;

public class Q19 {
    public static void main(String[] args) {
        int idade ; 
        idade = Integer.parseInt(JOptionPane.showInputDialog("Informea sua idade:"));
        if (0 <= idade && idade <=15){
         JOptionPane.showMessageDialog(null,  "Você nao pode votar!");   
        }
        else if (18 <= idade && idade <=64){
            JOptionPane.showMessageDialog(null,  "Você e obrigado a votar !"); 
        }
        else {
            JOptionPane.showMessageDialog(null,  "Você decide se quer votar !"); 
        }
        
    }
}

 