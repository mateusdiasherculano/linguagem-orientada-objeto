package threads;

import java.util.Random;

public class Produtor implements Runnable {
    private Random randon = new Random();
    private Ponte ponte;
    public Produtor(Ponte ponte){
        this.ponte = ponte;
    }

    public void run(){
        int total = 0;
        for (int i = 0; i < 5; i++){
        try{
            Thread.sleep(randon.nextInt(3000));
            ponte.set(i);
            System.out.println("\t" + total);
        }catch (InterruptedException e){
      }
    }
  }
}

