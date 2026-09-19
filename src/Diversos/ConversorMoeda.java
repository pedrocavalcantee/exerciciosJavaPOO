import Interfaces.ConversaoFinanceira;

public class ConversorMoeda implements ConversaoFinanceira {
    @Override
    public void converterDolarParaReal(double dolar) {
        double cotacaoDolar = 5.10;
        double real = dolar * cotacaoDolar;
        System.out.println("O valor em real é R$:" + real);
    }

    //Exemplo de execução
    // public static void main(String[] args) {
    //        ConversorMoeda conversor = new ConversorMoeda();
    //        conversor.converterDolarParaReal(45);
    //    }

}
