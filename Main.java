//import br.com.alura.screenmatch.catalogo.Filme;
//import br.com.alura.screenmatch.calculo.Calculadora;
//import br.com.alura.screenmatch.catalogo.Serie;
public class Main {
    public static void main(String[] args){

        Car carro = new Car();
        carro.definirModelo("Corolla");
        carro.definirPreco(50000, 40000, 25000);
        carro.exibir();
       

        Cachorro cachorro = new Cachorro();
        cachorro.emitirSom();
        cachorro.abanar();

        Gato gato = new Gato();
            gato.emitirSom();
            gato.arranharMoveis();
        

        CBancaria conta = new CBancaria();
        conta.depositar(200);
        conta.consultaSaldo();

        ContaCorrente contacorrente = new ContaCorrente();
        contacorrente.depositar(1500);
        contacorrente.sacar(100);
        contacorrente.consultaSaldo();
        contacorrente.cobrarTarifaMensal();
        conta.consultaSaldo();

        /*Filme f1 = new Filme();
        f1.setNome("Quarto de Guerra");
        f1.setAnoDeLancamento(2015);
        f1.setIncluidoNoPlano(true);
        f1.setDuracaoEmMinutos(180);
        f1.avalia(5.4);
        f1.avalia(5.3);
        f1.avalia(9.7);
        

        Serie serie = new Serie();
        serie.setNome("Stranger Things");
        serie.setAnoDeLancamento(2016);
        serie.setIncluidoNoPlano(true);
        serie.setTemporadas(10);
        serie.setEpisodiosPorTemporada(20);
        serie.setMinutosPorEpisodios(30);


        serie.avalia(7.1);
        serie.avalia(9.4);
        serie.avalia(9.5);
        
        Calculadora calculadora = new Calculadora();
        calculadora.inclui(f1);
        calculadora.inclui(serie);
        
        System.out.println("Tempo total: " +calculadora.getCalculaTempo());
*/
        /*ContaBancaria conta1 = new ContaBancaria();

        conta1.setNumeroConta(55440234);
        conta1.setSaldo(564.54);
        conta1.titular = "Luís";

        System.out.println("Número conta: " + conta1.getNumeroConta());
        System.out.println("Saldo: " + conta1.getSaldo());
        System.out.println("Titular: " + conta1.titular);
        conta1.setSaldo(1500);
        System.out.println("Novo saldo: " + conta1.getSaldo());

        Pessoas p2 = new Pessoas();
        p2.setNome("Luís Felipe");
        p2.setIdade(15);
        System.out.println("Nome: " + p2.getNome());
        System.out.println("Idade: " + p2.getIdade());
        p2.retornaIdade();

        Produto produto = new Produto();
        produto.setNome("Macarrão");
        produto.setPrecos(5.50);
        System.out.println("Nome: " + produto.getNome());
        System.out.println("Valor: " + produto.getPrecos());

        produto.desconto(10);

        System.out.println("Desconto: " +produto.getPrecos()); */
        /*Pessoa p1 = new Pessoa();

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


        

        Filme film1 = new Filme();

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
