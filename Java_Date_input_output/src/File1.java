import java.io.File;

public class File1 {
    public static void main(String[] args) {
        File file =new File("data/date.txt");

        try {
            file.createNewFile();
            System.out.println("성공적으로 파일이 생성되었습니다.");
        } catch (Exception e) {
            System.out.println("생성에 실패했습니다.");
        }
    }
}
