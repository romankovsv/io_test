import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class CopyFileTutorial {


    private boolean copy(String srcPath, String targetPath){
        File src = new File(srcPath);

        File target = new File(targetPath);
        if(!target.exists() && src.exists()){
            try {
                Files.copy(src.toPath(), target.toPath());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return true;
    }

    private boolean move(String srcPath, String targetPath){
        File src = new File(srcPath);

        File target = new File(targetPath);
        if(!target.exists()&& src.exists()){
            try {
                Files.move(src.toPath(), target.toPath());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        final String currentDir = System.getProperty("user.dir");
        CopyFileTutorial copy = new CopyFileTutorial();
        copy.copy(currentDir+"\\files\\file2.txt",currentDir+"\\files\\file3.txt" );



    }
}
