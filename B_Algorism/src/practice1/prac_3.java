package practice1;
//���� �˰��� 5545�� �ְ��� ���� 

import java.util.Arrays;
import java.util.Scanner;

public class prac_3 {
	public static void main(String[] args) {

		int N; // ������ ������ ��
		int priceDough; // ������ ����
		int priceTopping; // ������ ����
		int caloryDough; // ������ ����
		int sumCalory; // �� Į�θ�
		int sumprice; // ������ ����
		int maxResult = 0; // 1���� �ְ��� ����
		int minResult; // 1���� ������ ����
		int count = 0; // ���� �� ī��Ʈ

		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		int[] caloryTopping = new int[N]; // ������ Į�θ� �迭

		priceDough = sc.nextInt();
		priceTopping = sc.nextInt();
		caloryDough = sc.nextInt();

		sumCalory = caloryDough; // �� Į�θ��� ���� Į�θ� �߰�
		minResult = sumCalory / priceDough;

		for (int i = 0; i < N; i++) {// �迭�� ���� Į�θ� �� ����
			caloryTopping[i] = sc.nextInt();
		}

		Arrays.sort(caloryTopping); // ������������ ���� Į�θ��� ����

		for (int i = N - 1; i >= 0; i--) { // �ְ��� ���� ã�� ����

			if (minResult > maxResult) {

				count++; // �߰��ϴ� ���μ� �Ѱ� ����
				maxResult = minResult;
				sumprice = priceDough + priceTopping * count;
				sumCalory += caloryTopping[i];
				minResult = sumCalory / sumprice;
			} 
			else {
				maxResult = minResult;
			}

		}

		System.out.println(maxResult);
	}

}
