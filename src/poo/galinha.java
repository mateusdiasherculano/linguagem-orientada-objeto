package poo;

public class galinha {

    public static int ovosDaGranja;

    public int ovos;

    public galinha botar(){
        this.ovos++;
        galinha.ovosDaGranja++;
        return this;
    }

    public static double mediaDeOvos(int galinhas){
        return galinha.ovosDaGranja / galinhas;
    }
}
