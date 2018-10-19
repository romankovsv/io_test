import java.io.*;

public class TestFileOutputStream {

    final String s = "abc";

    /**
     * Convert string to byte and write it to file
     */
    private void writeToFile(){
        File file = new File(System.getProperty("user.dir")+"/files/file3.txt");
        try(OutputStream out = new FileOutputStream(file)){
            byte[] data = s.getBytes();
            out.write(data);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new TestFileOutputStream().writeToFile();
    }
}
