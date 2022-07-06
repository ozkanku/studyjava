import java.util.Scanner;

public class Ders7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println("sonuc:"+((3>4)&&("yazılım"=="yazılım")));
		
		//System.out.println("sonuc:"+((3>4)||("yazılım"=="yazılım")));
		
		//Kullanıcı adı giriş
		
		String sys_kul_adı="yazilimbilimi";
		String parola="123456";
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("kullanıcı adı giriniz:");
		
		String kullanıcı_adı=scan.nextLine();
		
		System.out.println("parola:");
		
		String kul_parola=scan.nextLine();
		
		if(sys_kul_adı.equals(kullanıcı_adı)&&parola.equals(kul_parola)) {
			System.out.println("giriş başarılı");
		}
		else {
			System.out.println("kullanıcı adı veya parola yanlış");
		}
		
	}

}
