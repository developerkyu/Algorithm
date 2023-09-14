import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String S = br.readLine();
		
		int [] alphabet = new int [26];
		
		for (int i = 0; i < S.length(); i++) {
			int idx = S.charAt(i) - 'A';
			alphabet[idx]++;
		}
		
		int isOne = 0;
		
		for (int i = 0; i < alphabet.length; i++) {
			if (alphabet[i] % 2 != 0) isOne++;
		}
		
		String answer = "";
		StringBuilder sb = new StringBuilder();
		
		if (isOne > 1) System.out.println("I'm Sorry Hansoo");
		else {
			// 처음
			for (int i = 0; i < alphabet.length; i++) {
				for (int j = 0; j < alphabet[i] / 2; j++) {
					sb.append((char)(i + 'A'));
				}
			}
			
			answer += sb.toString();
			
			// 끝
			String end = sb.reverse().toString();
			
			// 중간
			sb = new StringBuilder();
			for (int i = 0; i < alphabet.length; i++) {
				if (alphabet[i] % 2 != 0) {
					sb.append((char)(i + 'A'));
				}
			}
			
			answer += sb.toString() + end;
		}
		
		System.out.println(answer);

	}

}