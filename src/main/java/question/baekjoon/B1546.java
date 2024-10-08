package question.baekjoon;

import java.util.Scanner;

public class B1546 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int subjectCount = sc.nextInt();
		double maxScore = 0;
		double totalScore = 0;

		for (int i = 0; i < subjectCount; i++) {
			double score = sc.nextDouble();
			maxScore = Math.max(maxScore, score);
			totalScore += score;
		}

		System.out.println((totalScore / maxScore * 100) / subjectCount);
	}
}
