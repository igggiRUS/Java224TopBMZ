package hw02;

// 914400 +300 +33
public class task11v1 {
	public static void main(String[] args) {
		int newYear = 914733;
		int seconds = 60;
		int minute = 60;
		int hour = minute * seconds;
		int day = 24 * hour;
		int d1 = newYear / day;
		int h1 = (newYear % day) / hour;
		int m1 = (newYear % hour) / minute;
		int s1 = (newYear % hour) % minute;
		System.out.println(d1 + ":" + h1 + ":" + m1 + ":" + s1);
	}
}
