package estudoJava;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class arquivo04 {

    public static void main(String[] args) throws IOException {

        Path path = Paths.get("C:/estudos/files/texto.txt");
        System.out.println(Files.exists(path));
        System.out.println(Files.isDirectory(path));
        System.out.println(Files.isRegularFile(path));
        System.out.println(Files.isReadable(path));
        System.out.println(Files.isExecutable(path));
        System.out.println(Files.size(path));
        


    }


}
