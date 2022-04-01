package erros;

import java.util.InputMismatchException;
import java.util.Scanner;


public class DividePorZero {

    public static void dividir (Scanner in)
            throws InputMismatchException, ArithmeticException
    {
        System.out.println("Por favor, digite um numero: ");
        int n = in.nextInt();
        System.out.println("divisor: ");
        int b = in.nextInt();

        System.out.println(n / b);
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        boolean continua = true;

        do {
            try {
                dividir(in);
                continua = false;
            } catch (InputMismatchException | ArithmeticException e1) {
                System.err.println("Numero invalido.");
                e1.getMessage();
                in.nextLine();
            }

        } while (continua);

    }
}
