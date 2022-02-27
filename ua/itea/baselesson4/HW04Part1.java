package ua.itea.baselesson4;

public class HW04Part1 {
	public static void main(String[] args) {
		int myInt = (int)(Math.random() * 1_000_000_000); //1 лям - чтобы было разное количество цифр чаще ;) Почему?
		int myIntTemp = myInt;
		int countEven = 0;
		int countDigits = 0;
		do {
			if (myIntTemp % 2 == 0) {
				countEven++;
			}
			myIntTemp = myIntTemp / 10;
			countDigits++;
		} while (myIntTemp > 0);
		System.out.println("int: " + myInt + " has " + countDigits + " digits and " + countEven + " even digits.");
	}
}
