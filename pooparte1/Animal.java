package pooparte1;

public class Animal {
    //atributos
    private String nome;
    private int idade;

    public Animal(String nome , int idade){
        this.nome = nome;
        this.idade = idade;
    }


    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }

    public void aniversarioanimal(){
        idade++;
    }
    //esse metodo insere no banco de dados com os atributos nome e idade
    // o atributo idade deve ser inteiro
    public void inserenobancodedados(){

    }

}
