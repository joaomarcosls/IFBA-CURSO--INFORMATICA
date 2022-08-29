/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercico;
import javax.swing.*;
public class Repetição {
    public static void main(String[] args) {
        int n,i, soma=0;
        for (i=1; i<=5; i++){
           n=Integer.parseInt(JOptionPane.showInputDialog("digite o "+i+"º número")) ;
           soma +=n;
        }
         JOptionPane.showMessageDialog(null, "soma: "+soma);
    }
    
}

