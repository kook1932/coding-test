package question.programmers.lv1;

public class ThreePeople131705 {

	public int solution(int[] number) {
		int answer = 0;
		int size = number.length;

		for (int i=0; i<size; i++){
			for (int ii=i+1; ii<size; ii++){
				for (int iii=ii+1; iii<size; iii++){
					if (number[i] + number[ii] + number[iii] == 0) answer += 1;
				}
			}
		}

		return answer;
	}

}
