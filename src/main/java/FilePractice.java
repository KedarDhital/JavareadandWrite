import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FilePractice {
    public static void main(String[] args) {
        try {
            String location = "src/main/resources/kedar.txt";
            File file = new File(location);
            Scanner scanner = new Scanner(file);
            String date = "";
            while (scanner.hasNextLine()){
                date += scanner.nextLine() + "\n";
            }
            System.out.print(date + " \n");

        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
    }
}
