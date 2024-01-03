import java.util.Map;
import java.util.HashMap;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        // callings의 길이 만큼 for 문
        // players에서 callings[i]를 찾은 다음
        // if (인덱스 x > 0 일 때, x <-> x - 1 교환해준다)
        // else if (인덱스 x == 0 이면 아무일도 발생 x)
        
		// for (int i = 0; i < callings.length; i++) {
		// 	for (int j = 0; j < players.length; j++) {
		// 		if (j > 0 && players[j] == callings[i]) {
		// 			String temp = players[j - 1];
		// 			players[j - 1] = players[j];
		// 			players[j] = temp;
		// 		}
		// 	}
		// }
        
        Map<String, Integer> rankMap = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            rankMap.put(players[i], i);
        }
        
        for (String player: callings) {
            int rank = rankMap.get(player);
            
            String beforePlayer = players[rank - 1];
            
            players[rank - 1] = player;
            players[rank] = beforePlayer;
            
            rankMap.put(player, rank - 1);
            rankMap.put(beforePlayer, rank);
        }
		
		return players;
    }
}