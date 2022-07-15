
public class Ders5 {
	public static void main(String[] args) {
		
		double[] myList= {1.2,1.3,4.3,5.6};
		double total=0;
		for(double number:myList) {
			System.out.println(number);
			total+=number;
		}
		System.out.println(total);
		double enbuyuk=myList[0];
		for(double number:myList) {
			if(enbuyuk<=number) {
				enbuyuk=number;
			}
		}
		System.out.println(enbuyuk);
		
		
		
		
		
		
	}
}
