package CalculosMatematicos;

import Interfaces.CalculoGeometrico;

public class calculadoraSalaRetangular implements CalculoGeometrico {
    @Override
    public void calculaArea(double altura, double largura) {
        double area = altura * largura;
        System.out.println("Área total da sala: " + area + "m");
    }

    @Override
    public void calculaPerimetro(double altura, double largura) {
        double perimetro = altura * 2 + largura * 2;
        System.out.println("O perímetro da sala é: " + perimetro + "m");
    }

    //Exemplo de execução
    // public static void main(String[] args) {
    //        Scanner leitor = new Scanner(System.in);
    //        System.out.println("Digite a altura da sala: ");
    //        double altura = leitor.nextDouble();
    //        System.out.println("Digite a largura da sala: ");
    //        double largura = leitor.nextDouble();
    //
    //        CalculosMatematicos.calculadoraSalaRetangular calculadora = new CalculosMatematicos.calculadoraSalaRetangular();
    //        calculadora.calculaArea(altura, largura);
    //        calculadora.calculaPerimetro(altura, largura);
    //    }
}
