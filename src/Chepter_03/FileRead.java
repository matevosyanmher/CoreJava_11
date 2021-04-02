package Chepter_03;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Scanner;

public class FileRead {
    Scanner in = new Scanner(Path.of("myfile.txt"),
            StandardCharsets.UTF_8);

    public FileRead() throws IOException {
    }
}

class PrintOnFile {
    public static void main(String[] args) {
        try {
            PrintWriter out = new PrintWriter("textile.txt", StandardCharsets.UTF_8);
            out.print("assassins");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}