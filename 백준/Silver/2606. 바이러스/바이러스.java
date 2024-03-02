import java.io.*;
import java.util.*;

class Main {
    static ArrayList<Integer>[] A;
    static boolean[] visited;
    static int count = 0;
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int Node = Integer.parseInt(br.readLine());
        int Edge = Integer.parseInt(br.readLine());
        
        A = new ArrayList [Node + 1];
        visited = new boolean [Node + 1];
        
        for (int i = 1; i < Node + 1; i++) {
            A[i] = new ArrayList<Integer>();
        }
        
        for (int i = 0; i < Edge; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            
            A[start].add(end);
            A[end].add(start);
        }
        
        DFS(1);
        System.out.println(count);
    }
    
    public static void DFS(int v) {
        if (visited[v]) return;
        
        visited[v] = true;
        
        for (int i : A[v]) {
            if (!visited[i]) {
                count++;
                DFS(i);
            }
        }
    }
}