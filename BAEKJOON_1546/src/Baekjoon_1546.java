import java.util.Scanner;

public class Baekjoon_1546 {
	
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		double array[] = new double[N];
		int max =0;
		double sum = 0;
		
		for(int i=0; i<array.length; i++) {
			array[i] = scan.nextDouble();
			if(array[max] < array[i]) max = i;
		}
		
		for(int i=0; i<array.length; i++) {
			array[i] = (array[i]/array[max]) * 100;
			sum += array[i];
		}
		
		System.out.println(sum/N);
		
		
		
	}
}