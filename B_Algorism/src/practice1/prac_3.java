package practice1;
//백준 알고리즘 5545번 최고의 피자 

import java.util.Arrays;
import java.util.Scanner;

public class prac_3 {
	public static void main(String[] args) {

		int N; // 토핑의 종류의 수
		int priceDough; // 도우의 가격
		int priceTopping; // 토핑의 가격
		int caloryDough; // 도우의 열량
		int sumCalory; // 총 칼로리
		int sumprice; // 피자의 가격
		int maxResult = 0; // 1원당 최고의 열량
		int minResult; // 1원당 최저의 열량
		int count = 0; // 토핑 수 카운트

		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		int[] caloryTopping = new int[N]; // 토핑의 칼로리 배열

		priceDough = sc.nextInt();
		priceTopping = sc.nextInt();
		caloryDough = sc.nextInt();

		sumCalory = caloryDough; // 총 칼로리에 도우 칼로리 추가
		minResult = sumCalory / priceDough;

		for (int i = 0; i < N; i++) {// 배열에 토핑 칼로리 값 저장
			caloryTopping[i] = sc.nextInt();
		}

		Arrays.sort(caloryTopping); // 오름차순으로 토핑 칼로리를 정렬

		for (int i = N - 1; i >= 0; i--) { // 최고의 피자 찾는 과정

			if (minResult > maxResult) {

				count++; // 추가하는 토핑수 한개 증가
				maxResult = minResult;
				sumprice = priceDough + priceTopping * count;
				sumCalory += caloryTopping[i];
				minResult = sumCalory / sumprice;
			} 
			else {
				maxResult = minResult;
			}

		}

		System.out.println(maxResult);
	}

}
