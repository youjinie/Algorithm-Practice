package practice1;

//백준 알고리즘 10974번 모든 순열 
import java.util.Scanner;

public class prac_1 { // 재귀 함수 이용
	public static void main(String[] args) {
		int N;

		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();

		int[] num = new int[N]; // 숫자들을 담을 배열
		int[] outnum = new int[N]; // 출력할떄 쓰일 배열
		boolean[] check = new boolean[N]; // 중복 방지

		if (N >= 1 && N <= 8) { // 1<= N <=8
			for (int i = 0; i < N; i++) { // 숫자 담기
				num[i] = i + 1;
			}
			PrintPermutation(num, check, N, outnum, 0); // 출력 메소드

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
		for (int i = 0; i < n; i++) { // true일경우 이미 쓰인 숫자, false일 경우 쓰이지 않은 숫자
			if (!check[i]) { // 아직 출력안한 숫자인 경우
				check[i] = true;
				outnum[a] = num[i];

				PrintPermutation(num, check, n, outnum, a + 1);
				check[i] = false;
			}
		}

	}

}
