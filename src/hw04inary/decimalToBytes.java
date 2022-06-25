package hw04inary;
import java.util.Scanner;

/**
 * Данный класс переводит обычное десятичное число в побитовое представление
 *     Integer.toBinaryString()
 *     ЦелоеЧисло.вДвоичнуюСтроку(переменная);
 */

public class decimalToBytes {
    public static void main(String[] args) {

//    Узнаем чему равно число в двоичном коде
        System.out.println("Введите десятичное число: " );
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();
        System.out.printf("Вы ввели число: %s\nРавное бинарному binary числу:\n%s", num, Integer.toBinaryString(num));
    	System.out.print("\nДлинна строки: " + Integer.toBinaryString(num).length());
        }
}
