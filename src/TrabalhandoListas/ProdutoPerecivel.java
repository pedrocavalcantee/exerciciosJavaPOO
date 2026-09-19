package TrabalhandoListas;

public class ProdutoPerecivel extends Produto{
    private String dataDeValidade;

    public String getDataDeValidade() {
        return dataDeValidade;
    }

    public void setDataDeValidade(String dataDeValidade) {
        this.dataDeValidade = dataDeValidade;
    }

    public ProdutoPerecivel(String nome, String dataDeValidade){
        super(nome);
        this.dataDeValidade = dataDeValidade;
    }

}
