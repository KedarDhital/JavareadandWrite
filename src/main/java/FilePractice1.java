import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FilePractice1 {
    public static void main(String[] args) {
        try {
            String location = "src/main/resources/kedar.txt";
            File file = new File(location);
          Scanner scanner = new Scanner(file);

            ArrayList<String> input = new ArrayList<>();

            while (scanner.hasNextLine()){
                input.add(scanner.nextLine());
            }
            for (String s:input) {
                System.out.println(s);

            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }

    }
}
