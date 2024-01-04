class Solution {
    public String solution(String s) {
        if (s.length() % 2 != 0) {
			int index = (s.length() / 2);
			String answer = s.substring(index, index + 1);
			
			return answer;
		} else {
			int index = (s.length() / 2);
			String answer = s.substring(index - 1, index + 1);
		
			return answer;
		}
    }
}