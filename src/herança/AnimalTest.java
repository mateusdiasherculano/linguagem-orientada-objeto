package herança;

public class AnimalTest {
    public static void main(String[] args) {

        Cachorro toto = new Cachorro();
        toto.comida = "Carne";
        toto.fazerBarulho();

        Galinha carijo = new Galinha();
        carijo.comida = "milho";
        carijo.fazerBarulho();



    }
}
