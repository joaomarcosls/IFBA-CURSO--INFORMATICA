/* Aluno: Raphael Santos França Oliveira
 * Matricula: 2018219025
 * Curso: Bacharelado em Sistemas de Informação.
 * Disciplina: Linguagem de Programação 1
 *
 * 1. Definir uma classe que represente um círculo. Atributos: raio, área, diametro, circunferencia. Esta classe
 * deve possuir métodos Privados para:
 * 1.1. calcular a área do círculo (A=π*r2)
 * 1.2. calcular o diâmetro do círculo (d=2r)
 * 1.3. calcular a circunferência do círculo (C=πd)
 * E métodos Públicos para:
 * 1.4. Definir o construtor recebendo o raio do círculo e utilizar as funções privadas para iniciar os demais
 * valores
 * 1.5. imprimir o valor do raio e diâmetro;
 * 1.6. imprimir a área do círculo
 */
package atividade3;

import java.util.Scanner;

public class circulo {
   Scanner leia = new Scanner(System.in);
   private double raio, area, diametro, circunferencia;
    
    
    public double calcularArea(){
        area = 3.141516 * (Math.pow(raio, 2));
        
        return area;
        
    }
    
    public double calcularDiametro(){
        diametro = 2 * raio;
        
        return diametro;
    
    }
    
    public double calcularCicunferencia(){
        circunferencia = 3.141516 * diametro;
        
        return circunferencia;
    
    }
    
    
    public void imprimir(){
        System.out.println("A area do círculo é " + area);
        System.out.println("O diametro do circulo é " + diametro);
        System.out.println("A circunferencia do círculo é " + circunferencia);
    }
    
    public void construtor(){
        System.out.println("Informe o valor correspondente ao raio do circulo: ");
        raio = leia.nextDouble();
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /*private String raio;
    private String area;
    private String diametro;
    private String circunferencia;
    
    public void setRaio(String raioC){
        raio = raioC;
    }
    
    public String getRaio(){
        return raio;
    }
    
    public void setArea(String areaC){
        area = areaC;
    }
   
    public String getArea(){
        return area;
    }
    
    public void setDiametro(String diametroC){
        diametro = diametroC;
    }
    
    public String getDiametro(){
        return diametro;
    }
    
    public void setCircunferencia(String circunferenciaC){
        circunferencia = circunferenciaC;
    }
    
    public String getCircunferencia(){
        return circunferencia;
    }
    
    public void imprimir(){
        System.out.println("A area do círculo é " + area);
        System.out.println("O diametro do circulo é " + diametro);
        System.out.println("A circunferencia do círculo é " + circunferencia);
    }*/
}
