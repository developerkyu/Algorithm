import java.io.*;
import java.util.*;

class Main {
    static int[] dx = { 0, 0, 1, -1 };
    static int[] dy = { 1, -1, 0, 0 };
    static boolean[][] visited;
    static int[][] map;
    static ArrayList<Integer> result = new ArrayList<>();
    static int total = 0, count = 0, size;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        size = Integer.parseInt(br.readLine());
        map = new int [size][size];
        visited = new boolean [size][size];
        
        for (int i = 0; i < size; i++) {
            String sNum = br.readLine();
			for (int j = 0; j < size; j++) {
				map[i][j] = sNum.charAt(j) - '0';
			}
        }
        
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (map[i][j] == 1 && !visited[i][j]) {
                    total++;
                    DFS(i, j);
                    
                    result.add(count);
                    count = 0;
                }
            }
        }
        
        Collections.sort(result);
        StringBuilder sb = new StringBuilder("");
		for (int i = 0; i < result.size(); i++) {
			sb.append(result.get(i)).append("\n");
		}
		
		System.out.println(total);
		System.out.println(sb);
    }
    
    public static void DFS(int x, int y) {
        visited[x][y] = true;
        count++;
        
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            
            if (nx >= 0 && nx < size && ny >= 0 && ny < size) {
                if (map[nx][ny] == 1 && !visited[nx][ny]) {
                    DFS(nx, ny);
                }
            }
        }
    }
}