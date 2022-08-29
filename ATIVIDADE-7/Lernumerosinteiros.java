/*
 
 */
package JMLS;

import javax.swing.JOptionPane;

/**
 *
 * @author alunoifba2
 */
public class Lernumerosinteiros {

    public static void main(String[] args) {
        int numero, resto, n, cont;
        String ler;
        ler = JOptionPane.showInputDialog("Digite quantos números vai processar:");
        n = Integer.parseInt(ler);
        cont = 0;
        while (cont < n) {
            ler = JOptionPane.showInputDialog("Digite um Número inteiro:");
            numero = Integer.parseInt(ler);
            resto = numero % 2;// isso éo resto da divisão por 2  
            if (resto == 0) {
                
                    JOptionPane.showMessageDialog(null, "O número " + numero + " é par");
                }
                else {
               
                    JOptionPane.showMessageDialog(null, "O número "+numero+" é impar");
                }
           cont= cont + 1;
        }
            
        }

    }

