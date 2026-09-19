public class Carro {
    private String modelo;
    private double precoAno1;
    private double precoAno2;
    private double precoAno3;

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void definePrecos(double precoAno1, double precoAno2, double precoAno3){
        precoAno1 = this.precoAno1;
        precoAno2 = this.precoAno2;
        precoAno3 = this.precoAno3;
    }

    public void exibeInformacoes(){
        System.out.println("Modelo do carro: " + modelo);
        System.out.println("Preço no primeiro ano: " + precoAno1);
        System.out.println("Preço no segundo ano: " + precoAno2);
        System.out.println("Preço no terceiro ano: " + precoAno3);

    }

    double calculaMenorPreco() {
        double menorPreco = precoAno1;
        if (precoAno2 < menorPreco) {
            menorPreco = precoAno2;
        } else if (precoAno3 < menorPreco) {
            menorPreco = precoAno3;
        }
        return  menorPreco;
    }

    double calculaMaiorPreco() {
        double maiorPreco = precoAno1;
        if (precoAno2 > maiorPreco) {
            maiorPreco = precoAno2;
        } else if (precoAno3 > maiorPreco) {
            maiorPreco = precoAno3;
        }
        return  maiorPreco;
    }
}
