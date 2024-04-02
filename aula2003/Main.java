package aula2003;

import java.util.Scanner;

public class Main {
    //1 -Crie um programa que realize uma
    // contagem regressiva de 10 até 1,
    // mostrando cada número na tela.
    public static void contagemregressiva() {
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
    }

    //2 - Escreva um programa que solicite um
    // número ao usuário e exiba a tabuada desse
    // número de 1 a 10.
    public static void mostraTabuada(int numero) {
        System.out.println("Tabuada do numero " + numero);
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = 5" + (numero * i));
        }
    }

    //3 - Desenvolva um algoritmo que calcule a soma
    // dos números pares de 1 a 100.
    public static void calculaPares(int n1, int n2) {
        int soma = 0;
        for (int i = n1; i <= n2; i++) {
            if (i % 2 == 0) {
                soma += i;
            }
        }
        System.out.println(soma);
    }

    //Escreva um programa que verifique se um
    // número digitado pelo usuário é primo ou não.
    public static int verificaPrimo(int numero) {
        int cont = 0;
        if (numero <= 1) {
            return 0; // 0 é para nao primo
        }
        for (int i = 1; i <= (numero / 2); i++) {
            if (numero % i == 0) {
                cont++;
            }
        }
        if (cont > 2) {
            return 0;
        } else {
            return 1;
        }

    }

    //5 - Implemente um algoritmo que exiba os primeiros 20
// números da sequência de Fibonacci.
    public static void mostraFibonacci(int n) {
        int ant = 0;
        int atu = 1;
        System.out.println(ant + "\n" + atu);
        for (int i = 20; i > 0; i--) {
            int proximoatual = ant + atu; // 1 + 2  = 3
            System.out.println(proximoatual + " "); // 1 , 2 , 3 ,
            ant = atu; //1
            atu = proximoatual; //2
        }
    }

    //Faça um programa que solicite ao usuário números inteiros positivos.
    // Quando o usuário digitar um número negativo, o programa deve exibir
    // a média dos números inseridos até aquele momento.
    public static void mediaNumeros(){
        Scanner leitura = new Scanner(System.in);
        double mediadosnumeros = 0;
        int soma = 0, cont = 0, numero = 1;
        while (numero > 0){
            System.out.println("Digite um numero ou digite um numero negativo para sair");
            numero = leitura.nextInt();
            if(numero > 0){
                cont++;
                soma += numero;
            }else{
                mediadosnumeros = (double) soma / cont;
            }
        }
        System.out.println("a Soma é "+ soma);
        System.out.println("a media dos numeros é "+ mediadosnumeros);
    }

// Crie uma calculadora simples que permita ao usuário realizar operações de
// soma, subtração, multiplicação e divisão entre dois números, utilizando
// um laço de repetição para continuar operando até que o usuário decida
// sair.

    public static void soma(int n1, int n2){
        System.out.println(n1+n2);
    }
    public static void multi(int n1 , int n2){
        System.out.println(n1*n2);
    }

    public static void whi() {
        int numero = 1;
        while(numero > 0){
            Scanner leitura = new Scanner(System.in);
            System.out.println("Digite o primeiro valor da soma");
            int n1 = leitura.nextInt();
            System.out.println("Digite o segundo valor da soma");
            int n2 = leitura.nextInt();
            soma(n1, n2);
            multi(n1, n2);
            System.out.println("Digite valor positivo para continuar ou o negativo para sair");
            numero = leitura.nextInt();
        }
    }
    //Implemente um jogo no qual o programa escolhe um número aleatório
    // entre 1 e 100, e o jogador deve tentar adivinhá-lo.
    // O programa deve fornecer dicas do tipo "maior" ou "menor"
    // conforme necessário.


    public static void main(String[] args) {
        //contagemregressiva();
        Scanner leitura = new Scanner(System.in);
        /*System.out.println("Digite um numero");
        int numero = leitura.nextInt();
        mostraTabuada(numero);*/
        //calculaPares(1 , 100);
        //System.out.println(verificaPrimo(50));
        //mostraFibonacci(20);
        //mediaNumeros();
        //whi();

    }
}
