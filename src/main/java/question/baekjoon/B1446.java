package question.baekjoon;

import java.util.*;
import java.util.stream.Collectors;

// TODO : DP 풀어볼것
public class B1446 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] split = sc.nextLine().split(" ");
		int fastWayCount = Integer.parseInt(split[0]);
		int distance = Integer.parseInt(split[1]);

		List<FastWay> fastWayList = new ArrayList<>();
		for (int i = 0; i < fastWayCount; i++) {
			String next = sc.nextLine();
			String[] wayInfo = next.split(" ");
			fastWayList.add(
					new FastWay(wayInfo[0], wayInfo[1], wayInfo[2], distance)
			);
		}

		Collections.sort(
				fastWayList,
				Comparator.comparing(FastWay::getDistanceRatio, Comparator.reverseOrder())
						.thenComparing(FastWay::getStart)
		);

		int total = 0;
		int e = 0;
		for (FastWay fastWay : fastWayList) {
			if (e > fastWay.getStart() || fastWay.getEnd() > distance) {
				continue;
			}
			if (fastWay.getStart() > e) {
				total += fastWay.getStart() - e;
			}

			total += Math.min(fastWay.getEnd() - fastWay.getStart(), fastWay.getBetweenDistance());
			e = fastWay.getEnd();
		}

		if (e < distance) total += distance - e;
		System.out.println(total);
	}
}

class FastWay {
	private int start;
	private int end;
	private int betweenDistance;

	private int distance;

	public FastWay(String start, String end, String betweenDistance, int distance) {
		this.start = Integer.parseInt(start);
		this.end = Integer.parseInt(end);
		this.betweenDistance = Integer.parseInt(betweenDistance);
		this.distance = distance;
	}

	public int getStart() {
		return start;
	}

	public int getEnd() {
		return end;
	}

	public int getBetweenDistance() {
		return betweenDistance;
	}

	public int getDistanceRatio() {
		if (this.end > this.distance) return this.end - this.start;
		return this.end - this.start - this.betweenDistance;
	}

	@Override
	public String toString() {
		return "FastWay{" +
				"start=" + start +
				", end=" + end +
				", betweenDistance=" + betweenDistance +
				'}';
	}
}
