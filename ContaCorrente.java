public class ContaCorrente extends CBancaria {

    private double tarifaMensal;
    

    public void cobrarTarifaMensal(){
        System.out.println("Valor descontado mensal: " + (saldo -= tarifaMensal));
    }
}
