// 백준 문제 번호 3052

import java.util.Scanner;

public class Baekjoon_3052 {

	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		
		int count = 0;
		int number[] = new int[10];
		int remainderOfNumber[] = new int[10];
		
		for(int i=0; i<number.length; i++) {
			number[i] = scan.nextInt();
			remainderOfNumber[i] = number[i] % 42;
		}
		
		for(int i=0; i<number.length; i++)
			if(number[i] != remainderOfNumber[i]) count++;
				
		System.out.println(count);
				
	}	
}