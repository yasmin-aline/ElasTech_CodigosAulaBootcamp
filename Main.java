package estrutura_repeticao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      /*  Scanner leitura = new Scanner(System.in);
        int i, numero, conta_par = 0, soma_par = 0;
        for(i = 0; i < 10 ; i++){
            System.out.println("Digite um numero");
            numero = leitura.nextInt();
            if(numero%2 == 0){
                conta_par++;
                //conta_par = conta_par + 1
                // conta_par = 0 + 1 = 1
                // conta_par = 1 + 1 = 2
                // conta_par = 2 + 1 = 3
                soma_par = soma_par + numero;
                //soma_par = 0 + 10 = 10
                // soma_par= 10 + 2 = 12

            }
        }
        System.out.println(" voce digitou "+ conta_par + " numeros pares e a soma deles é " + soma_par);
*/
        int i;
        i = 0;
        while (i < 5){
            System.out.println(i);
            i++;
        }
        System.out.println(" ++++++++++++++++++++++++++++++++++++++++++++++ ");
        i = 0;
        do{

            System.out.println(i);
            i++;
        }while (i < 5);



    }
}
