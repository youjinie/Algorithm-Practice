package practice1;

//백준 알고리즘 7795번 먹을 것 인가 먹힐 건인가 
import java.util.Scanner;

public class prac_8 {
	public static void main(String[] args) {
		int T; // 테스트 케이스 개수
		int N; // A의 수
		int M; // B의 수
		int[] size1; // A의 크기
		int[] size2; // B의 크기
		int count; // A가 B보다 큰 쌍의 개수

		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		N = sc.nextInt();
		size1 = new int[N];
		M = sc.nextInt();
		size2 = new int[M];

		while (T > 0) {
			count = 0;
			for (int i = 0; i < N; i++) { // A의 수 입력
				size1[i] = sc.nextInt();
			}

			for (int j = 0; j < M; j++) { // B의 수 입력
				size2[j] = sc.nextInt();
			}

			for (int k = 0; k < N; k++) { // A보다 b보다 큰 쌍 개수 찾기
				for (int h = 0; h < M; h++) {
					if (size1[k] > size2[h]) {
						count++;
					}
				}
			}
			System.out.println(count);
			T--;
		}

	}

}
