import java.io.*;
import java.util.*;

class Main {
    static int target;
    static int[] data;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        data = new int [N];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            data[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(data);
        
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            target = Integer.parseInt(st.nextToken());
            BS(0, N - 1);
        }
    }
    
    public static void BS(int start, int end) {
        int mid = (start + end) / 2;
        
        if (start >= end && data[mid] != target) System.out.println(0);
        else if (data[mid] == target) System.out.println(1);
        else if (data[mid] > target) BS(start, mid - 1);
        else if (data[mid] < target) BS(mid + 1, end);
    }
}