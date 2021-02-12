// ����� �������, ���� ��� ������� ������� ������ �� ���� ���� � �� �������
public class Primes {
	//��������� ������ �� ����� ������� ����� � ��������� �� 2 �� 100
	public static void main (String[] args) {
		for (int i = 2; i <= 100; i++) { //� ����� ���������� �����
			if (isPrime(i) == true) {
				System.out.printf ("%d ", i); //������� �� �����
			}
		}
	}
	//������� ����������� ������� �����
	public static boolean isPrime (int n) {
		boolean Prime = true; //���������� ������� ����� �������
		for (int i = 2; i < n; i++) { //� ����� ���������� �����
			if (n%i == 0) { //���� ���������� ��� �������, �� ����� ���������
				Prime = false;
			}
		}
		return Prime;		
	}
}