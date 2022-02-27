package ua.itea.baselesson4;

public class HW04Part2 {
	public static void main(String[] args) {
		double a = 600;
		int discount = 0;

		switch ((int)(a/100)) {
		case 0:
		case 1:
		case 2:
			break;
		case 3:
			discount = 3;
			break;
		case 4:
			discount = 5;
			break;
		default:
			discount = 7;
			break;
		}
		
		System.out.println("Your discount is " + discount + "%, total to pay " + (a - ((a / 100) * discount)));
	}
}
