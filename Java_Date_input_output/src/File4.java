import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class File4 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        System.err.println("복사할 파일 이름을 입력하세요.(파일은 data 폴더에 안에 있어야 합니다.)");
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
                System.out.println("파일이 존재하지 않습니다. 다시 입력해주세요");
            }
        }
        System.out.println("복사될 파일의 이름을 입력하세요.");
        destFilename = in.nextLine();
        dFile =new File("data/" + destFilename);

        in.close(); //스캐너 자원의 반환

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
            System.out.println("파일 복사가 완료되었습니다");

            fis.close();
            fos.close();
        } catch (Exception e) {
            System.out.println("오류 발생");
        }
    }
}
