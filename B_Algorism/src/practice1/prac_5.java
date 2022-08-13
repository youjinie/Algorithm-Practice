package practice1;

//백준 알고리즘 1929번 소수 구하기  
import java.util.Scanner;

public class prac_5 {
	public static void main(String[] args) {
		int N;
		int M;
		int count; // 나눠진 횟수를 카운트 하는 변수

		Scanner sc = new Scanner(System.in);
		M = sc.nextInt(); // 정수 N
		N = sc.nextInt(); // 정수 M

		while (M <= N) { // M이상 N이하 소수 찾기
			count = 0; // 횟수 초기화
			for (int i = 1; i <= N; i++) {

				if (M % i == 0) { // M을 1~N 까지 나누어서 나눠지면 횟수 증가
					count += 1;
				}
			}

			if (count < 3) { // 횟수가 3번 이상은 소수가 아니기 떄문에 그 이하면 소수임
				System.out.println(M);
			}
			M++; // 소수 판별 된 후 N값 증가

		}

	}

}
