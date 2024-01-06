class Solution {
    public String solution(String phone_number) {
        String answer = "";
		
		int end = phone_number.length() - 4;
		
		for (int i = 0; i < end; i++) {
			answer += "*";
		}
		
		answer += phone_number.substring(phone_number.length() - 4, phone_number.length());
		
		return answer;
    }
}