import java.io.File;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args) {
        boolean newFile = false;
        File file = new File("file7.txt");
        System.out.println(file.exists());
        try {
            System.out.println(file.createNewFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(file.exists());
    }
}
