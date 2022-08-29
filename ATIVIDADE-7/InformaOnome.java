/*
 CAlcule a idade de uma pessoa e partir da leitura do nao de nacimento e ano atual
 */
package JMLS;
import javax.swing.JOptionPane;
/**
 *
 * @author alunoifba2
 */
public class InformaOnome {
    public static void main(String[] args) {
        String nome, auxiliar;
        int idade, ano, nacimento;
        nome= JOptionPane.showInputDialog("Digite o seu nome");
        auxiliar=JOptionPane.showInputDialog("Digite o Ano atual");
        
        ano= Integer.parseInt(auxiliar);
        auxiliar=JOptionPane.showInputDialog("Digite o Ano nacimento");
        nacimento= Integer.parseInt(auxiliar);
        idade= ano-nacimento;
        JOptionPane.showMessageDialog(null,nome+",sua idade é "+idade);
    }
    
}
