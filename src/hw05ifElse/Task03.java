package hw05ifElse;

/**
 * Задание 3
 * Самовлюблённое число или число Армстронга – натураль-
 * ное число, которое равно сумме своих цифр, возведенных
 * в степень, равную количеству его цифр.
 * Показать на экране все числа Армстронга в диапазоне от
 * 10 до 1 000 000.
 * Например:
 * 153 = 1 3 + 5 3 + 3 3
 */
public class Task03 {
        public static void main(String[] args) {
            int start = 10; // от сюда начало
            int cap = 1_000; // это конец
            for (start = 1; start < cap; start++){ // старт смещается к конечной цифре 1_000_000
                int k = 0; // переменная для накопления
                for (int i = 10; i < start; i++) { // старт является конечной точкой до которой считают сумму
                    if (start % i == 0) {
                        k += i; // накапливается число
                        // провеить если k >num то отменить следующий подсчет
                    }
                }
                if (start == k) {
                    System.out.println("число верное " + k);
                }
            }
        }
    }

