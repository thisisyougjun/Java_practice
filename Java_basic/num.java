package Java_basic;

public class num {
    public static void main(String[] args) {
        int num1[]={90,25,67,45,80};

        for (int i = 0; i < num1.length; i++) {
            if (num1[i]<60) {
               continue;
            }
            System.out.println("합격입니다");
        }
    }
}
