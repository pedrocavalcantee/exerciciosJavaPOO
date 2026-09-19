package Diversos;

import Interfaces.Calculavel;

public class Livro extends Produto implements Calculavel {
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

    public void exibeInformacoes(){
        System.out.println("Autor: " + autor);
        System.out.println("Título: " + titulo);
        System.out.println("Preço da obra: " + getPreco());
    }

    @Override
    public double calcularPrecoFinal() {
        return getPreco() * 0.9;
    }
}


        //Exemplo de execução
        // public static void main(String[] args) {
        //        Diversos.Livro livro1 = new Diversos.Livro();
        //        livro1.setAutor("Franz Kafka");
        //        livro1.setTitulo("A Metamorfose");
        //
        //        Diversos.Livro livro2 = new Diversos.Livro();
        //        livro2.setAutor("Paulo Silveira");
        //        livro2.setTitulo("Lógica de Programação");
        //
        //        livro1.exibeInformacoes();
        //        livro2.exibeInformacoes();
        //    }

