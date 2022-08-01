package hw05ifElse;

/**
 * Задание 4
 * Совершенное число – натуральное число, равное сумме всех
 * своих собственных делителей (то есть всех положительных
 * делителей, отличных от самого числа).
 * Показать на экране все совершенные числа в диапазоне от
 * 0 до 1 000 000.
 * Примеры:
 * 1-е совершенное число: 6 имеет следующие собственные
 * делители – 1, 2, 3; их сумма равна 6.
 * 2-е совершенное число: 28 имеет следующие собственные
 * делители: – 1, 2, 4, 7, 14; их сумма равна 28.
 */
public class Task04 {
        public static void main(String[] args) {
            int start = 1; // от сюда начало
            int cap = 1_000_000; // это конец
            for (start = 1; start < cap; start++){ // старт смещается к конечной цифре 1_000_000
                int k = 0; // переменная для накопления
                for (int i = 1; i < start; i++) { // старт является конечной точкой до которой считают сумму
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
