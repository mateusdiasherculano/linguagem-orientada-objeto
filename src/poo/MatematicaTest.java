package poo;

public class MatematicaTest {
    public static void main(String[] args) {

        Matematica m = new Matematica();
        int raiz = m.raiz(27);
        System.out.println(raiz);

        System.out.println(Math.sqrt(27));
    }
}
