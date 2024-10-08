package question.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B11659 {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

		int length = Integer.parseInt(stringTokenizer.nextToken());
		int executeCount = Integer.parseInt(stringTokenizer.nextToken());

		stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		int[] sumList = new int[length + 1];
		for (int i = 1; i <= length; i++) {
			sumList[i] = sumList[i - 1] + Integer.parseInt(stringTokenizer.nextToken());
		}

		int[] resultArray = new int[executeCount];
		for (int i = 0; i < executeCount; i++) {
			stringTokenizer = new StringTokenizer(bufferedReader.readLine());
			int start = Integer.parseInt(stringTokenizer.nextToken());
			int end = Integer.parseInt(stringTokenizer.nextToken());
			resultArray[i] = sumList[end] - sumList[start - 1];
		}

		Arrays.stream(resultArray)
				.forEach(System.out::println);
	}
}
