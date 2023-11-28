import java.io.*;
import java.util.*;

public class Main {
	static int count = 0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long start = Long.parseLong(st.nextToken());
		long goal = Long.parseLong(st.nextToken());
		
		int result = BFS(start, goal);
		
		System.out.println(result);

	}

	private static int BFS(long start, long goal) {
		Queue<Long> queue = new LinkedList<>();
		
		queue.add(start);
		
		while (!queue.isEmpty()) {
			int size = queue.size();

            for (int i = 0; i < size; i++){
                long temp = queue.poll();
                if (temp == goal) return count + 1;
                
                if (temp * 2 <= goal) queue.add(temp * 2);
                
                if (temp * 10 + 1 <= goal) queue.add(temp * 10 + 1);
            }
            
            count++;
		}
		
		return -1;
	}
}
