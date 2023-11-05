import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// 데이터 개수 N 입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		
		// 배열 입력
		int A[] = new int [N];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		
		// 배열 정렬 -> 삽입 정렬(n^2 시간 복잡도)
		for (int i = 1; i < N; i++) {
			// 타겟 넘버
			int target = A[i];
			
			int j = i - 1;
			
			// 타겟이 이전 원소보다 크기 전 까지 반복
			while(j >= 0 && target < A[j]) {
				A[j + 1] = A[j];	// 이전 원소를 한 칸씩 뒤로 미룬다.
				j--;
			}
			
			/*
			 * 위 반복문에서 탈출 하는 경우 앞의 원소가 타겟보다 작다는 의미이므로
			 * 타겟 원소는 j번째 원소 뒤에 와야한다.
			 * 그러므로 타겟은 j + 1 에 위치하게 된다.
			 */
			A[j + 1] = target;	
		}
		
		// 합 배열 S 구하기
		int S[] = new int [N];
		S[0] = A[0];
		for (int i = 1; i < N; i++) {
			S[i] = S[i - 1] + A[i];
		}
		
		// 합 배열의 모든 원소 더하기
		int sum = 0;
		for (int i = 0; i < N; i++) {
			sum += S[i];
		}
		
		System.out.println(sum);

	}

}