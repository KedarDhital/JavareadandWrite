import java.io.File;
import java.util.Date;
/*
Write a Java program to get last modified time of a file.


 */
public class Example7 {
    public static void main(String[] args) {
        File file = new File("src/main/resources/info.txt");

        Date date = new Date(file.lastModified());
        System.out.println("\n The file was last modified on "+ date);
    }
}
