package practice1;

//���� �˰��� 1735�� �м� ��
import java.util.Scanner;

public class prac_9 {
	public static void main(String[] args) {

		int[] A = new int[2]; // �м� A
		int[] B = new int[2]; // �м� B
		int result1 = 0; // ���� �� ����
		int result2 = 0; // ���� �� �и�
		int g = 1; // �и�� ������ �ִ�����

		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 2; i++) { // A�м� �Է�
			A[i] = sc.nextInt();
		}

		for (int j = 0; j < 2; j++) { // B�м� �Է�
			B[j] = sc.nextInt();
		}

		if (A[1] == B[1]) { // �и� ���� ���
			result1 = A[0] + B[0];
			result2 = A[1];
			
			g = gcd(result1, result2);
			result1 /= g;
			result2 /= g;

		} else { // �и� �ٸ����
			result1 = (A[0] * B[1]) + (B[0] * A[1]);
			result2 = A[1] * B[1];
			
			g = gcd(result1, result2);
			result1 /= g;
			result2 /= g;
		}

		System.out.println(result1 + " " + result2); // ��� �� ���
	}

	public static int gcd(int a, int b) { // �ִ����� ���ϱ�
		if (a == 0) {
			return b;
		}
		return gcd(b % a, a);
	}

}
