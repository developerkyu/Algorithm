class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 1;
		
		int pivot = 0;
		int index = 1;
		
		while (index < section.length) {
			if ((section[index] - section[pivot]) <= (m - 1)) {
				index++;
			} else {
				pivot = index;
				index = index + 1;
				answer++;
			}
		}
		
		
		
		return answer;
    }
}