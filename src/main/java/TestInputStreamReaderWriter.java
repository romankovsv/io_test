import java.io.*;

public class TestInputStreamReaderWriter {

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

    public void writeToFile(){
        File file = new File(System.getProperty("user.dir")+"/files/file3.txt");
        try(Writer writer = new OutputStreamWriter(new FileOutputStream(file), "UTF-8")){
            writer.write("Hello world!");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        TestInputStreamReaderWriter testInputStreanReader = new TestInputStreamReaderWriter();
        testInputStreanReader.writeToFile();
        testInputStreanReader.readFile();
        System.out.println( testInputStreanReader.s);
    }
}
