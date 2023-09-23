import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<Integer>();
		
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			String command = st.nextToken();
			
			if (command.equals("1")) {
				stack.push(Integer.parseInt(st.nextToken()));
			} else if (command.equals("2")) {
				if (stack.size() != 0) {
					sb.append(stack.pop()).append("\n");
				} else {
					sb.append("-1 \n");
				}
			} else if (command.equals("3")) {
				sb.append(stack.size()).append("\n");
			} else if (command.equals("4")) {
				if (stack.empty()) {
					sb.append("1 \n");
				} else {
					sb.append("0 \n");
				}
			} else {
				if (stack.size() == 0) {
					sb.append("-1 \n");
				} else {
					sb.append(stack.peek()).append("\n");
				}
			}
		}
		
		System.out.println(sb);
	}

}