package Java_basic;

public class GuGu3 {
    int dan;

    public GuGu3(int dan) {
        this.dan = dan;
    }

    public int get(int seq) {
        return this.dan * seq;
    }

    public int[] all() {
        int[] result = new int[9];
        for(int i=0; i<9; i++) {
            result[i] = this.get(i+1);
        }
        return result;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        int[] result = all();
        for(int i=0;i<result.length; i++) {
            sb.append(result[i]);
            if(i!=result.length-1) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        GuGu3 gugu = new GuGu3(2);
        System.out.println(gugu.get(3));
        System.out.println(gugu);
        for(int i=2; i<10; i++) {
            System.out.println(new GuGu3(i));
        }
    }
}