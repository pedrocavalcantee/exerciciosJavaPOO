public class IdadePessoa {
    private int idade;
    private String nome;

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    void verificaIdade(){
        if(idade >= 18){
            System.out.println(nome + " é maior de idade!");
        }else{
            System.out.println(nome + " é menor de idade");
        }
    }

    //Exemplo de execução
    // public static void main(String[] args) {
    //        IdadePessoa pessoa1 = new IdadePessoa();
    //        pessoa1.setIdade(15);
    //        pessoa1.setNome("José");
    //        System.out.println(pessoa1.getNome() + " tem " + pessoa1.getIdade() + " anos");
    //        pessoa1.verificaIdade();
    //    }
}
