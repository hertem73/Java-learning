package day10;

public class C07_SwitchCase {

	public static void main(String[] args) {
		// gun numaras�na g�re g�n isimlerini yazd�ral�m
		
		int gunNo=3;
		
		switch(gunNo) {
		
		case 1:
			System.out.println("Pazartesi");
			break;
		case 2:
			System.out.println("Sali");
			break;
		case 3:
			System.out.println("Carsamba");
			break;
		case 4:
			System.out.println("Persembe");
			break;
		case 5:
			System.out.println("Cuma");
			break;
		case 6:
			System.out.println("Cumartesi");
			break;
		case 7:
			System.out.println("Pazar");
			break;
			
			default:
				System.out.println("Lutfen gecerli bir gun numarasi yaziniz");
		}
		

	}

}
