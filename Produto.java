public class Produto {
    private String nome;
    private double precos;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getPrecos(){
        return precos;
    }

    public void setPrecos(double precos){
        this.precos = precos;
    }

    public void desconto(double valor){
        valor = (valor * precos) / 100;
        precos -= valor;
    }
}
