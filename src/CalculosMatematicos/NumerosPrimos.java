package CalculosMatematicos;

public class NumerosPrimos {
    int numero;
    public boolean verificaPrimalidade(int numero){
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i * i <= numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
        }

        public void listaPrimos(int limiteSuperior){
            System.out.println("Números primos até " + limiteSuperior + ": ");
            for (int i = 0; i < limiteSuperior ; i++) {
                if (verificaPrimalidade(i)){
                    System.out.println(i + " ");
                }
            }
        }
    }
