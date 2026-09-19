public class TabuadaMultiplicacao implements Tabuada {

    @Override
    public void mostrarTabuada(int numero) {
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(numero + " X " + i + " = " + numero*i);
        }
    }

    //Exemplo de execução
    // public static void main(String[] args) {
    //            Scanner leitor = new Scanner(System.in);
    //            System.out.println("Digite o número para mostrar a tabuada ");
    //            int numero = leitor.nextInt();
    //
    //            TabuadaMultiplicacao tabuada = new TabuadaMultiplicacao();
    //            tabuada.mostrarTabuada(numero);
    //        }


}
