import java.io.File;
public class Exercise6 {
    public static void main(String[] args)
    {
        String str1 = "A";
        String str2 = "A";
        String str3 = "Java examples";

        int var1 = str1.compareTo( str2 );
        System.out.println("str1 & str2 comparison: "+var1);

        int var2 = str1.compareTo( str3 );
        System.out.println("str1 & str3 comparison: "+var2);

    }
}
