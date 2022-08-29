/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho_3;

import java.util.Scanner;

/**
 *
 * @author 55779
 */
public class JMLS_BANCO {

    public static int buscabinaria(int[] array, int elemento) {
        return buscabinaria1(array, elemento, 0, array.length - 1);

    }

    public static int buscabinaria1(int[] array, int elemento, int menor, int maior) {
        int media = (menor + maior) / 2;
        if (menor > maior) {
            return -1;
        }
        if (array[media] == elemento) {
            return media;
        }
        if (array[media] < elemento) {
            return buscabinaria1(array, elemento, media + 1, maior);
        } else {
            return buscabinaria1(array, elemento, menor, maior - 1);
        }
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int conta[] = new int[10];
        double saldo[] = new double[10];
        int aux, numero = 0, cont = 0, pesq, elemento, busca, resultado;
        double aux1, deposito, saque;
        boolean achou, auxB;

        for (int i = 0; i < 10; i++) {

            System.out.println("Informe a conta numero " + (i + 1));
            pesq = ler.nextInt();
            auxB = true;
            for (int j = 0; j < 10; j++) {
                if (conta[j] == pesq) {
                    System.err.println("conta existente");
                    i--;
                    auxB = false;
                }
            }
            if (auxB) {
                System.out.println("Informe o saldo conta " + (i + 1));
                saldo[i] = ler.nextInt();
                conta[i] = pesq;
            }

        }

        //ordena 
        for (int j = 0; j < conta.length; j++) {
            for (int i = j + 1; i < (conta.length - 1); ++i) {
                if (conta[j] > conta[i]) {
                    aux = conta[i];
                    conta[i] = conta[j];
                    conta[j] = aux;
                    aux1 = saldo[i];
                    saldo[i] = saldo[j];
                    saldo[j] = aux1;
                }
            }
        }

        while (numero != 4) {
            System.out.println("");
            System.out.println(" 1- Efetuar depósito \n 2- Efetuar saque \n 3- Consultar o ativo bancário \n 4- Finalizar o programa   ");
            numero = ler.nextInt();

            switch (numero) {

                case 1:
                    System.out.println("informe a conta");
                    busca = ler.nextInt();
                    elemento = busca;
                    resultado = buscabinaria(conta, elemento);
                    if (resultado < 0) {
                        System.err.println("conta não encontrada");
                    } else {
                        System.out.println("informe o valor do deposito");
                        deposito = ler.nextInt();
                        saldo[resultado] = saldo[resultado] + deposito;
                        System.out.println("novo valor conta " + conta[resultado] + " saldo atual " + saldo[resultado]);
                    }
                    break;

                case 2:

                    System.out.println("informe a conta");
                    busca = ler.nextInt();
                    elemento = busca;
                    resultado = buscabinaria(conta, elemento);
                    if (resultado < 0) {
                        System.err.println("conta não encontrada");
                    }
                    System.out.println("informe o valor do saque");
                    saque = ler.nextInt();
                    if (saque > saldo[resultado]) {
                        System.err.println("Saldo insuficiente");
                    } else {
                        saldo[resultado] = saldo[resultado] - saque;
                        System.out.println("novo valor conta " + conta[resultado] + " saldo atual " + saldo[resultado]);

                    }

                    break;

                case 3:
                    for (int t = 0; t < 10; t++) {
                        System.out.println("Conta  " + conta[t] + " Saldo" + saldo[t]);
                    }
                        break;

            }
        }

       
        
    }
}
