import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
//		x가 0일 때는
//		1. 큐가 비어있으면 -> 0 출력
//		2. 큐가 비어있지 x -> 절대값의 최소인 값을 출력
//		
//		x가 0이 아니면
//		1. add로 큐에 추가하고 우선순위 큐 정렬 기준으로 자동 정렬
		
//		우선순위 큐의 정렬 방법을 새롭게 정의하는 것이 포인트!!
		
		PriorityQueue<Integer> queue = new PriorityQueue<>((o1, o2) -> {
			
			// 절댓값이 작은 데이터 우선
			int first_abs = Math.abs(o1);
			int second_abs = Math.abs(o2);
			
			// 절대값이 같은 경우 음수 우선
			if (first_abs == second_abs) {
				return o1 > o2 ? 1 : -1;
			}
			
			return first_abs - second_abs;
		});
		
		for (int i = 0; i < N; i++) {
			int n = Integer.parseInt(br.readLine());
			if (n != 0) {
				queue.add(n);
			} else if (n == 0) {
				if (queue.isEmpty()) {
					System.out.println("0");
				} else {
					System.out.println(queue.poll());
				}
			}
		}
		
	}

}