import java.util.Scanner;

public class vucut_kitle_indeksi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		float boy;
		int kilo;
		
		System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz :");
		boy=scan.nextFloat();
		
		
		System.out.println("Lütfen kilonuzu giriniz :");
		kilo=scan.nextInt();
		
		float vucut_index=kilo/(boy*boy);
		
		System.out.println("vucut kitle indexiniz:"+vucut_index);
	}

}
