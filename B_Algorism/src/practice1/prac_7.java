package practice1;

//���� �˰��� 11659�� ���� �� ���ϱ� 4 
import java.util.Scanner;

public class prac_7 {
	public static void main(String[] args) {
		int N; // ���� ����
		int M; // ���� ���ؾ� �ϴ� Ƚ��
		int result = 0; // ��
		int i, j; // ����

		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		
		int[] number = new int[N]; // �Է��� N�� ���� �迭

		for (int k = 0; k < N; k++) { // �迭 �� �ʱ�ȭ
			number[k] = sc.nextInt();
		}
		
		for (int h = 0; h < M; h++) { // ���� �Է�
			result = 0; // ���� ���ϸ� �ٽ� ���� ���� 0���� ����
			i = sc.nextInt();
			j = sc.nextInt();

			for (int l = i - 1; l < j; l++) { // ���
				result += number[l];
			}
			System.out.println(result);

		}

	}

}
