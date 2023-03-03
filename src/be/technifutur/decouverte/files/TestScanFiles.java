package be.technifutur.decouverte.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestScanFiles {
    public static void main(String[] args) {
        File file = new File("ressource\\test.txt");
        try(Scanner scanner = new Scanner(file)){
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                System.out.println(line);
            }
        }catch (FileNotFoundException e){
            System.out.println("Le fichier n'existe pas");
        }
        
    }
}
