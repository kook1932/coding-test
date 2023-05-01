package question.programmers.lv1;

public class SmallSubstring147355 {

	public int solution(String t, String p) {
		int answer = 0;
		String[] tArr = t.split("");
		String[] pArr = p.split("");
		int size = tArr.length - pArr.length + 1;

		for(int i=0; i<size; i++){
			String tp = "";
			for(int ii=i; ii<i + pArr.length; ii++){
				tp += tArr[ii];
			}
			if (tp.compareTo(p) <= 0) answer += 1;
		}
		return answer;
	}

}
