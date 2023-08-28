import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		// 연속으로 숫자 두 개를 입력 받는다
		// 첫번째 숫자는 배열의 크기,
		// 두번째 숫자는 질의 갯수
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int size = Integer.parseInt(st.nextToken());
		int numOfQueries = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		long[] S = new long[size + 1];
		
		// for (배열의 크기만큼 반복하기) {
		// 합 배열 생성하기 (S[i] = S[i-1] + A[i]
		// }
		for (int i = 1; i <= size; i++) {
			S[i] = S[i - 1] + Integer.parseInt(st.nextToken());
		}
		
		
		// for (질의의 개수만큼 반복하기) {
		// 질의의 범위 받기 (i~j)
		// 구간의 합 구하기 (S[j] - S[i-1])
		// }
		for (int n = 0; n < numOfQueries; n++) {
			st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			
			System.out.println(S[j] - S[i - 1]);
		}
	}
}