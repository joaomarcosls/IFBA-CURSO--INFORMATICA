/*
 João Marcos Lacerda Dos Santos: marcoslacerda99@hotmail.com / marcoslacerda99.jmls@gmail.com
Carlos Eduardo Da Silva Oliveira: excavi.sk3@gmail.com
Claudio Custodio Da Silva Junior: claudiojunior1@outlook.com.br
 */
package carloseduardojoaomarcosclaudio;

import javax.swing.JOptionPane;

public class CJC1 {

    public static void main(String[] args) {
        int numeros, maior = 0, menor = 0, contador, vezes;
        String ler;
        contador = 0;
        ler = JOptionPane.showInputDialog("Digite quantas vezes!!");
        vezes = Integer.parseInt(ler);

        while (contador < vezes) {
            contador = contador + 1;
            ler = JOptionPane.showInputDialog("Digite os números Inteiros!!");
            numeros = Integer.parseInt(ler);

            if (numeros > maior) {
                maior = numeros;
            }
            menor = maior;
            if (numeros < menor) {
                menor = numeros;
            }

        }
        JOptionPane.showMessageDialog(null, "menor= " + menor + " maior= " + maior);
    }
}
