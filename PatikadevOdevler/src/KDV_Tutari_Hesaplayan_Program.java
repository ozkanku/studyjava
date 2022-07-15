import java.util.Scanner;

public class KDV_Tutari_Hesaplayan_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kdv;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lütfen para değerini giriniz");
		int para=scan.nextInt();
		if(para<1000) {
			kdv=18;
		}
		else {
			kdv=8;
		}
		
		double kdvTutar=para*0.18;
		double kdvliFiyat=para+kdvTutar;
		
		System.out.println("Kdv'siz fiyat:"+para);
		System.out.println("kdv'li fiyat:"+kdvliFiyat);
		System.out.println("kdv tutarı:"+kdvTutar);
		
		
		

	}

}
