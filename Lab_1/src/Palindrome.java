//палиндром - это слово, одинаково читающееся в обоих направлениях
public class Palindrome {
	//процедура сравнивания исходного и обратного слова
	public static void main (String[] args) {
		for (int i = 0; i < args.length; i++) { //перебираем символы в исходном слове
			String s = args[i]; 
			if (s.equals(reverseString(s))) { //сравниваем со строкой символов обратного слова
                System.out.printf ("Слово %s является палиндромом.\n",s); //вывод на экран
            }
            else {
                System.out.printf ("Слово %s не является палиндромом.\n",s); //вывод на экран
            }
		}
	}
	//функция создания строки из обратной последовательности символов исходной строки
	public static String reverseString (String word) {
        String newWord = ""; // слово, которое мы получим при преобразвании
        for (int i = word.length() - 1; i >= 0; i--) { //перебираем символы в исходном слове с конца
            newWord += word.charAt(i); //добавляем в обратное слово
        }
        return newWord;
    }
}