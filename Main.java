public class Main {
    public static void main(String[] args){

        Pessoa p1 = new Pessoa();
        p1.exibeDados();

        Calculadora c1 = new Calculadora();
        c1.retornaDobro(10);

        Musica m1 = new Musica();
        m1.titulo = "Rhiannon";
        m1.nomeArtista = "Fleetwood Mac";
        m1.anoDeLancamento = 1999;

        m1.exibeDados();
        m1.avaliar(9.8);
        m1.avaliar(9.7);

        System.out.println("A média das avaliações é: " + m1.media());

        Carro carro1 = new Carro();
        carro1.modelo = "Corolla";
        carro1.ano = 2000;
        carro1.cor = "Azul";

        carro1.exibir();
        carro1.calculaIdade();

        Aluno aluno1 = new Aluno();
        aluno1.seuNome = "Luís";
        aluno1.idade = 21;
        
        aluno1.dadosAluno();


        

        /*Filme film1 = new Filme();

        film1.nome = "Everything Everywhere All At Once";
        film1.anoDeLancamento = 2024;
        film1.duracaoEmMinutos = 180;
        film1.incluidoNoPlano = true;

        film1.exibeFichaTecnica();
        film1.avaliaFilme(9);
        film1.avaliaFilme(4);
        film1.avaliaFilme(8);
        
        
        System.out.println("A média dos usuários são: " + film1.pegaMedia());
        
        */
    }
}
