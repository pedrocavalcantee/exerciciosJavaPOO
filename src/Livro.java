public class Livro {
    private String autor;
    private String titulo;

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    void exibeInformacoes(){
        System.out.println("Autor: " + autor);
        System.out.println("Título: " + titulo);
    }

    //Exemplo de execução
    // public static void main(String[] args) {
    //        Livro livro1 = new Livro();
    //        livro1.setAutor("Franz Kafka");
    //        livro1.setTitulo("A Metamorfose");
    //
    //        Livro livro2 = new Livro();
    //        livro2.setAutor("Paulo Silveira");
    //        livro2.setTitulo("Lógica de Programação");
    //
    //        livro1.exibeInformacoes();
    //        livro2.exibeInformacoes();
    //    }
}
