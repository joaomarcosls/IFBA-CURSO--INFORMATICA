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

public class relogio {
    private int hora;
    private int minuto;
    private int segundo;
    
    public void setHora(int hr, int min, int seg){
        hora = hr;
        minuto = min;
        segundo = seg;
        
        if(segundo<60 && minuto<60 && hora<24){
            this.hora = hr;
            this.minuto = min;
            this.segundo = seg;
        }
        else{
            System.out.println("Dados inválidos");
        }
    }
    public String getHora(){
        return this.hora+ ":" +this.minuto+ ":" +this.segundo;
    }
    public void imprimir(){
        System.out.println("O horario é : "+this.getHora());
    }
    public void passar(){
        segundo++;
        if(segundo>59){
            segundo = 0;
            minuto++;
        }
        if(minuto>59){
            minuto = 0;
            hora++;
        }
        if(hora>23){
            hora = 0;
        }
    }
}
