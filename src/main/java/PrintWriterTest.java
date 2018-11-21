import java.io.*;

public class PrintWriterTest {
    public static void main(String[] args) {

        File file = new File("somefile.txt");
        try(PrintWriter printWriter = new PrintWriter(new FileOutputStream(file, true)))
        {
            printWriter.append("Hi there");
       } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
