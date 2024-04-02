package pooparte3;

public class Suprimentos {
    private int id;
    private String descricao;
    private int quantidade;
    private double preco;
    public Suprimentos(int id ,String descricao, int quantidade, double preco){
        this.id = id;
        this.descricao = descricao;

        if(quantidade < 0 ){
            this.quantidade = 0;
        }else{
            this.quantidade = quantidade;
        }

        if(preco < 0.0){
            this.preco = 0.0;
        }else{
            this.preco = preco;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if(quantidade < 0 ){
            this.quantidade = 0;
        }else{
            this.quantidade = quantidade;
        }
    }

    public void setPreco(double preco) {
        if(preco < 0.0){
            this.preco = 0.0;
        }else{
            this.preco = preco;
        }
    }

    public double getPreco() {
        return preco;
    }

    public double getInvoiceAmount(){
        return quantidade * preco;
    }
}
