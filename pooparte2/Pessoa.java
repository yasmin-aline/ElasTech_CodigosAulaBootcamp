package pooparte2;

public class Pessoa {
    private String nome;
    private int idade;

    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
    public void setNome(String nome){


    }
    public void setIdade(int idade){
        if(idade > 0){
            this.idade = idade;
        }else{
            System.out.println("mensagem de erro");
        }
    }

}
