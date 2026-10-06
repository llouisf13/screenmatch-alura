public class CBancaria {

    protected double saldo;


    public void depositar(double valor){
        System.out.println("Depositado! " + (saldo += valor));
    }

    public void sacar(double valor){
        if(saldo <= 0)
            System.out.println("Valor indisponível!");
        else
            System.out.println("Sacado! " + (saldo -= valor));
    }

    public void consultaSaldo(){
        System.out.println("Saldo consultado! " + saldo);
    }
}
