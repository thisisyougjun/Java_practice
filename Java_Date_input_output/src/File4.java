import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class File4 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        System.err.println("������ ���� �̸��� �Է��ϼ���.(������ data ������ �ȿ� �־�� �մϴ�.)");
        String sourceFilename= "";
        File sFile;
        String destFilename= "";
        File dFile;
        while(true){
            sourceFilename = in.nextLine();
            sFile =new File("data/" + sourceFilename);
            if (sFile.exists()) {
                break;
            }else {
                System.out.println("������ �������� �ʽ��ϴ�. �ٽ� �Է����ּ���");
            }
        }
        System.out.println("����� ������ �̸��� �Է��ϼ���.");
        destFilename = in.nextLine();
        dFile =new File("data/" + destFilename);

        in.close(); //��ĳ�� �ڿ��� ��ȯ

        try {
            FileInputStream fis =new FileInputStream(sFile);
            FileOutputStream fos = new FileOutputStream(dFile);

            byte[] buffer =new byte[100];
            while(true){
                if (fis.read(buffer)==-1) {
                    break;
                }
                fos.write(buffer);
            }
            System.out.println("���� ���簡 �Ϸ�Ǿ����ϴ�");

            fis.close();
            fos.close();
        } catch (Exception e) {
            System.out.println("���� �߻�");
        }
    }
}
