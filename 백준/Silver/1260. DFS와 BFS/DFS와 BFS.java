import java.io.*;
import java.util.*;

public class Main {
	
	static boolean [] visited;
	static ArrayList<Integer> [] A;
	static StringBuilder dfs = new StringBuilder();
	static StringBuilder bfs = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int start = Integer.parseInt(st.nextToken());
		
		visited = new boolean [N + 1];
		A = new ArrayList[N + 1];
	
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
		
		DFS(start);
		
		// BFS를 위한 초기화
		visited = new boolean [N + 1];
		
		BFS(start);
		
		
		System.out.println(dfs);
		System.out.println(bfs);
	}

	private static void BFS(int node) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(node);
		visited[node] = true;
		
		while (!queue.isEmpty()) {
			int currentNode = queue.poll();
			bfs.append(currentNode + " ");
			
			for (int i : A[currentNode]) {
				if (!visited[i]) {
					visited[i] = true;
					queue.add(i);
				}
			}
			
		}
		
	}

	private static void DFS(int node) {
		if (visited[node]) return;
		
		visited[node] = true;
		dfs.append(node + " ");
		
		for (int i : A[node]) {
			if (!visited[i]) {
				DFS(i);
			}
		}
		
	}

}
