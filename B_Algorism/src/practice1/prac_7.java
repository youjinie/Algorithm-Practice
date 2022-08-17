package practice1;

//백준 알고리즘 11659번 구간 합 구하기 4 
import java.util.Scanner;

public class prac_7 {
	public static void main(String[] args) {
		int N; // 수의 개수
		int M; // 합을 구해야 하는 횟수
		int result = 0; // 합
		int i, j; // 범위

		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		
		int[] number = new int[N]; // 입력한 N을 담을 배열

		for (int k = 0; k < N; k++) { // 배열 값 초기화
			number[k] = sc.nextInt();
		}
		
		for (int h = 0; h < M; h++) { // 범위 입력
			result = 0; // 합을 구하면 다시 합의 값을 0으로 변경
			i = sc.nextInt();
			j = sc.nextInt();

			for (int l = i - 1; l < j; l++) { // 출력
				result += number[l];
			}
			System.out.println(result);

		}

	}

}
