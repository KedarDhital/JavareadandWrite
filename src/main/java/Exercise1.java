import java.io.File;

public class Exercise1 {
    public static void main(String[] args) {

        File file = new File("C:\\Windows");
        String[] fileList = file.list();
        for(String name:fileList){
            System.out.println(name);
        }
    }
}
