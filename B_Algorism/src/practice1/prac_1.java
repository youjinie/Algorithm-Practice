package practice1;

//���� �˰��� 10974�� ��� ���� 
import java.util.Scanner;

public class prac_1 { // ��� �Լ� �̿�
	public static void main(String[] args) {
		int N;

		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();

		int[] num = new int[N]; // ���ڵ��� ���� �迭
		int[] outnum = new int[N]; // ����ҋ� ���� �迭
		boolean[] check = new boolean[N]; // �ߺ� ����

		if (N >= 1 && N <= 8) { // 1<= N <=8
			for (int i = 0; i < N; i++) { // ���� ���
				num[i] = i + 1;
			}
			PrintPermutation(num, check, N, outnum, 0); // ��� �޼ҵ�

		} else {
			return;
		}
	}

	public static void PrintPermutation(int[] num, boolean[] check, int n, int[] outnum, int a) {

		if (a == n) {
			for (int i = 0; i < n; i++) {
				System.out.print(outnum[i] + " ");
			}
			System.out.println("");
			return;
		}
		for (int i = 0; i < n; i++) { // true�ϰ�� �̹� ���� ����, false�� ��� ������ ���� ����
			if (!check[i]) { // ���� ��¾��� ������ ���
				check[i] = true;
				outnum[a] = num[i];

				PrintPermutation(num, check, n, outnum, a + 1);
				check[i] = false;
			}
		}

	}

}
