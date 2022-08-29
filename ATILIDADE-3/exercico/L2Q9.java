/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercico;

import javax.swing.*;

public class L2Q9 {

    public static void main(String[] args) {
        int alunos, i ;
        float media, f=0, indice,qtd=0;
        alunos = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de alunos!"));
        for (i = 1; i <= alunos; i++) {
            media = Float.parseFloat(JOptionPane.showInputDialog("Informe a Média do "+i+"° aluno!"));
             if(media>=6){
              f +=media; 
              qtd++;
               }                      
        }
         indice= (qtd/alunos)*100;
        JOptionPane.showMessageDialog(null,"Quantidade de alunos aprovados: "+qtd+"\n Índice de aprovação da Sala: "+indice+"%");
    }
}
