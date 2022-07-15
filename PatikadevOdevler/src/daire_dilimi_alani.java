import java.util.Scanner;

public class daire_dilimi_alani {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int yaricap;
		float pi=3.14f,alan,cevre;
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("yaricap giriniz");
		yaricap=scan.nextInt();
		
		/*alan=yaricap*yaricap*pi;
		
		cevre=2*pi*yaricap;
		
		System.out.println("cevre:"+cevre+" alan:"+alan);
		*/
		
		/*
		 Ödev
		Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.

		𝜋 sayısını = 3.14 alınız.

		Formül : (𝜋 * (r*r) * 𝛼) / 360 
		 
		 
		 */
		System.out.println("merkez olcusunu giriniz:");
		int merkezolcusu=scan.nextInt();
		float dilimalani=(pi*(yaricap*yaricap)*merkezolcusu)/360;
		System.out.println("daire dilimi alani:"+dilimalani);
	}

}
