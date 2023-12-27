import java.io.*;
import java.util.*;

public class Main {
	static int count;
	static int [] visited;
	static ArrayList<Integer> [] A;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int start = Integer.parseInt(st.nextToken());
		
		visited = new int [N + 1];
		A = new ArrayList [N + 1];
		
		for (int i = 1; i < N + 1; i++) {
			A[i] = new ArrayList<Integer>();
		}
		
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			
			A[u].add(v);
			A[v].add(u);
		}
		
		for (int i = 1; i < N + 1; i++) {
			Collections.sort(A[i]);
		}
		
		count = 1;
		BFS(start);
		
		for (int i = 1; i < visited.length; i++) {
			System.out.println(visited[i]);
		}
	}

	private static void BFS(int start) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(start);
		
		visited[start] = count;
		
		while (!queue.isEmpty()) {
			int newNode = queue.poll();
			
			for (int i : A[newNode]) {
				if (visited[i] == 0) {
					visited[i] = ++count;
					queue.add(i);
				}
			}
		}
		
	}

}
