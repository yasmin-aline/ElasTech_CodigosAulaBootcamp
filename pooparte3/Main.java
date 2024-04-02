package pooparte3;

public class Main {
    public static void main(String[] args) {
    Suprimentos s = new Suprimentos(1, "teclado", 2, 5.9);
        System.out.println(s.getDescricao());
        double soma = s.getInvoiceAmount();
        System.out.println(soma);
    }
}
