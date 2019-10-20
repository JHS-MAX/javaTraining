import java.util.Scanner;

public class Baekjoon_1546 {

	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();

		if(0 < N && N <= 1000) {
			double score[] = new double[N];
			double max = 0;
			double sum = 0;

			for(int i=0; i<score.length; i++) {
				score[i] = scan.nextInt();
				if(score[i] > 100 || score[i] < 0) { 
					System.out.println("���� �Է� ��� ���� �ʰ�(0~100)");
					return;
				}
				if(max < score[i]) max = score[i];
			}

			for(int i=0; i<score.length; i++) {
				score[i] = score[i]/max * 100;
				sum += score[i];
			}

			if(sum == 0) {
			System.out.println("��=0");
			return;
			}
			System.out.println(sum / N);
		} else System.out.println("������ ���� 1000�� �ʰ� �Ҽ� �����ϴ�.");
		System.out.println(0/50);
	}
}