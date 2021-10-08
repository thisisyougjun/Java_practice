import java.io.*;
import java.util.Scanner;
class d1004 {
	public static void main(String[] args) throws Exception {
		Scanner scn = new Scanner(System.in);
		Shape shape = new Shape();
		System.out.printf(
			"%.6f %.1f %.1f",
			shape.area(3), shape.area(4, 5), shape.area(3,4,7)
		);
    }
}

// Shape 클래스를 완성하세요
class Shape {
    final double PI =3.141592;
    public double area(int r){
        double dr=(double)r;
        return dr * dr * PI;
    }
    public double area(int w, int h){
        double dw =(double) w;
        double dh =(double) h;
        return dw * dh;
    }
    public double area(int a, int b ,int c){
        double da =(double) a;
        double db =(double) b; 
        double dc =(double) c;
        return (da  + db) * dc * 0.5;
    }
}
