import java.util.Scanner;

public class HeightClass {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

    int[][] height =new int [3][2];

    for(int i =0; i<3; i++){
        System.out.println((i+1)+ "���� Ű�� �Է��մϴ�.");
        for(int j=0; j<2; j++){
            System.out.println((j+1)+ "���� Ű�� �Է��ϼ���");
            height[i][j]=in.nextInt();
        }
    }


    System.out.println("�Էµ� Ű");
    for (int i = 0; i < 3; i++) {
        System.out.println((i+1)+ "�� Ű :");
        for (int j = 0; j < 2; j++) {
            System.out.println(height[i][j]+ ",");
        }
        System.out.println("");
    }
    
    in.close();
    }
}
