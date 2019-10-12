// 백준 문제 번호 3052

import java.util.Scanner;

public class Baekjoon_3052 {

	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		
		int count=0;
		int RemainderOfNumber[] = new int[42];
		
		for(int i=0; i<10; i++)
			RemainderOfNumber[scan.nextInt() % 42]++;
				
	    for(int i=0; i<RemainderOfNumber.length; i++)
		 if(RemainderOfNumber[i] > 0) count++;
					
	    System.out.println(count);
				
	}	
}