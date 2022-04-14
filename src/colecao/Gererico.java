package colecao;

import java.util.ArrayList;
import java.util.Locale;

public class Gererico <E> {

    E elemento;

    public void setElemento(E elemento) {
        this.elemento = elemento;
    }
    public E getElemento(){
        return elemento;
    }

    public double soma(ArrayList<? extends Number> lista){
        double total = 0;
        for (Number number :lista) {
            total += number.doubleValue();
        }
        return total;
    }

    public static void main(String[] args) {

        Gererico<String> g = new Gererico<>();
        g.setElemento(" Lago paranoá ");
        //g.setElemento(123456)
        g.getElemento().toUpperCase();
    }
}
