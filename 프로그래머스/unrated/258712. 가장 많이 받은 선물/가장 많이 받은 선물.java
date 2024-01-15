import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
		int numOfFriends = friends.length;
		
		int[] giftIndex = new int[numOfFriends];
		int [][] giftGraph = new int [numOfFriends][numOfFriends];
 		
		Map<String, Integer> namelist = new HashMap<>();
		
		for (int i = 0; i < numOfFriends; i++) {
			namelist.put(friends[i], i);
		}
		
		for (String gift: gifts) {
			String[] giverAndTaker = gift.split(" ");
			int giver = namelist.get(giverAndTaker[0]);
			int taker = namelist.get(giverAndTaker[1]);
			
			// 선물 지수 기록 -> 준사람은 +1, 받은사람은 -1
			giftIndex[giver]++;
			giftIndex[taker]--;
			
			// 선물 그래프에 기록 -> 준사람은 +1
			giftGraph[giver][taker]++;
		}
		
		for (int i = 0; i < numOfFriends; i++) {
			int count = 0;
			for (int j = 0; j < numOfFriends; j++) {
				if (i == j) continue;
				
				if (giftGraph[i][j] > giftGraph[j][i] || (giftGraph[i][j] == giftGraph[j][i]) && (giftIndex[i] > giftIndex[j])) {
					count++;
				}
			}
			
			if (answer < count) answer = count;
			
		}
		
		return answer;
    }
}