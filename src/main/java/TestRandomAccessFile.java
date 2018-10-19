import java.io.*;

public class TestRandomAccessFile {


    String s;
    StringBuilder stringBuilder = new StringBuilder();
    public void writeToFile(String text){
        File file = new File(System.getProperty("user.dir")+"/files/file3.txt");
        try(RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw")){
            randomAccessFile.write(text.getBytes("UTF-8"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readFile(){
        File file = new File(System.getProperty("user.dir")+"/files/file3.txt");
        try(RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw")){
            int data =  randomAccessFile.read();
            while (data != -1){
                stringBuilder.append((char)data);
                data = randomAccessFile.read();
            }
            s = new String(stringBuilder);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        TestRandomAccessFile readerWriter = new TestRandomAccessFile();
        readerWriter.writeToFile("the best car is a new one");
        readerWriter.readFile();
        System.out.println(readerWriter.s);
    }
}