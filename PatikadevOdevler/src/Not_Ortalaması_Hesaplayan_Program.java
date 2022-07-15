import java.util.Scanner;

public class Not_Ortalaması_Hesaplayan_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Scanner sınıfımızı tanımladık
		Scanner scan=new Scanner(System.in);
		
		//kullanıcıdan değer alma
		
		System.out.println("Matematik notunuz:");
		int mat=scan.nextInt();
		
		System.out.println("Fizik notunuz:");
		int fizik=scan.nextInt();
		
		System.out.println("Kimya notunuz:");
		int kimya=scan.nextInt();
		
		System.out.println("Türkçe notunuz:");
		int turkce=scan.nextInt();
		
		System.out.println("Tarih notunuz:");
		int tarih=scan.nextInt();
		
		System.out.println("Müzik notunuz:");
		int muzik=scan.nextInt();
		
		int toplam=(mat+fizik+kimya+turkce+tarih+muzik);
		
		double sonuc=toplam/6.0;
		
		System.out.println("ortalamanız: "+sonuc);
		
		System.out.println((sonuc>60)?"Geçti":"Kaldı");
		
		

	}

}
