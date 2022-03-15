package estudoJava;

import java.io.IOException;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;

public class arquivo05 {

    public static void main(String[] args) throws IOException {

        FileSystem fs = FileSystems.getDefault();
        for (FileStore store : fs.getFileStores()) {
            System.out.println("unidade" + store.toString());
            System.out.println("Total: " + store.getTotalSpace());
            System.out.println("Disponível " + store.getUsableSpace());
            System.out.println("Unidade utilizada: " + (store.getTotalSpace() - store.getUsableSpace()));
        }
    }
}
