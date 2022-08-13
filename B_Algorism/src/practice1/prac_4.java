package practice1;

//���� �˰��� 1463�� 1�� ����� 
import java.util.Scanner;

public class prac_4 {
	public static void main(String[] args) {
		int N;

		Scanner sc = new Scanner(System.in);
		N = sc.nextInt(); // ���� �Է� �ޱ�

		int[] array = new int[N + 1];
		array[0] = 0; // 0�ϋ��� 0
		array[1] = 0; // 1�϶� ����Ƚ���� 0��

		for (int i = 2; i <= N; i++) { // 2���� ��� ����

			array[i] = array[i - 1] + 1; // 1�� ��� �Q���� ������ Ƚ�� (�ִ� ���� Ƚ�� -> �� ���)

			if (i % 2 == 0) { 
				array[i] = Math.min(array[i], array[i / 2] + 1); // �迭���� ���ؼ� �� ������ ���� array[1] = 0 �̹Ƿ� �������� +1  

			} 
			if (i % 3 == 0) {
				array[i] = Math.min(array[i], array[i / 3] + 1); // �迭���� ���ؼ� �� ������ ����
			}

		}
		System.out.println(array[N]);

	}

}
