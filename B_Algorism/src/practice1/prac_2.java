package practice1;

//백준 알고리즘 3474번 교수가 된 현우  
import java.util.Scanner;

public class prac_2 { // 5의 배수가 나오는 만큼 0이 붙어 있음 and N이 5의 제곱수라면 한번더 카운트해주기
	public static void main(String[] args) {
		int T; // 테스트 케이스 갯수
		int N; // 정수 (1<= N <= 10000000000)
		int count = 0; // 0의 총 개수
		int div; // 5 or 5의 제곱수
		Scanner sc = new Scanner(System.in);

		T = sc.nextInt();

		for (int i = 0; i < T; i++) { // 테스트 케이스 만큼 반복
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
