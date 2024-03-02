import java.io.*;
import java.util.*;

class Main {
    static ArrayList<Integer> [] A;
    static int [] visited;
    static int count = 1;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int node = Integer.parseInt(st.nextToken());
        int edge = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(st.nextToken());
        
        A = new ArrayList [node + 1];
        visited = new int [node + 1];
        
        for (int i = 1; i < node + 1; i++) {
            A[i] = new ArrayList<Integer>();
        }
        
        for (int i = 0; i < edge; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            
            A[u].add(v);
            A[v].add(u);
        }
        
        for (int i = 1; i < node + 1; i++) {
			Collections.sort(A[i], Collections.reverseOrder());
		}
        
        DFS(start);
        StringBuilder sb = new StringBuilder("");
        for (int i = 1; i < node + 1; i++) {
            sb.append(visited[i]).append("\n");
        }
        
        System.out.println(sb);
    }
    
    public static void DFS(int v) {
        if (visited[v] != 0) return;
        
        visited[v] = count++;
        
        for (int i : A[v]) {
            if (visited[i] == 0) {
                DFS(i);
            }
        }
    }
}