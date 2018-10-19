import java.io.*;

public class TestFileInputStream {
    String s;
    StringBuilder stringBuilder = new StringBuilder();
    public void readFile(){
        File file = new File(System.getProperty("user.dir")+"/files/file3.txt");
        try(InputStream inputStream = new FileInputStream(file)){
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
        TestFileInputStream reader = new TestFileInputStream();
        reader.readFile();
        System.out.println(reader.s);
    }
}
