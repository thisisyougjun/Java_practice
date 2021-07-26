public class MethodTest {
	public static void main(String[] args) {
		System.out.println(sum("안녕하세요", " 양영디지털 여러분") );
		System.out.println(sum(4, 5));
		System.out.println(sum(5, 7, 9));
	}

    public static String sum(String a, String b) {
        return "입력된 문자열 : " + a + b;
    }

    public static String sum(int a, int b) {
        return "입력된 숫자의 합 : " + (a + b);
    }

    public static String sum(int a, int b, int c) {
        return "입력된 숫자의 합 : " + (a + b + c);
        
    }
}