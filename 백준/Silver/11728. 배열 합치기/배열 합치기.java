import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
//		배열 두 개의 길이를 입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
//		첫 번째 배열 입력
		int[] arr = new int [N + M];
		
		st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
//		두 번째 배열 입력
		st = new StringTokenizer(br.readLine());
		
		for (int i = N; i < N + M; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		

		
//		배열을 정렬
		Arrays.sort(arr);
		
		StringBuilder sb = new StringBuilder();
		
		for(int r : arr) {
			sb.append(r+" "); 
					
		}
		System.out.println(sb);
	}

}