public class Main {
    public static void main(String[] args){

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
        
        
    }
}
