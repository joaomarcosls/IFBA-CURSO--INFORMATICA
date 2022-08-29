/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercico; 

import javax.swing.*;

public class Q20 {
public static void main(String[] args) {
        float peso, altura, imc ; 
        peso  =Float.parseFloat (JOptionPane.showInputDialog("Informea o seu peso:"));
        altura = Float.parseFloat(JOptionPane.showInputDialog("Informea a sua altura:"));
        imc= peso/(altura*altura);
        if (0 <= imc && imc <=18.5){
         JOptionPane.showMessageDialog(null,  "Sua Classificação: Magreza!");   
        }
        else if (18.5<= imc && imc <=24.9){
            JOptionPane.showMessageDialog(null,  "Sua Classificação: Saudável!"); 
        }
        else if (25 <= imc && imc <=29.9) {
            JOptionPane.showMessageDialog(null,  "Sua Classificação: Sobrepeso!"); 
        }
        else if (30 <= imc && imc <=34.9) {
            JOptionPane.showMessageDialog(null,  "Sua Classificação: Obesidade grau I !"); 
        }
        else if (35 <= imc && imc <=39.9) {
            JOptionPane.showMessageDialog(null,  "Sua Classificação: Obesidade grau II (severa)!"); 
        }
        else{
             JOptionPane.showMessageDialog(null,  "Sua Classificação: Obesidade grau III (mórbida)!");
        }
    }
}