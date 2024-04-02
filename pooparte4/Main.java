package pooparte4;

public class Main {
    public static void main(String[] args) {
        Colaborador c = new Colaborador("Rafael", "Gomes", 80.0);
       // c.ajusteSalario();
       // c.ajusteSalario();
       // System.out.println(c.salarioAnual());


        c.setSalarioMensal(20.0);
        c.ajusteSalario();
        double teste = c.salarioAnual();
        double multiplicaano = teste * 3;
        System.out.println(multiplicaano);

    }
}
