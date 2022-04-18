package refinado;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Recursividade {


    public static int soma(int x) {
     if (x == 0){
         return x;
     } else{
         System.out.println(x);
         return x + soma(x-1);
     }
 }

    public static int potencia(int x, int e) {
        if (e == 1) {
            return x;
        } else {
            int y = x * potencia(x, e - 1);
            System.out.println(y);
            return y;


        }

 }

    public static void main(String[] args) {
        System.out.println(potencia(3, 4));
        // System.out.println(soma(10));
        listar(Paths.get("C:/estudos/"));


    }

    public static void listar(Path path) {
        if(Files.isRegularFile(path)){
            System.out.println(path.toAbsolutePath());
        }else{
            String s = "\n" + path.toAbsolutePath();
            System.out.println(s.toUpperCase());
            try {
                DirectoryStream<Path> stream = Files.newDirectoryStream(path);
                for (Path p : stream) {
                   listar(p);
                }
            } catch (IOException e) {

            }

        }

    }
}
