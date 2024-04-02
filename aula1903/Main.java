package aula1903;

public class Main {
    // metodo sem passagem de parametro
    public static void mensagemInicial(){
        System.out.println("Bem vindo ao sistema");
    }

    // metodo com passagem de parametro
    public static void mensagemUsuario(String nome){
        System.out.println("Bem vindo "+ nome);
        mensagemInicial();
    }

    // metodo com retorno de um inteiro
    public static int somar(int numero1 , int numero2){
        int resultado = numero1 + numero2;
        return numero1 + numero2;
    }
    public static void main (String[] args){
        mensagemInicial();
        mensagemUsuario("Rafael");
        int retornoSomar = somar(80, 90);

        System.out.println(somar(10,15));
        int n1 = 5 , n2 = 9;
        System.out.println(somar(n1, n2));
    }
}
