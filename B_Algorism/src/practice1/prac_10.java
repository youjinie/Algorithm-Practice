package practice1;
//���� �˰��� 4948�� ����Ʈ�� ����
import java.util.Scanner;

public class prac_10 {
	public static void main(String[] args) {
		int n; // �ڿ��� n
		int count=0; // �Ҽ��� ����
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int c = 0; // �Ҽ� �Ǻ� ����
			n = sc.nextInt();
			count = 0;
			if(n == 0) {
				break;
			}
			// �����佺�׽��� ü�� �̿��Ͽ� �Ҽ����ϱ� -> ������ ������ ã������ �ð��� �ſ� �����ɸ�
			for(int i = n+1; i<= n*2; i++) {
				c = 0;
				int b = (int)Math.sqrt(i) + 1; // n�� ������ �� 
				
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
