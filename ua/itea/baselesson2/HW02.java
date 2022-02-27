package ua.itea.baselesson2;

public class HW02 {
	public static void main(String[] args) {
		double a = 700;
		int discount = 0;

		if (a >= 500) {
            discount = 7;
		} else if (a >= 400) {
			discount = 5;
		} else if (a >= 300) {
			discount = 3;
		}
		
		System.out.println("Your discount is " + discount + "%, total to pay " + (a - ((a / 100) * discount)));
	}
}
