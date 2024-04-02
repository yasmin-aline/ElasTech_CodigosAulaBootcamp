package herancaparte1;

public class Estudante extends Pessoa{
    private int matricula;
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public Estudante(String nome, int idade, int matricula){
        super(idade, nome);
        this.matricula = matricula;
    }

    public int soma(int n1 , int n2){
        return  n1 + n2;
    }

    public double soma(double n1, double n2){
        return  n1 + n2;
    }



    public void mostrarDados(){
        super.mostrarDados();
        System.out.println("Matricula = "+ matricula);
    }


}
