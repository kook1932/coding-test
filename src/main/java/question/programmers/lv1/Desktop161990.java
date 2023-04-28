package question.programmers.lv1;

public class Desktop161990 {

	public int[] solution(String[] wallpaper) {
		int[] answer = {};
		String[][] map = new String[wallpaper.length][wallpaper[0].length()];

		for (int i=0; i<wallpaper.length; i++){
			for (int ii=0;ii<wallpaper[i].length(); ii++){
				map[i][ii] = Character.toString(wallpaper[i].charAt(ii));
			}
		}

		for(int i=0;i<map.length;i++){
			for(int ii=0; ii<map[i].length; ii++){

			}
		}


		return answer;
	}

}
