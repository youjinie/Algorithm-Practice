package practice1;

//백준 알고리즘 1735번 분수 합
import java.util.Scanner;

public class prac_9 {
	public static void main(String[] args) {

		int[] A = new int[2]; // 분수 A
		int[] B = new int[2]; // 분수 B
		int result1 = 0; // 합한 뒤 분자
		int result2 = 0; // 합한 뒤 분모
		int g = 1; // 분모와 분자의 최대공약수

		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 2; i++) { // A분수 입력
			A[i] = sc.nextInt();
		}

		for (int j = 0; j < 2; j++) { // B분수 입력
			B[j] = sc.nextInt();
		}

		if (A[1] == B[1]) { // 분모가 같을 경우
			result1 = A[0] + B[0];
			result2 = A[1];
			
			g = gcd(result1, result2);
			result1 /= g;
			result2 /= g;

		} else { // 분모가 다를경우
			result1 = (A[0] * B[1]) + (B[0] * A[1]);
			result2 = A[1] * B[1];
			
			g = gcd(result1, result2);
			result1 /= g;
			result2 /= g;
		}

		System.out.println(result1 + " " + result2); // 결과 값 출력
	}

	public static int gcd(int a, int b) { // 최대공약수 구하기
		if (a == 0) {
			return b;
		}
		return gcd(b % a, a);
	}

}
