package practice1;

//���� �˰��� 3474�� ������ �� ����  
import java.util.Scanner;

public class prac_2 { // 5�� ����� ������ ��ŭ 0�� �پ� ���� and N�� 5�� ��������� �ѹ��� ī��Ʈ���ֱ�
	public static void main(String[] args) {
		int T; // �׽�Ʈ ���̽� ����
		int N; // ���� (1<= N <= 10000000000)
		int count = 0; // 0�� �� ����
		int div; // 5 or 5�� ������
		Scanner sc = new Scanner(System.in);

		T = sc.nextInt();

		for (int i = 0; i < T; i++) { // �׽�Ʈ ���̽� ��ŭ �ݺ�
			N = sc.nextInt();
			div = 5;

			while (N >= div) {
				count += N / div;
				div *= 5;
			}

			System.out.println(count);
			count = 0;

		}

	}

}
