class Solution {
    public String solution(String s, int n) {
        String answer = "";
		
		for (char ch: s.toCharArray()) {
			if (ch == ' ') {
				answer += ch;
			} else if (ch >= 'a' && ch <= 'z') {
				char word = (char)(ch + n);
				if (word >= 123) {
					word = (char)(word - 26);
				}
				answer += word;
			} else if (ch >= 'A' && ch <= 'Z') {
				char word = (char)(ch + n);
				if (word >= 91) {
					word = (char)(word - 26);
				}
				answer += word;
			}
		}
		
		return answer;
    }
}