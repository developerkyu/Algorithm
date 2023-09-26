import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		Deque<Integer> deque = new ArrayDeque<>();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			String command = st.nextToken();

			if (command.equals("push")) {
				int num = Integer.parseInt(st.nextToken());
				deque.add(num);
			} else if (command.equals("pop")) {
				if (deque.isEmpty()) {
					sb.append("-1 \n");
				} else {
					sb.append(deque.poll()).append("\n");
				}
			} else if (command.equals("size")) {
				sb.append(deque.size()).append("\n");
			} else if (command.equals("empty")) {
				if (deque.isEmpty()) {
					sb.append("1 \n");
				} else {
					sb.append("0 \n");
				}
			} else if (command.equals("front")) {
				if (deque.isEmpty()) {
					sb.append("-1 \n");
				} else {
					sb.append(deque.getFirst()).append("\n");
				}
			} else if (command.equals("back")) {
				if (deque.isEmpty()) {
					sb.append("-1 \n");
				} else {
					sb.append(deque.getLast()).append("\n");
				}
			}
		}
		
		System.out.println(sb);
	}

}