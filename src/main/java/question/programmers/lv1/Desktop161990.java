package question.programmers.lv1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Desktop161990 {

	public int[] solution(String[] wallpaper) {
		int[] answer = new int[4];

		int minX = wallpaper[0].length() - 1;
		int maxX = 0;
		int minY = wallpaper.length - 1;
		int maxY = 0;

		for (int i=0; i<wallpaper.length; i++){
			for (int ii=0;ii<wallpaper[i].length(); ii++){
				String file = Character.toString(wallpaper[i].charAt(ii));
				if("#".equals(file)) {
					minX = Math.min(minX, ii);
					maxX = Math.max(maxX, ii);
					minY = Math.min(minY, i);
					maxY = Math.max(maxY, i);
				}
			}
		}
		answer[0] = minY; answer[1] = minX;
		answer[2] = maxY + 1; answer[3] = maxX + 1;

		return answer;
	}

}
