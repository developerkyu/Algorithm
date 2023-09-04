import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//	N (수열의 개수) A[] (수열 배열)
		int N = Integer.parseInt(br.readLine());
		int A[] = new int[N];

		//	수열 배열 채우기
		for (int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(br.readLine());
		}
		
		Stack<Integer> stack = new Stack<>();
		int num = 1;
		StringBuffer bf = new StringBuffer();
		boolean result = true;
		
//		for (N만큼 반복) {
//			if (현재 수열 값 >= 오름차순 자연수) {
//				while (값이 같아질 때까지) {
//					push()
//					(+)저장
//				}
//			} else (현재 수열 값 < 오름차순 자연수) {
//				pop()
//				if (스택 pop 결괏값 > 수열의 수) NO 출력
//				else (-) 저장
//			}
//		}
//
//		if (NO를 출력한 적이 없으면) 저장한 값 출력
	
		for (int i = 0; i < N; i++) {
			int su = A[i];
			if (su >= num) {
				while (su >= num) {
					stack.push(num++);
					bf.append("+\n");
				}
				stack.pop();
				bf.append("-\n");
			} else {
				int n = stack.pop();
				if (n > su) {
					System.out.println("NO");
					result = false;
					break;
				} else {
					bf.append("-\n");
				}
			}
		}
		
		if (result) System.out.println(bf.toString());
	}
		
}