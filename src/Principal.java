import TrabalhandoListas.Pessoa;
import TrabalhandoListas.Produto;
import TrabalhandoListas.ProdutoPerecivel;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Produto meuProduto = new Produto("Amaciante");
        meuProduto.setPreco(12);
        meuProduto.setQuantidade(1);

        Produto outroProduto = new Produto("Farinha de trigo");
        outroProduto.setPreco(5);
        outroProduto.setQuantidade(3);

        Produto produto = new Produto("Barra de chocolate");
        produto.setPreco(8);
        produto.setQuantidade(4);

        ProdutoPerecivel produtoPer = new ProdutoPerecivel("Leite", "25/01");
        produtoPer.setPreco(6);
        produtoPer.setQuantidade(2);

        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(meuProduto);
        produtos.add(outroProduto);
        produtos.add(produto);

        for (int i = 0; produtos.size() > i; i++) {
            System.out.println(produtos.get(i).toString());
        }

        System.out.println(produtoPer);


    }
}

