import java.util.Scanner;

public class Baekjoon_15596 {

	public static long sum(int[] a) {
		long result = 0;
		for(int i=0; i<a.length; i++)
			result += a[i];
		return result;
	}
	
	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		if(1<=n && n<=3000000) {
			int a[] = new int[n];

			for(int i=0; i<n; i++) {
				a[i] = scan.nextInt();
			}

			System.out.println(sum(a));
		}

	}
}
