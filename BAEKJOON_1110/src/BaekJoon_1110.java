// BaekJoon - ������ȣ 1110

import java.util.Scanner;

public class BaekJoon_1110 {

	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);

		int start_n = scan.nextInt();  
		int n = start_n;
		int count = 0;

		if(0<=start_n && start_n <=99 ) {
			while(true) {	
				int n1 = n%10; // ���� �ڸ�
				int n2 = n/10; // ���� �ڸ�
				int n3 = n2+n1; // �����ڸ� �� + �����ڸ� ��
				int new_n= n1*10 + n3%10;
				count++;
				if(start_n == new_n) break;
				n=new_n;
			}
			System.out.println(count);
		}
	}
}