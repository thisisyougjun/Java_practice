public class Duck {
    public static void main(String[] args) {
        int Hr = 17;
        int min =48;
        int sec =59;
        int a =6015;
        int b=0;
        int c;

        b=a/60;
        c=a%60;
        
        System.out.println(Hr+" "+(min+b)+" "+(sec+c));
       
    }
}
