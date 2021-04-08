import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MainRunner3 {
    public static void main(String[] args) throws IOException {
        String location = "src/main/resources/writeToFile.csv";
        File file = new File(location);

        FileWriter fileWriter = new FileWriter(file,true);

        fileWriter.write("Jafe Alhaboubi, PerScholas, jalhaboubi@perscholas.org" +"\n");
        fileWriter.write("kedar dhital, Java Developer, kndhital@gmail.com");
        fileWriter.close();

    }
}
