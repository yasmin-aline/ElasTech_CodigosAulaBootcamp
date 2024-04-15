package variaveis;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int idade, idade_animal, numero;
        idade = 18;
        idade_animal = 20;
        numero = 50;
        idade = leitura.nextInt();

        double altura, altura_pessoa;
        altura = 1.76;
        altura = leitura.nextDouble();

        boolean status = true;

        char letra = 'h';


        String nome_completo = "Rafael";
        nome_completo = leitura.nextLine();

        int[] numeros = {1, 2, 4,5,6};
        numeros[1] = 1;
        numeros[1] = 2;
        for(int i = 0; i < 5 ; i++){
            System.out.println(numeros[i]);
        }



    }
}
