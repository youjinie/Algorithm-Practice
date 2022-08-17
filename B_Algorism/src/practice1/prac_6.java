package practice1;

//���� �˰��� 9095�� 1,2,3 ���ϱ�
import java.util.Scanner;

public class prac_6 {
	public static void main(String[] args) {
		int T; // �׽�Ʈ ���̽��� ���� T
		int n; // ���� n (0<n<11)

		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();

		for (int i = 0; i < T; i++) {
			n = sc.nextInt();
			
			if (n > 0 && n < 11) {
				System.out.println(search(n));
			}
		}
	}

	public static int search(int n) { // n�� 1,2,3�� ������ ��Ÿ���� ����� �� ���
		int count = 0; // �����

		if (n == 1) { // ������ 1 �϶� 1�� ����
			count = 1;
		} else if (n == 2) { // ������ 2�ϋ� 1+1,2�� ����
			count = 2;
		} else if (n == 3) { // ������ 3�϶� 1+1+1, 1+2, 3+1, 4�� ����
			count = 4;
		} else { // �� ���� ���ڴ� (n-1)�� ����� + (n-2)�� ���� + (n-3)�� �����
			count = search(n - 1) + search(n - 2) + search(n - 3);
		}
		return count;

	}
}
