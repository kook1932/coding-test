package question.baekjoon;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class B12891 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] lengths = sc.nextLine().split(" ");
		int length = Integer.parseInt(lengths[0]);
		int subLength = Integer.parseInt(lengths[1]);
		String tempPw = sc.nextLine();

		String[] conditions = sc.nextLine().split(" ");
		Map<String, Integer> condition = new HashMap<>();
		condition.put("A", Integer.parseInt(conditions[0]));
		condition.put("C", Integer.parseInt(conditions[1]));
		condition.put("G", Integer.parseInt(conditions[2]));
		condition.put("T", Integer.parseInt(conditions[3]));

		int count = 0;
		int start = 0;
		int end = subLength-1;
		Map<String, Integer> currentCondition = new HashMap<>();

		String[] dnas = tempPw.split("");
		for (int i = 0; i <= end; i++) {
			currentCondition.put(dnas[i], currentCondition.getOrDefault(dnas[i], 0) + 1);
		}

		boolean flag = true;
		for (Map.Entry<String, Integer> entry : condition.entrySet()) {
			if (entry.getValue() > currentCondition.getOrDefault(entry.getKey(), 0)) {
				flag = false;
			}
		}
		if (flag) count++;

		start++;
		end++;
		while (end < length) {
			// 감소
			currentCondition.put(dnas[start - 1], currentCondition.get(dnas[start-1]) - 1);
			// 증가
			currentCondition.put(dnas[end], currentCondition.getOrDefault(dnas[end], 0) + 1);

			flag = true;
			for (Map.Entry<String, Integer> entry : condition.entrySet()) {
				if (entry.getValue() > currentCondition.getOrDefault(entry.getKey(), 0)) {
					flag = false;
				}
			}
			if (flag) count++;
			start++;
			end++;
		}
		System.out.println(count);
	}
}
