import java.util.Scanner;

public class ucgen_alan_hesabi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		double c,u,alan;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("a kenarını giriniz:");
		a=scan.nextInt();
		System.out.println("b kenarını giriniz:");
		b=scan.nextInt();
		
		c=Math.sqrt((a*a)+(b*b));
		
		/*
		 Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢

		 𝑢 = (a+b+c) / 2

          Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
		 */
		u=(a+b+c)/2;
		alan=Math.sqrt(u * (u - a)* (u - b) * (u - c));
		
		System.out.println("alan:"+alan);

	}

}
