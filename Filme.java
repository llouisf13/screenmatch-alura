public class Filme {
    String nome;
    int anoDeLancamento;
    int duracaoEmMinutos;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;
    int totalAvaliacoes;

    public Filme(){
        this.nome = "";
        this.anoDeLancamento = 0;
        this.duracaoEmMinutos = 0;
        this.incluidoNoPlano = true;
        this.somaDasAvaliacoes = 0.0;
        this.totalAvaliacoes = 0;
    }

    public Filme(String nome, int anoDeLancamento, int duracaoEmMinutos, boolean incluidoNoPlano, double somaDasAvaliacoes, int totalAvaliacoes){
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
        this.duracaoEmMinutos = duracaoEmMinutos;
        this.incluidoNoPlano = incluidoNoPlano;
        this.somaDasAvaliacoes = somaDasAvaliacoes;
        this.totalAvaliacoes = totalAvaliacoes;
    }


    public void avaliaFilme(double nota){
        somaDasAvaliacoes += nota;
        totalAvaliacoes++;
    }

    public void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Duração do filme " + nome + " em minutos: " + duracaoEmMinutos);
    }

    double pegaMedia(){
        return somaDasAvaliacoes / totalAvaliacoes;
    }
}