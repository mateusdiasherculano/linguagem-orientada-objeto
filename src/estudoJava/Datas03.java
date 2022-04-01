package estudoJava;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Datas03 {
    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();
        c.set(1980, Calendar.FEBRUARY, 12);
        Date date = c.getTime();

        Locale padrao = Locale.getDefault();
        Locale brasil = new Locale("pt", "BR");
        Locale india = new Locale("hi", "IN");
        Locale usa = Locale.US;
        Locale japao = Locale.JAPAN;
        Locale italia = Locale.ITALY;


        DateFormat f = DateFormat.getTimeInstance(DateFormat.FULL);
        System.out.println(f.format(date));

        f = DateFormat.getTimeInstance(DateFormat.FULL, brasil);
        System.out.println(f.format(date));//Brasil

        f = DateFormat.getTimeInstance(DateFormat.FULL, india);
        System.out.println(f.format(date));//India

        f = DateFormat.getTimeInstance(DateFormat.FULL, usa);
        System.out.println(f.format(date));//USA

        f = DateFormat.getTimeInstance(DateFormat.FULL, japao);
        System.out.println(f.format(date));//Japao

        f = DateFormat.getTimeInstance(DateFormat.FULL, italia);
        System.out.println(f.format(date));//Italia
    }
}
