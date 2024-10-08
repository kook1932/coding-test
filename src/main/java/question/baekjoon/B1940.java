package question.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B1940 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());
		int length = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(reader.readLine());
		int requiredNumber = Integer.parseInt(st.nextToken());

		int[] items = new int[length];
		st = new StringTokenizer(reader.readLine());
		for (int i = 0; i < length; i++) {
			items[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(items);

		int count = 0;
		int startIndex = 0;
		int endIndex = length - 1;
		while (startIndex < endIndex) {
			int sum = items[startIndex] + items[endIndex];
			if (sum == requiredNumber) {
				count++;
				startIndex++;
				endIndex--;
			} else if (sum < requiredNumber) {
				startIndex++;
			} else {
				endIndex--;
			}
		}

		System.out.println(count);
	}
}

