package br.com.alura.screenmach.catalogo;

public class Serie extends Titulo {
    private int temporadas;
    private boolean ativa;
    private int episodiosPorTemporada;
    private int minutosPorEpisiodio;

    public int getTemporadas(){
        return temporadas;
    }

    public void setTemporadas(int temporadas){
        this.temporadas = temporadas;
    }

    public boolean isAtiva(){
        return ativa;
    }

    public void setAtiva(boolean ativa){
        this.ativa = ativa;
    }

    public int getEpisodiosPorTemporada(){
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada){
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getMinutosPorEpisodios(){
        return minutosPorEpisiodio;
    }

    public void setMinutosPorEpisodios(int minutosPorEpisiodio){
        this.minutosPorEpisiodio = minutosPorEpisiodio;
    }

    @Override 
    public int getDuracaoEmMinutos(){
        return temporadas * episodiosPorTemporada * minutosPorEpisiodio;
    }
}
