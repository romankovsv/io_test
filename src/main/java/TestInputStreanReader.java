import java.io.*;

public class TestInputStreanReader {

    String s;
    StringBuilder stringBuilder = new StringBuilder();
    public void readFile(){
        File file = new File(System.getProperty("user.dir")+"/files/file3.txt");
        try(Reader inputStream = new InputStreamReader(new FileInputStream(file), "UTF-8")){
            int data =  inputStream.read();
            while (data != -1){
                stringBuilder.append((char)data);
                data = inputStream.read();
            }
            s = new String(stringBuilder);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        TestInputStreanReader testInputStreanReader = new TestInputStreanReader();
        testInputStreanReader.readFile();
        System.out.println( testInputStreanReader.s);
    }
}
