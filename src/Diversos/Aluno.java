public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;
    private double nota3;

    public String getNome() {
        return nome;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    double calculaMedia(){
        double media = 0;
        media += nota1 + nota2 + nota3;
        return media /3;
    }

    // Exemplo de execução
    // public static void main(String[] args) {
    //        Aluno aluno1 = new Aluno();
    //        aluno1.setNome("Pedro");
    //        aluno1.setNota1(7);
    //        aluno1.setNota2(8);
    //        aluno1.setNota3(5);
    //        System.out.println("A média de notas de " + aluno1.getNome() + " foi " + aluno1.calculaMedia());
    //
    //        Aluno aluno2 = new Aluno();
    //        aluno2.setNome("João");
    //        aluno2.setNota1(6);
    //        aluno2.setNota2(5);
    //        aluno2.setNota3(5);
    //        System.out.println("A média de notas de " + aluno2.getNome() + " foi " + aluno2.calculaMedia());
    //    }
}
