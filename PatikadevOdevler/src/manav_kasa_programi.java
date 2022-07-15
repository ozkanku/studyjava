import java.util.Scanner;

public class manav_kasa_programi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float armut=2.14f;
		float elma=3.67f;
		float domates=1.11f;
		float muz=0.95f;
		float patlican=5.0f;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("kaç kilo armut  aldınız:");
		int armutKilo=scan.nextInt();
		System.out.println("kaç kilo elma aldınız:");
		int elmaKilo=scan.nextInt();
		System.out.println("kaç kilo domates  aldınız:");
		int domatesKilo=scan.nextInt();
		System.out.println("kaç kilo muz aldınız:");
		int muzKilo=scan.nextInt();
		System.out.println("kaç kilo patlıcan aldınız:");
		int patlicanKilo=scan.nextInt();
		
		float total=armut*armutKilo+elma*elmaKilo+domates*domatesKilo+muz*muzKilo+patlican*patlicanKilo;
		
		System.out.println("total fiyat:"+total);
		

	}

}
