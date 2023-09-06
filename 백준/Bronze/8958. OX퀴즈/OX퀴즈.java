import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
//		유저로 부터 OX 문자열 str을 입력 받는다.
		
//		입력받은 문자열 str을
//		for (i는 0부터 str의 길이만큼 반복) {
//			int idx = i - 1;
//			int total = 0;
//			int count = 0;
//			
//			if (str[i]이 "X"면) 다음으로 continue
//			else if (str[i]이 "O"면) {
//				while (idx가 0보다 크거나 같을때) {
//					if (str[idx] == "O") {
//						count++;
//						idx--;
//					} else if (str[idx] == "X") {
//						break걸고 while문 탈출
//					}
//				}
//				
//				total += count
//			}
//		}
//		
//		System.out.println(total)
		
		
		
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			int sum = 0;
			for (int j = 0; j < str.length(); j++) {
				int idx = j - 1;
				int count = 0;
				
				if (str.charAt(j) == 'X') continue;
				else if (str.charAt(j) == 'O') {
					count++;
					while (idx >= 0) {
						if (str.charAt(idx) == 'O') {
							count++;
							idx--;
						} else if (str.charAt(idx) == 'X') break;
					}	
				}
				
				sum += count;
			}
			
			System.out.println(sum);
		}
		
	}
	
}