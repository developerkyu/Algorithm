class Solution {
    public int[] solution(int[] arr) {
        int[] answer;
		
		if (arr.length == 1) {
			answer = new int [1];
			answer[0] = -1;
		} else {
			int index = 0;
			for (int i = 1; i < arr.length; i++) {
				if (arr[i] < arr[index]) {
					index = i;
				}
			}
			
			answer = new int [arr.length - 1];
			for (int i = 0, j = 0; i < arr.length; i++) {
				if (i != index) {
					answer[j++] = arr[i];
				}
			}
		}
		
		return answer;

    }
}