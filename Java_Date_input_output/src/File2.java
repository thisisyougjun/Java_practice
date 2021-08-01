import java.io.File;
import java.io.FileInputStream;

public class File2 {
    public static void main(String[] args) {
        File file =new File("data/data.txt");
        try {
            FileInputStream fis=new FileInputStream(file);
            byte[] readBuffer = new byte[10];
            while (fis.read(readBuffer)!=-1) {
                System.out.write(readBuffer);
            }
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("에러 발생");
        }
    }
}
