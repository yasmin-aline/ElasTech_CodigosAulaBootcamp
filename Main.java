package estrutura_decisao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int idade = 20;
        if (idade > 18) {
            //System.out.println("voce é maior de idade");
        } else if (idade < 5) {
            // System.out.println(" entrou aqui ");
        } else if (idade < 5) {
            //System.out.println(" entrou aqui ");
        } else if (idade < 5) {
            //System.out.println(" entrou aqui ");
        } else {
            //System.out.println(" entrou na ultima verificacao");
        }
        Scanner leitura = new Scanner(System.in);

        char operacao = '+';

        int n1 = 10, n2 = 12, resultado;
        switch (operacao) {
            case '+':
                resultado = n1 + n2;
                System.out.println("o resultado da soma = " + resultado);
                break;

            case '-':
                resultado = n1 - n2;
                System.out.println("o resultado da subtração = "+ resultado);
                break;

            default:
                System.out.println("voce digitou um caractere invalida");

        }


    }
}
