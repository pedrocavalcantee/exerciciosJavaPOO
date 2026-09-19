package Diversos;

public class ContaCorrente extends ContaBancaria{
    double taxaMensal = 15;
    public void cobraTarifaMensal(){
        saldo -= taxaMensal;
        System.out.println("Tarifa mensal de R$" + taxaMensal + " cobrada. Saldo restante: R$" + saldo);
    }

        /*Diversos.ContaCorrente minhaConta = new Diversos.ContaCorrente();
        minhaConta.setNumeroConta(2413);
        minhaConta.titular = "Pedro";
        minhaConta.mostraInformacoesConta();
        minhaConta.deposita(1200);
        minhaConta.sacar(120);
        minhaConta.cobraTarifaMensal();*/
}
