package erros;

import java.util.InputMismatchException;
import java.util.Scanner;


public class dividePorZero {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        boolean continua = true;

        do {
            try {

                System.out.println("Por favor, digite um numero: ");
                int n = in.nextInt();
                System.out.println("divisor: ");
                int b = in.nextInt();

                System.out.println(n / b);
                continua = false;
            } catch (InputMismatchException e1) {
                System.out.println("Os numeros devem ser inteiros. ");
                in.nextLine();
            } catch (ArithmeticException e2) {
                System.out.println("O divisor deve ser diferente de zero. ");
            }

        } while (continua);

    }
}
