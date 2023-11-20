import java.io.*;
import java.util.*;

public class Main {
	// 방문 배열 visited 선언
	static boolean visited[];
	
	// 인접 리스트 A 선언 -> 요소는 ArrayList
	static ArrayList<Integer> [] A;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 노드의 개수 N 입력
		int N = Integer.parseInt(st.nextToken());
		
		// 엣지의 개수 M 입력
		st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken());
		
		// 방문 배열의 길이 1 ~ N + 1 까지 설정
		visited = new boolean [N + 1];
		
		// 인접 리스트의 길이 1 ~ N + 1 까지 설정
		A = new ArrayList[N + 1];
		
		for (int i = 1; i < N + 1; i++) {
			A[i] = new ArrayList<Integer>();
		}
		
		// 엣지의 개수 i = 0 ~ M 까지 만큼 for문으로
		// 인접 리스트 안의 요소 입력
		// A[start].add(end)
		// A[end].add(start)
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			
			// 인접 리스트는 양방향 그래프이기 때문에
			A[start].add(end);
			A[end].add(start);
		}
		
		
		// 1번 컴퓨터가 시작이므로 DFS함수에 1
		// DFS(1)
		DFS(1);
		
		int count = 0;
		
		for (int i = 1; i < N + 1; i++) {
			if (visited[i]) count++;
		}

		System.out.println(count - 1);
		
	}
	
	private static void DFS(int v) {
		// 방문 배열에 현재 노드 v가 있으면
		// 리턴 -> 재귀 함수 종료
		if (visited[v]) return;
		
		// 방문 배열에 없으면 체크
		// visited[v] = true
		visited[v] = true;
		
		// A[v]에 있는 ArrayList에서 요소들을 하나씩
		// DFS에 삽입
		// for (int i : A[v]) {
		// 	 if (!visited[i]) { DFS(i); }
		// }
		
		for (int i : A[v]) {
			if (!visited[i]) DFS(i);
		}
	}
}