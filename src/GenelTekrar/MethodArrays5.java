package GenelTekrar;

public class MethodArrays5 {

	public static void main(String[] args) {
		/*
		 * Write a java program that calculates the average value of array elements
		 * 
		 * input[]= {1,2,3,4,5,6,7}
		 * 
		 * Output : 4
		 */
		
		int sayi[]= {1,2,3,4,5,6,7};
		
		int toplam=0;
		
		for (int i = 0; i < sayi.length; i++) {
			toplam+=sayi[i];
		
		}
		System.out.println(toplam /sayi.length);
	}

}
