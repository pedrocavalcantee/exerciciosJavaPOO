package TrabalhandoListas;

public class Pessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return  this.nome + ": " + this.idade;
    }
}

 /*
 Exemplo de execução
 Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Pedro");
        pessoa1.setIdade(18);

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("João");
        pessoa2.setIdade(15);

        Pessoa pessoa3 = new Pessoa();
        pessoa3.setNome("Maria");
        pessoa3.setIdade(22);

        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);
        System.out.println("A lista possui " + listaDePessoas.size() + " pessoas cadastradas.");
        System.out.println("A primeira pessoa da lista é: " + listaDePessoas.get(0).toString());

        System.out.println("Lista de Pessoas:");
        for (Pessoa pessoa : listaDePessoas) {
            System.out.println(pessoa);
        }
*/
