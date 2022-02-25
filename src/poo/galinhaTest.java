package poo;

public class galinhaTest {

    public static void main(String[] args) {

        galinha g1 = new galinha();
        g1.botar().botar().botar();

        galinha g2 = new galinha();
        g2.botar().botar().botar();

        System.out.println(g1.ovos);
        System.out.println(g2.ovos);
        System.out.println(galinha.ovosDaGranja);
        System.out.println(galinha.mediaDeOvos(2));
    }
}
