import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
//		변수 초기화
//		start_index = 0, end_index = 0, min = 0
//		int []arr = new arr[N], sum = 0
		int start_index = 0; 
		int end_index = 0;
		int min = 0;
		int sum = 0;
		
//		수열의 길이와 수열의 합이 되어야 하는 수를 입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int S = Integer.parseInt(st.nextToken());
		
		int []arr = new int [N + 1];
		
		st = new StringTokenizer(br.readLine());

		//		수열을 입력
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		

//		while (end_index != N) {
//			if (sum < S) {
//				end_index++;
//				sum += arr[end_index];
//			} else if (sum > S) {
//				sum -= arr[start_index];
//				start_index++;
//			} else if (sum == S) {
//				if (min == 0) {
//					min = end_index - start_index + 1;
//				} else if (min != 0) {
//					int temp = end_index - start_index + 1;
//					if (min > temp) min = temp;
//				}
//				
//				end_index++;
//				sum += arr[index_index];
//			}
//		}
		int len = Integer.MAX_VALUE;
		
		while(start_index <= end_index && end_index <= N) {
			if(sum < S) {
				sum += arr[end_index++];
			} else if(sum >= S) {
				len = Math.min(len, end_index - start_index);
				sum -= arr[start_index++];
			}  
		}
		System.out.println(len==Integer.MAX_VALUE ? 0 : len);
		
	}

}