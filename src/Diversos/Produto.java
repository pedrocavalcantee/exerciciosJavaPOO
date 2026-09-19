import Interfaces.Vendavel;

public class Produto implements Vendavel {
    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    double aplicaDesconto(double desconto){
        preco = preco - (preco * desconto / 100);
        return preco;
    }

    @Override
    public double calculaPrecoTotal(double quantidade) {
        double valorTotal = getPreco() * quantidade;
        if (quantidade > 5) {
            return valorTotal * 0.8;
        }
        return valorTotal;
    }

    //Exemplo de execução
    // public static void main(String[] args) {
    //        Produto produto1 = new Produto();
    //        produto1.setNome("Iphone 15 PRO");
    //        produto1.setPreco(7450);
    //        produto1.aplicaDesconto(10);
    //        System.out.println("Valor final do " + produto1.getNome() +  " com desconto R$" + produto1.getPreco());
    //    }
}
