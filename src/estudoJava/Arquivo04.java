package estudoJava;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Arquivo04 {

    public static void main(String[] args) throws IOException {

        /* CREATE */
        Path path = Paths.get("C:/estudos/files/fontes.txt");
        Files.deleteIfExists(path);
        Files.createFile(path);
        Path Path = Files.write(path, "Meu texto".getBytes());

        /* COPY */
        Path copia = Paths.get("C:/estudos/files/copia.txt");
        Files.copy(path, copia, StandardCopyOption.REPLACE_EXISTING);

        /* MOVE */

        Path mover = Paths.get("C:/estudos/files/move/fonte.txt");
        Files.createDirectories(mover.getParent());
        Files.move(path, mover, StandardCopyOption.REPLACE_EXISTING);

    }


}
