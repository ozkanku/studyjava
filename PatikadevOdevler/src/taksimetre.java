import java.util.Scanner;

public class taksimetre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int mesafe;
		float kmTutari=2.20f;
		int taksimetreAcilis=10;
		double taksiUcret;
		Scanner scan=new Scanner(System.in);
		System.out.println("gidilen mesafeyi yaziniz:");
		mesafe=scan.nextInt();
		
		taksiUcret=taksimetreAcilis+mesafe*kmTutari;
		
		//taksiUcret=(taksiUcret<=20)?20:taksiUcret;
		
		if(taksiUcret<=20) {
			taksiUcret=20;
		}
		
		System.out.println("taksi ücretiniz:"+taksiUcret);
		
		

	}

}
