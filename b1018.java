import java.util.Scanner;

public class b1018 {
    public static void main(String[] args) throws Exception {
		Hakjum hakjum = new Hakjum();
		hakjum.run();	
	}
}
class Hakjum {
	// 클래스를 완성하세요
	int kor;
	int eng;
	int mat;
	int result;
	String grade;
	public Hakjum() {
		Scanner scn = new Scanner(System.in);
		this.kor = scn.nextInt();
		this.eng = scn.nextInt();
		this.mat = scn.nextInt();
		scn.close();
	}
	public void run() {
		
		result=(kor+eng+mat)/3;
		System.out.println(grade);
		
	}
	public char getAverage() {
        if (100>=result && result >90 ) {
            grade="A";
        }else if (90>=result && result >80 ) {
            grade="B";
        }else if (80>=result && result >70 ) {
            grade="C";
        }else if (70>=result && result >60 ) {
            grade="D";
        }else if (60>=result && result >0 ) {
            grade="E";
        }
		return grade;
	}
	
}