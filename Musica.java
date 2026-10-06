public class Musica {
    String titulo;
    String nomeArtista;
    int anoDeLancamento;
    double avaliacao;
    double numeroAvaliacoes;

    void exibeDados(){
        System.out.println("Nome: " + titulo);
        System.out.println("Artista: " + nomeArtista);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    public void avaliar(double numero){
        avaliacao += numero;
        numeroAvaliacoes++;
    }

    double media(){
        return avaliacao / numeroAvaliacoes;
    }
}
