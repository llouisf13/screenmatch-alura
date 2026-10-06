package br.com.alura.screenmach.catalogo;


public class Titulo {
    private String nome;
    private int anoDeLancamento;
    private int duracaoEmMinutos;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalAvaliacoes;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getAnoDeLancamento(){
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento){
        this.anoDeLancamento = anoDeLancamento;
    }

    public int getDuracaoEmMinutos(){
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos){
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public boolean isIncluidoNoPlano(){
        return incluidoNoPlano;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano){
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public double getSomaAvaliacoes(){
        return somaDasAvaliacoes;
    }

    public void setSomaAvaliacoes(double somaDasAvaliacoes){
        this.somaDasAvaliacoes = somaDasAvaliacoes;
    }

    public int getTotalAvaliacoes(){
        return totalAvaliacoes;
    }

    public void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Duração do filme " + nome + " em minutos: " + duracaoEmMinutos);
    }

    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalAvaliacoes++;
    }

    public double pegaMedia(){
        return somaDasAvaliacoes / totalAvaliacoes;
    }


}
