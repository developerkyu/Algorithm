import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        ArrayList<Integer> A = new ArrayList<>();
		
		Map<String, Integer> nameDic = new HashMap<>();
		
		// 각각의 이름과 이름에 할당된 그리움 점수를 해쉬맵에 저장
		for (int i = 0; i < name.length; i++) {
			nameDic.put(name[i], yearning[i]);
		}
		
		for (int i = 0; i < photo.length; i++) {
			int count = 0;
			for (String figure: photo[i]) {
				// 이름이 해쉬맵에 저장되어 있는지 확인
				// 이름이 있으면 count에 더하기
				if (nameDic.containsKey(figure)) {
					count += nameDic.get(figure);
				}
			}
			
			A.add(count);
		}
		
		int[] answer = new int [A.size()];
		int size = 0;
		for (int num : A) {
			answer[size++] = num;
		}
		
        return answer;
    }
}