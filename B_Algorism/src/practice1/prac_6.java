package practice1;

//백준 알고리즘 9095번 1,2,3 더하기
import java.util.Scanner;

public class prac_6 {
	public static void main(String[] args) {
		int T; // 테스트 케이스의 개수 T
		int n; // 정수 n (0<n<11)

		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();

		for (int i = 0; i < T; i++) {
			n = sc.nextInt();
			
			if (n > 0 && n < 11) {
				System.out.println(search(n));
			}
		}
	}

	public static int search(int n) { // n을 1,2,3의 합으로 나타내는 방법의 수 계산
		int count = 0; // 방법수

		if (n == 1) { // 정수가 1 일때 1만 가능
			count = 1;
		} else if (n == 2) { // 정수가 2일떄 1+1,2만 가능
			count = 2;
		} else if (n == 3) { // 정수가 3일때 1+1+1, 1+2, 3+1, 4만 가능
			count = 4;
		} else { // 그 이후 숫자는 (n-1)의 방법수 + (n-2)의 방밥수 + (n-3)의 방법수
			count = search(n - 1) + search(n - 2) + search(n - 3);
		}
		return count;

	}
}
