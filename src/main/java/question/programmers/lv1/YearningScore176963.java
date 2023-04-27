package question.programmers.lv1;

import java.util.HashMap;
import java.util.Map;

public class YearningScore176963 {

	public int[] solution(String[] name, int[] yearning, String[][] photo) {
		int[] answer = new int[photo.length];
		Map<String, Integer> yearningMap = new HashMap<>();

		for (int i=0; i<name.length; i++){
			yearningMap.put(name[i], yearning[i]);
		}

		for (int i=0; i<photo.length; i++){
			int sum = 0;
			for (int ii=0; ii<photo[i].length; ii++){
				int score = (yearningMap.get(photo[i][ii]) == null) ? 0 : yearningMap.get(photo[i][ii]);
				sum += score;
			}
			answer[i] = sum;
		}

		return answer;
	}

}
