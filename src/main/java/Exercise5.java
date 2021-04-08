import java.io.File;

public class Exercise5 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\macavelli\\IdeaProjects\\FileReadWrite\\src\\main\\resources\\info.txt");
        if (file.isDirectory()) {

            System.out.println(file.getAbsolutePath() +"It is Directory");

        } else{
            System.out.println(file.getAbsolutePath()+" is not Directory");
        }
        if(file.isFile()){
            System.out.println(file.getAbsolutePath() + " it is a file");
        }
        else {
            System.out.println(file.getAbsolutePath() + " it is not a file");
        }
    }
}
