package calculos;

public class Main {
    public static void main(String[] args) {
        int n1 = 10, n2 = 12;
        int soma = n1 + n2;
        int subtracao =  n1 - n2;
        System.out.println(subtracao);
        int multiplicao = n1 * n2;
        double divisao = (double) n1 / n2;
        int modulo = n1 % n2;
        double potencia = Math.pow(n1, n2);
        double raizquadrada = Math.sqrt(n1);
        int calculo = ((n1 + n2) * ( n1 + n2))*9;
    }
}
