// число простое, если без остатка делится только на само себя и на единицу
public class Primes {
	//процедура вывода на экран простых чисел в диапазоне от 2 до 100
	public static void main (String[] args) {
		for (int i = 2; i <= 100; i++) { //в цикле перебираем числа
			if (isPrime(i) == true) {
				System.out.printf ("%d ", i); //выводим на экран
			}
		}
	}
	//функция определения простых чисел
	public static boolean isPrime (int n) {
		boolean Prime = true; //изначально считаем число простым
		for (int i = 2; i < n; i++) { //в цикле перебираем числа
			if (n%i == 0) { //если поделилось без остатка, то число составное
				Prime = false;
			}
		}
		return Prime;		
	}
}