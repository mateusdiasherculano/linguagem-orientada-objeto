package estudoJava;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class Numero {
    public static void main(String[] args) throws ParseException {

        double saldo = 123_456.789;
        NumberFormat f = NumberFormat.getInstance();
        System.out.println(f.format(saldo));// genericos

        f = NumberFormat.getIntegerInstance();// inteiros
        System.out.println(f.format(saldo));

        f = NumberFormat.getPercentInstance();// porcentual
        System.out.println(f.format(0.25));

        f = NumberFormat.getCurrencyInstance();// moeda
        System.out.println(f.format(saldo));

        f.setMaximumFractionDigits(2);
        System.out.println(f.format(saldo));

        /* Internacionalização */

        f = NumberFormat.getCurrencyInstance(Locale.ITALIAN);
        System.out.println(f.format(saldo));
        f = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        System.out.println(f.format(saldo));



    }
}
