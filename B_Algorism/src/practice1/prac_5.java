package practice1;

//���� �˰��� 1929�� �Ҽ� ���ϱ�  
import java.util.Scanner;

public class prac_5 {
	public static void main(String[] args) {
		int N;
		int M;
		int count; // ������ Ƚ���� ī��Ʈ �ϴ� ����

		Scanner sc = new Scanner(System.in);
		M = sc.nextInt(); // ���� N
		N = sc.nextInt(); // ���� M

		while (M <= N) { // M�̻� N���� �Ҽ� ã��
			count = 0; // Ƚ�� �ʱ�ȭ
			for (int i = 1; i <= N; i++) {

				if (M % i == 0) { // M�� 1~N ���� ����� �������� Ƚ�� ����
					count += 1;
				}
			}

			if (count < 3) { // Ƚ���� 3�� �̻��� �Ҽ��� �ƴϱ� ������ �� ���ϸ� �Ҽ���
				System.out.println(M);
			}
			M++; // �Ҽ� �Ǻ� �� �� N�� ����

		}

	}

}
