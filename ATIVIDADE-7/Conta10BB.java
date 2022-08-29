/*
 
 */
package JMLS;

import javax.swing.*;

/**
 *
 * @author alunoifba2
 */
public class Conta10BB {

    public static void main(String[] args) {
        int contador ;
        String linha="" ;
        contador = 0;
        while (contador < 10) {
            contador = contador + 1;
            if(contador < 10){
            linha= linha + contador + "," ; 
            } 
            else {
                linha = linha + contador;
            }
        }
         
        JOptionPane.showMessageDialog(null,linha);
    }

}
