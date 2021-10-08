import java.util.Scanner;

public class d1008 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		Number number = new Number();
		
		System.out.printf(
			"%d %d %d %d %d",
			number.add(a, b),
			number.sub(a, b),
			number.mul(a, b),
			number.div(a, b),
			number.rest(a, b)
        );
    }
}

class Number{

    public static int add(int a, int b) {
       return a+b;
    }
    public static int sub(int a, int b) {
        return a-b;
     }
     public static int mul(int a, int b) {
        return a*b;
     }
     public static int div(int a, int b) {
        return a/b;
     }
     public static int rest(int a, int b) {
        return a%b;
     }
}
