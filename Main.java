package array;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner (System.in);
        ArrayList<String> nomes = new ArrayList<>();

        System.out.println("Digite um nome");
        String nome_recebido = leitura.nextLine();
        nomes.add(nome_recebido);

        for(String nome : nomes){
            System.out.println(nome);
        }
        System.out.println(nomes.get(0));

    }
}
