// 백준알고리즘 2588번 문제 

import java.util.Scanner;

public class BAEKJOON_2588 {

	public static void main(String[] args) {

		int number1;
		String number2;
		int n[] = new int[3];
		int result;

		Scanner scan = new Scanner(System.in);

		number1 = scan.nextInt();
		number2 = scan.next();

		String str[] = number2.split("");

		n[0] = number1 * Integer.parseInt(str[2]);
		n[1] = number1 * Integer.parseInt(str[1]);
		n[2] = number1 * Integer.parseInt(str[0]);
		result = number1 * Integer.parseInt(number2);

		for(int i=0; i<n.length; i++) 
			System.out.println(n[i]);
		System.out.println(result);
		
	}
}