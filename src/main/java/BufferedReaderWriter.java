import java.io.*;

public class BufferedReaderWriter {
    public static void main(String[] args) {
        testBufferedWriter("\nSofia is the best of the best");
        try {
            testBufferedReaderReadCharByLine(new FileReader("file4.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static  void testBufferedReaderReadCharByLine(FileReader fileReader){
        try(BufferedReader br = new BufferedReader(fileReader)){
            String s;
           while ((s = br.readLine()) != null){
               System.out.println(s);
           }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static  void testBufferedReaderReadCharByChar(FileReader fileReader){
        try(BufferedReader br = new BufferedReader(fileReader)){
            int c;
            while((c = br.read()) != -1){
                System.out.print((char)c);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private static void testBufferedWriter(String text){
        try(BufferedWriter br = new BufferedWriter(new FileWriter("file4.txt",true))) {

            br.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
