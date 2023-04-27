package question.programmers.lv1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Runner178871 {

	public List<String> solution(String[] players, String[] callings) {
		List<String> playersList = Arrays.asList(players);
		Map<String, Integer> playersMap = new HashMap<>();
		for(int i=0; i<playersList.size(); i++){
			playersMap.put(playersList.get(i), i);
		}

		for(String callPlayer : callings) {
			int rank = playersMap.get(callPlayer);
			String prePlayerName = playersList.get(rank - 1);

			playersMap.put(callPlayer, rank-1);
			playersMap.put(prePlayerName, rank);

			playersList.set(rank, prePlayerName);
			playersList.set(rank-1, callPlayer);
		}

		return playersList;
	}
}
