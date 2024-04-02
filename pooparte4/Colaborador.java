package pooparte4;

public class Colaborador {
    private String primeiroNome;
    private String segundoNome;

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getSegundoNome() {
        return segundoNome;
    }

    public void setSegundoNome(String segundoNome) {
        this.segundoNome = segundoNome;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        if(salarioMensal < 0){
            this.salarioMensal = 0.0;
        }else{
            this.salarioMensal = salarioMensal;
        }
    }

    private double salarioMensal;

    public Colaborador(String primeiroNome , String segundoNome, double salarioMensal){
        this.primeiroNome = primeiroNome;
        this.segundoNome = segundoNome;
        if(salarioMensal < 0){
            this.salarioMensal = 0.0;
        }else{
            this.salarioMensal = salarioMensal;
        }
    }
    public double salarioAnual(){
        return salarioMensal * 12;
    }
    public void ajusteSalario(){
        salarioMensal *= 1.10;
    }


}
