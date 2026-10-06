public class Filme {
    String nome;
    int anoDeLancamento;
    int duracaoEmMinutos;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;
    int totalAvaliacoes;

    public Filme(String nome, int anoDeLancamento, int duracaoEmMinutos, boolean incluidoNoPlano, double somaDasAvaliacoes, int totalAvaliacoes){
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
        this.duracaoEmMinutos = duracaoEmMinutos;
        this.incluidoNoPlano = incluidoNoPlano;
        this.somaDasAvaliacoes = somaDasAvaliacoes;
        this.totalAvaliacoes = totalAvaliacoes;
    }

    public void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Duração do filme " + nome + " em minutos: " + duracaoEmMinutos);
        System.out.println("Total de avaliações: " + totalAvaliacoes);
    }

    public void avaliaFilme(double nota){
        somaDasAvaliacoes += nota;
        totalAvaliacoes++;
    }

    double pegaMedia(){
        return somaDasAvaliacoes / totalAvaliacoes;
    }
}