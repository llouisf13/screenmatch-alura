public class Carro {
    String modelo;
    int ano;
    String cor;

    public void exibir(){
        System.out.println("Modelo: "+ modelo);
        System.out.println("Ano: "+ ano);
        System.out.println("Cor: "+ cor);
    }

    public void calculaIdade(){
        System.out.println(2026 - ano + " anos");
    }
}
