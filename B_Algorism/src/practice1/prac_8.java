package practice1;

//���� �˰��� 7795�� ���� �� �ΰ� ���� ���ΰ� 
import java.util.Scanner;

public class prac_8 {
	public static void main(String[] args) {
		int T; // �׽�Ʈ ���̽� ����
		int N; // A�� ��
		int M; // B�� ��
		int[] size1; // A�� ũ��
		int[] size2; // B�� ũ��
		int count; // A�� B���� ū ���� ����

		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		N = sc.nextInt();
		size1 = new int[N];
		M = sc.nextInt();
		size2 = new int[M];

		while (T > 0) {
			count = 0;
			for (int i = 0; i < N; i++) { // A�� �� �Է�
				size1[i] = sc.nextInt();
			}

			for (int j = 0; j < M; j++) { // B�� �� �Է�
				size2[j] = sc.nextInt();
			}

			for (int k = 0; k < N; k++) { // A���� b���� ū �� ���� ã��
				for (int h = 0; h < M; h++) {
					if (size1[k] > size2[h]) {
						count++;
					}
				}
			}
			System.out.println(count);
			T--;
		}

	}

}
