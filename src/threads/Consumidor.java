package threads;

import java.util.Random;

public class Consumidor implements Runnable {
    private Random randon = new Random();
    private Ponte ponte;
    public Consumidor(Ponte ponte){
        this.ponte = ponte;
    }

    public void run(){
        int total = 0;
        for (int i = 0; i < 5; i++){
        try{
            Thread.sleep(randon.nextInt(3000));
            ponte.get();
            System.err.println("\t" + total);
        }catch (InterruptedException e){
      }
    }
  }
}

