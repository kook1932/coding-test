package question.baekjoon;

import java.util.Scanner;

public class B2018 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int count = 1;
		int sum = 1;
		int start = 1;
		int end = 1;

		while (end < num) {
			if (sum == num) {
				count++;
				end++;
				sum += end;
			} else if (sum < num) {
				end++;
				sum += end;
			} else {
				sum -= start;
				start++;
			}
		}
		System.out.println(count);
	}
}
