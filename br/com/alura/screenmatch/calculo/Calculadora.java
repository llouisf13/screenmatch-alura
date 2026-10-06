package br.com.alura.screenmatch.calculo;
import br.com.alura.screenmatch.catalogo.Titulo;

public class Calculadora {

    private int calculaTempo;

    public void inclui(Titulo titulo){
        calculaTempo = calculaTempo + titulo.getDuracaoEmMinutos();
    }

    public int getCalculaTempo(){
        return calculaTempo;
    }
}
