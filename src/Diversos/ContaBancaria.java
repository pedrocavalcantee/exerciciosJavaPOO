package Diversos;

public class ContaBancaria {
    private int numeroConta;
    protected double saldo;
    String titular;

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    void sacar(double valor){
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque efetuado com sucesso!");
            System.out.println("Saldo restante: " + getSaldo());
        }else {
            System.out.println("Saldo insuficiente para saque!");
            System.out.println("Saldo atual: " + getSaldo());
        }
    }

    void deposita(double valor){
        saldo += valor;
        System.out.println("Depósito efetuado! Saldo: R$" + saldo);
    }

    void mostraInformacoesConta(){
        System.out.println("Número da conta: " + getNumeroConta());
        System.out.println("Saldo: " + getSaldo());
    }

    // Código de exemplo de execução
    // public static void main(String[] args) {
    //        Diversos.ContaBancaria minhaConta = new Diversos.ContaBancaria();
    //        minhaConta.setNumeroConta(2413);
    //        minhaConta.titular = "Pedro";
    //        minhaConta.mostraInformacoesConta();
    //        minhaConta.deposita(1200);
    //        minhaConta.sacar(120);
    //    }
}
