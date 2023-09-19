import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {		
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int arr[] = new int[N];
		
		ArrayList<Integer> lion = new ArrayList<Integer>();
		
		st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			
			if (arr[i] == 1) lion.add(i);
		}
		
		if (lion.size() < K) {
			System.out.println(-1);
			return;
		}
		
		int start = 0, end = K - 1;
		int min = Integer.MAX_VALUE, count = 0;
		
		while (true) {
			if (end == lion.size()) break;
			count = lion.get(end) - lion.get(start) + 1;
			min = Math.min(min, count);
			
			start++;
			end++;
		}
		
		System.out.println(min);
	}

}