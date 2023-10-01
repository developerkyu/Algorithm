import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	
	static int cnt;
	static int[] checked;
	static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int start = Integer.parseInt(st.nextToken());
		
		StringBuilder sb = new StringBuilder();
		
		checked = new int [N + 1];
		
		for (int i = 0; i < N + 1; i++) {
			graph.add(new ArrayList<Integer>());
		}
		
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			
			graph.get(u).add(v);
			graph.get(v).add(u);
		}
		
		for (int i = 1; i < N + 1; i++) {
			Collections.sort(graph.get(i));
		}
		
		cnt = 1;
		DFS(start);
		
		for (int i = 1; i < checked.length; i++) {
			sb.append(checked[i]).append("\n");
		}
		
		System.out.println(sb);
		
	}

	private static void DFS(int node) {
		checked[node] = cnt;
		
		for (int i = 0; i < graph.get(node).size(); i++) {
			int newNode = graph.get(node).get(i);
			if (checked[newNode] == 0) {
				cnt++;
				DFS(newNode);
			}
		}
	}

}