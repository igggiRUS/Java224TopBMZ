package hw03;

import java.util.Scanner;

public class task04 {
	public static void main(String[] args) {
//	    Проверка число ли введено


		Scanner sc = new Scanner(System.in);

		System.out.println("Введите X: ");
		int x = sc.nextInt();
		
		System.out.println("Введите Y: ");
		int y = sc.nextInt();
		sc.close();

		if (x < 0 & y < 0) {
			System.out.println("III");
		} else if (x > 0 & y > 0) {
			System.out.println("I");
		} else if (x > 0 & y < 0) {
			System.out.println("IV");
		} else if (x < 0 & y > 0) {
			System.out.println("II");
		} else {
			System.out.println("Магия");
		}
	}
}
