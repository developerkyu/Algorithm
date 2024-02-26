import java.util.LinkedList;
import java.util.Queue;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
//		queue의 사이즈 N 입력
//		queue 생성
//		while (queue의 길이가 2보다 크면) {
//			queue.remove()
//			int n = queue.poll()
//			queue.add(n)
//		}
//		
//		while (queue의 길이가 2이면) {
//			queue.remove()
//		}
//		
//		System.out.println(queue.peek())
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Queue<Integer> queue = new LinkedList<>();
		
		for (int i = 1; i <= N; i++) {
			queue.add(i);
		}
		
		while (queue.size() > 1) {
			queue.poll();
			queue.add(queue.poll());
		}
		
		System.out.println(queue.peek());
	}
}