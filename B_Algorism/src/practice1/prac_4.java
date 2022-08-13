package practice1;

//백준 알고리즘 1463번 1로 만들기 
import java.util.Scanner;

public class prac_4 {
	public static void main(String[] args) {
		int N;

		Scanner sc = new Scanner(System.in);
		N = sc.nextInt(); // 정수 입력 받기

		int[] array = new int[N + 1];
		array[0] = 0; // 0일떄는 0
		array[1] = 0; // 1일때 연산횟수는 0번

		for (int i = 2; i <= N; i++) { // 2부터 계산 시작

			array[i] = array[i - 1] + 1; // 1을 계속 뻈을때 나오는 횟수 (최대 연산 횟수 -> 비교 대상)

			if (i % 2 == 0) { 
				array[i] = Math.min(array[i], array[i / 2] + 1); // 배열값을 비교해서 더 작은값 저장 array[1] = 0 이므로 마지막에 +1  

			} 
			if (i % 3 == 0) {
				array[i] = Math.min(array[i], array[i / 3] + 1); // 배열값을 비교해서 더 작은값 저장
			}

		}
		System.out.println(array[N]);

	}

}
