public class Method2 {
    int a;
    public void myTest(){
        this.a++;
    }
    public static void main(String[] args) {
        Method2 pp =new Method2();
        pp.a=1;
        pp.myTest();
        System.out.println(pp.a);
    }
}
