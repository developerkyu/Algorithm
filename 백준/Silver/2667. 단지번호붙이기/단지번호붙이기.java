import java.io.*;
import java.util.*;

public class Main {
	// 1. 총 단지수 total, 각 단지내의 아파트 수 count 선언
	static int total = 0, count = 0;
	static int [][] visited;
	static int [][] map;
	static ArrayList<Integer> result = new ArrayList();
	
	public static void main(String[] args) throws IOException {
		
		
		// 2. 정사각형의 사이즈 입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 3. 2차원 배열로 된 정사각형 생성
		int size = Integer.parseInt(br.readLine());
		map = new int [size][size];
		visited = new int [size][size];
		StringBuilder sb = new StringBuilder("");
		
		
		// 4. 정사각형에 들어갈 수 입력
		for (int i = 0; i < size; i++) {
			String sNum = br.readLine();
			for (int j = 0; j < size; j++) {
				map[i][j] = sNum.charAt(j) - '0';
			}
		}
		
		// 5. (0, 0)에서 시작 -> 방문하지 않았고, 지도상에서 단지가 존재하면
		// 해당 포인트를 기점으로 깊이 우선 탐색 시작
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (visited[i][j] == 0 && map[i][j] == 1) {
					total++;
					DFS(i, j, size);
					
					// 탐색이 끝나면 count 기록 후 초기화
					result.add(count);
					count = 0;
				}
			}
		}
		
		Collections.sort(result);
		for (int i = 0; i < result.size(); i++) {
			sb.append(result.get(i)).append("\n");
		}
		
		System.out.println(total);
		System.out.println(sb);
	}

	private static void DFS(int i, int j, int size) {
		// 이미 방문했거나, 지도상에서 단지가 없는 0이거나 지도 밖으로 벗어났다면 return
		if (i < 0 || i >= size || j < 0 || j >= size) return;
		
		if (visited[i][j] == 1) return;
		
		if (map[i][j] == 0) return;
		
		count++;
		visited[i][j] = 1;
		DFS(i + 1, j, size);
		DFS(i - 1, j, size);
		DFS(i, j + 1, size);
		DFS(i, j - 1, size);
	}
	
}