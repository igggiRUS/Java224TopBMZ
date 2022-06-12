package test;

import java.util.Scanner;

public class switchCaseMounth {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Введите день рождения: ");
		if (sc.hasNextInt()) {
			int dayBirthDay = sc.nextInt();
//			if (1 < dayBirthDay && dayBirthDay < 31) {
//			} else {
//				System.out.println();
//			}
			System.out.println("Введите месяц рождения: ");

			int mountBirthDay = sc.nextInt();
//			if (1 < mountBirthDay && mountBirthDay < 31) {
//			} else {
//				System.out.println();
//			}

			sc.close();
			System.out.println("День: " +  dayBirthDay + " Месяц: " + mountBirthDay);

			switch (mountBirthDay) {
			case 1:
				if (mountBirthDay == 1 && dayBirthDay < 22) {
					System.out.println("Козерог");
				} else {
				System.out.println("Водолей");
				break;
				}
			case 2:
				if (mountBirthDay == 2 && dayBirthDay < 20) {
					System.out.println("Водолей");
				} else {
				System.out.println("Рыбы");
				break;
				}
			case 3:
				if (mountBirthDay == 3 && dayBirthDay < 19) {
					System.out.println("Рыбы");
				} else {
				System.out.println("Овен");
				break;
				}
			case 4:
				if (mountBirthDay == 4 && dayBirthDay < 21) {
					System.out.println("Овен");
				} else {
				System.out.println("Телец");
				break;
				}
			case 5:
				if (mountBirthDay == 5 && dayBirthDay < 20) {
					System.out.println("Телец");
				} else {
				System.out.println("Близнецы");
				break;
				}
			case 6:
				if (mountBirthDay == 6 && dayBirthDay < 21) {
					System.out.println("Близнецы");
				} else {
				System.out.println("Рак");
				break;
				}
			case 7:
				if (mountBirthDay == 7 && dayBirthDay < 21) {
					System.out.println("Рак");
				} else {
				System.out.println("Лев");
				break;
				}
			case 8:
				if (mountBirthDay == 8 && dayBirthDay < 23) {
					System.out.println("Лев");
				} else {
				System.out.println("Дева");
				}
				break;
			case 9:
				if (mountBirthDay == 9 && dayBirthDay < 23) {
					System.out.println("Дева");
				} else {
				System.out.println("Весы");
				}
				break;
			case 10:
				if (mountBirthDay == 10 && dayBirthDay < 23) {
					System.out.println("Весы");
				} else {
				System.out.println("Скорпион");
				}
				break;
			case 11:
				if ( mountBirthDay == 11 && dayBirthDay < 23) {
					System.out.println("Скорпион");
				} else {
				System.out.println("Стрелец");
				}
				break;
			case 12:
				if ( mountBirthDay == 12 && dayBirthDay < 23) {
					System.out.println("Стрелец");
				} else {
				System.out.println("Козерог");
				}
				break;
			default:
				System.err.println("Ошибка");
				break;
			}

		}
	}
}
