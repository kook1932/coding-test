package question.baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class B11720 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String numberString = sc.next();

		String[] numberArray = numberString.split("");
		int sum = Arrays.stream(numberArray)
				.mapToInt(Integer::parseInt)
				.sum();

		System.out.println(sum);
	}
}
