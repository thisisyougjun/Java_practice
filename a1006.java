public class a1006 {
    public static void main(String[] args) throws Exception {
		int a;
        int b;
        int result=0;
        int result2=0;
        for (int i = 1; i <=100; i++) {
           if (i%3==0) {
            result+=i;
           }
           if (i%7==0) {
            result2+=i;
           }
        }
        System.out.println(result+result2);
	}
}
