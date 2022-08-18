package practice1;
//백준 알고리즘 4948번 베르트랑 공준
import java.util.Scanner;

public class prac_10 {
	public static void main(String[] args) {
		int n; // 자연수 n
		int count=0; // 소수의 개수
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int c = 0; // 소수 판별 변수
			n = sc.nextInt();
			count = 0;
			if(n == 0) {
				break;
			}
			// 에라토스네스의 체를 이용하여 소수구하기 -> 일일히 나눠서 찾을려니 시간이 매우 오래걸림
			for(int i = n+1; i<= n*2; i++) {
				c = 0;
				int b = (int)Math.sqrt(i) + 1; // n의 제곱근 값 
				
				for(int j = 2; j<b; j++) {
					if(i%j == 0) {
						c = 1;
						break;
					}
				}
				if(c == 0) {
					count++;
				}
			}			
			System.out.println(count);
		}

	}

}
