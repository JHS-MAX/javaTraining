import java.util.Scanner;

public class Baekjoon_15596 {

	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		if(1000000<=n && n<=3000000) {
			int a[] = new int[n];
			long sum = 0;

			for(int i=0; i<n; i++) {
				a[i] = scan.nextInt();
				sum += a[i];
			}

			System.out.println(sum);
		}

	}
}
