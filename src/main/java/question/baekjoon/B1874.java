package question.baekjoon;

import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class B1874 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] array = new int[n];

		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();;
		}

		Stack<Integer> stack = new Stack<>();
		int stackNum = 1;
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < n; i++) {
			if (stackNum <= array[i]) {
				while (stackNum <= array[i]) {
					stack.push(stackNum);
					stackNum++;
					sb.append("+\n");
				}
				stack.pop();
				sb.append("-\n");
			} else {
				Integer pop = stack.pop();
				if (pop > array[i]) {
					sb.replace(0, sb.length(), "NO");
					break;
				}
				sb.append("-\n");
			}
		}
		System.out.println(sb);
	}

}
