import java.io.File;

public class File1 {
    public static void main(String[] args) {
        File file =new File("data/date.txt");

        try {
            file.createNewFile();
            System.out.println("���������� ������ �����Ǿ����ϴ�.");
        } catch (Exception e) {
            System.out.println("������ �����߽��ϴ�.");
        }
    }
}
