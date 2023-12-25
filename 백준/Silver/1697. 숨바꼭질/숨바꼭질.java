import java.io.*;
import java.util.*;

public class Main {
	static int count = 0;
	static int max = 100000;
	static int visited[] = new int[max + 1];
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int result = BFS(N, K);
		
		System.out.println(result);
	}

	private static int BFS(int n, int k) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(n);
		visited[n] = 1;
		
		while(!queue.isEmpty()) {
			int size = queue.size();
			
			for (int i = 0; i < size; i++) {
				int temp = queue.poll();
				
				if (temp == k) return count;
				if (temp + 1 <= max && visited[temp + 1] == 0) {
					queue.add(temp + 1);
					visited[temp + 1] = 1;
				}
				if (temp - 1 >= 0 && visited[temp - 1] == 0) {
					queue.add(temp - 1);
					visited[temp - 1] = 1;
				}
				if (temp * 2 <= max && visited[temp * 2] == 0) {
					queue.add(temp * 2);
					visited[temp * 2] = 1;
				}
			}
			
			count++;
		}
		
		return 0;
	}

}