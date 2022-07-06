import java.util.Scanner;

public class Ders6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Notunu giriniz:");
		
		int not=scan.nextInt();
		
		if(not>70) {
			System.out.println("Dersten geçtiniz");
		}
		
		else if(not>60){
			System.out.println("geçtin harf notun ab");
		}
		else {
			System.out.println("geçemediniz");
		}
		
		
		
		
		
		
		
		
	}

}
