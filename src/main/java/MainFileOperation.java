import java.io.File;
import java.util.Arrays;

public class MainFileOperation {
    public static void main(String[] args) {
        final String currentDir = System.getProperty("user.dir");

        /**
         * To get all files for directory
         */
        File dir = new File(currentDir+"/files");
        String [] paths = dir.list();
        for (String path : paths) {
            System.out.println(path);
        }
        //Print array with java 8
        Arrays.stream(paths).forEach(System.out::println);

        /**
         * File exists ?
         *  is Directory
         *  is File
         *  get Absolute path
         *  delete file and get true if deleted
         */
        boolean exist = dir.exists();
        boolean isDirectory = dir.isDirectory();
        boolean isFile = dir.isFile();
        String absolutePath = dir.getAbsolutePath();
        boolean deleted = new File(currentDir+"/files/file2.txt").delete();
        File parent = dir.getParentFile();
        System.out.println(parent);

        File [] files = dir.listFiles();

        dir.mkdir();
        dir.mkdirs();

    }
}
