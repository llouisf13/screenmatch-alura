package br.com.alura.screenmach.calculo;
import br.com.alura.screenmach.catalogo.Titulo;

public class Calculadora {

    private int calculaTempo;

    public void inclui(Titulo titulo){
        calculaTempo = calculaTempo + titulo.getDuracaoEmMinutos();
    }

    public int getCalculaTempo(){
        return calculaTempo;
    }
}
