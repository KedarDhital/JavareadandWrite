import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MainRunner {
    public static void main(String[] args) {
       // location
        String location = "src/main/resources/info.txt";

        File file = new File(location);
        String line = "";
        try {
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()){ // check if the file has next line
                line += scan.nextLine() + "\n";
            }
           // String line = scan.nextLine();
            System.out.println(line);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Hope it works");
        }
    }
}
