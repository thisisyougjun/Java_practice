import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;

public class File3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("저장할 파일 명을 입력하세요");
        String filename =in.nextLine();

        File file =new File("data/" +filename);

        try {
            FileOutputStream fos=new FileOutputStream(file);

            while (true) {
                String data = in.nextLine();

                if (data.isEmpty()) {
                    break;
                }
                fos.write(data.getBytes());
            }

            fos.close();

            System.out.println("파일 기록이 완료되었습니다");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("파일 쓰기 실패");
        }
    }
}
