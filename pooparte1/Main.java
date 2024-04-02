package pooparte1;

import ContaBancaria.ContaBancaria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Animal animal1 = new Animal("Rafael",10);
        Animal animal2 = new Animal("Rafael 2",10);

        //Mostrar os atributos  e também os metodos
        System.out.println("O nome do animal é "+ animal1.getNome());
        System.out.println("A idade do animal é "+ animal1.getIdade());
        animal1.aniversarioanimal();
        System.out.println("A nova idade do animal é "+ animal1.getIdade());


        System.out.println("=====");
        System.out.println("nome do animal2 "+ animal2.getNome());


        //==========

        Animal animal3 = new Animal("rafael 3", 40);
        System.out.println("=====");
        System.out.println("nome do animal3 "+ animal3.getNome());
        animal3.inserenobancodedados();

    }
}
