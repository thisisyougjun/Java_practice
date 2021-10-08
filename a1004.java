public class a1004 {
    public static void main(String[] args) {
        String a = "12345";
		String b = "67890";
        int result=Integer.parseInt(a)+Integer.parseInt(b);
        System.out.print(result+" ");

        result=Integer.parseInt(b)-Integer.parseInt(a);
        System.out.print(result+" ");

        result=Integer.parseInt(a)*Integer.parseInt(b);
        System.out.println(result);

    }
}
