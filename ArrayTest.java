import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        

        String[] name={"A", "B","C"};
        double[] score =new double[3];
        int sum = 0;
        double average =0.0;
        int max = 0;
        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]+"학생의 점수를 입력하세요");
            score[i]=in.nextDouble();
            sum+=score[i];
            if (score[i]>max) {
                max=(int) score[i];
            }
        }
        average=(double) sum/score.length;
        System.out.println("총합 : "+ sum +"평균 : "+ average);
        System.out.println("가장 큰 수는" + max);
    
    }
}
