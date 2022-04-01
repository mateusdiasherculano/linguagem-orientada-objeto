package estudoJava;

import java.util.Calendar;
import java.util.Date;

public class Datas {
    public static void main(String[] args) {

        System.out.println(System.currentTimeMillis());

        Date agora = new Date();
        System.out.println(agora);

        Date data = new Date(1_000_000_000_000L);
        System.out.println(data);

        /* Metodos */
        data.getTime();
        data.setTime(1_000_000_000_000L);
        System.out.println(data.compareTo(agora));

        Calendar c = Calendar.getInstance();
        c.set(1980, Calendar.FEBRUARY, 12);
        System.out.println(c.getTime());

        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.MONTH));
        System.out.println(c.get(Calendar.DAY_OF_MONTH));

        c.set(Calendar.YEAR, 2000);
        c.set(Calendar.MONTH, Calendar.DECEMBER);
        c.set(Calendar.DAY_OF_MONTH, 30);
        System.out.println(c.getTime());

        c.clear(Calendar.MINUTE);
        c.clear(Calendar.SECOND);
        System.out.println(c.getTime());

        c.add(Calendar.DAY_OF_MONTH, -1);
        c.add(Calendar.YEAR, -1);
        System.out.println(c.getTime());

        c.roll(Calendar.DAY_OF_MONTH, -20);
        System.out.println(c.getTime());

        /* Saudação com Bom dia, Boa tarde ou Boa noite*/

        Calendar c1 = Calendar.getInstance();
        int hora = c1.get(Calendar.HOUR_OF_DAY);
        System.out.println(hora);
        if (hora<= 12){
            System.out.println("Bom dia");
        }else if (hora > 12 && hora < 18){
            System.out.println("Boa tarde");
        }else {
            System.out.println("Boa noite");
        }

    }
}
