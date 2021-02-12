//��������� - ��� �����, ��������� ���������� � ����� ������������
public class Palindrome {
	//��������� ����������� ��������� � ��������� �����
	public static void main (String[] args) {
		for (int i = 0; i < args.length; i++) { //���������� ������� � �������� �����
			String s = args[i]; 
			if (s.equals(reverseString(s))) { //���������� �� ������� �������� ��������� �����
                System.out.printf ("����� %s �������� �����������.\n",s); //����� �� �����
            }
            else {
                System.out.printf ("����� %s �� �������� �����������.\n",s); //����� �� �����
            }
		}
	}
	//������� �������� ������ �� �������� ������������������ �������� �������� ������
	public static String reverseString (String word) {
        String newWord = ""; // �����, ������� �� ������� ��� �������������
        for (int i = word.length() - 1; i >= 0; i--) { //���������� ������� � �������� ����� � �����
            newWord += word.charAt(i); //��������� � �������� �����
        }
        return newWord;
    }
}