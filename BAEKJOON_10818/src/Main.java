// 문제 번호 10818

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int array[] = new int[n];

		if(1<=n && n<=1000000) {
			for(int i=0; i<array.length; i++)
				array[i]=scan.nextInt();
		}

		int max = array[0];
		int min = array[0];

		for(int i=0; i<array.length; i++) {
			if(array[i] > max)
				max=array[i];
			if(array[i] < min)
				min = array[i];
		}
	}

}
