/* Aluno: Raphael Santos França Oliveira
 * Matricula: 2018219025
 * Curso: Bacharelado em Sistemas de Informação.
 * Disciplina: Linguagem de Programação 1
 *
 * 2. Crie uma classe chamada Relógio para armazenar um horário, composto por hora, minuto e segundo. A
 * classe deve representar esses componentes de horário e deve apresentar os métodos descritos a seguir:
 * 2.1. um método chamado setHora, que deve receber o horário desejado por parâmetro (hora, minuto e
 * segundo);
 * 2.2. um método chamado getHora para retornar o horário atual, através de 3 variáveis passadas por
 * referência;
 * 2.3. um método para avançar o horário para o próximo segundo (lembre-se de atualizar o minuto e a
 * hora, quando for o caso).
 */
package atividade3;

public class main02 {
    public static void main(String[] args) {
        relogio r = new relogio();
        r.setHora(16, 20, 59);
        r.imprimir();
        r.passar();
        r.imprimir();
    }
}
