import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		
		int list [] = new int [N];
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			list[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(list);
		
		st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < M; i ++) {
			int answer = 0;
			int start = 0, end = N - 1;
			int num = Integer.parseInt(st.nextToken());
			
			while (start <= end) {
				int mid = (start + end) / 2;
				if (list[mid] == num) {
					answer = 1;
					break;
				} else if (list[mid] > num) {
					end = mid - 1;
				} else if (list[mid] < num) {
					start = mid + 1;
				}
			}
			
			System.out.println(answer);
		}
		
		
	}

}