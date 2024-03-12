import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		// 양수와 음수를 각각 저장할 우선순위 큐 2개와
		// 1, 0의 개수를 저장할 count 2개 선언
		
		// PriorityQueue는 작은 수부터 큰 수까지 오름차순
		// 따라서 양수는 순서를 뒤집어 큰 수부터 작은 수까지 나오도록 해야됨
		
		PriorityQueue<Integer> positive = new PriorityQueue<>(Collections.reverseOrder());
		PriorityQueue<Integer> negative = new PriorityQueue<>();
		
		int ones = 0, zeroes = 0;
		
		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(br.readLine());
			
			if (num == 0) zeroes++;
			else if (num == 1) ones++;
			else if (num < 0) negative.add(num);
			else if (num > 0) positive.add(num);
			
		}

		int sum = 0;
		
		while (positive.size() != 0) {
			if (positive.size() >= 2) {
				int data1 = positive.poll();
				int data2 = positive.poll();
				sum += (data1 * data2);
			} else if (positive.size() == 1) {
				sum += positive.poll();
			}
		}
		
		while (negative.size() != 0) {
			if (negative.size() >= 2) {
				int data1 = negative.poll();
				int data2 = negative.poll();
				sum += (data1 * data2);
			} else if (negative.size() == 1) {
				if (zeroes >= 1) negative.poll();
				else sum += negative.poll();
			}
		}

		sum += ones;
		
		System.out.println(sum);
	}

}