package erros;

import java.util.Scanner;

public class assertions {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Por favor, digite um numero de 0 a 10 ");
        int numero = in.nextInt();

        assert ( numero >= 0 && numero <= 10) : "Numero invalido" + numero;
        System.out.println("Voce entrou "+ numero);
    }
}
