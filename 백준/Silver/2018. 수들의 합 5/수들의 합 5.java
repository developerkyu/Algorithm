import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		사용 변수 초기화 (count = 1, start_index = 1, end_index = 1, sum = 1)
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 1;
		int start_index = 1;
		int end_index = 1;
		int sum = 1;
		
		sc.close();
		
//		while (end_index != N) {
//			if (sum == N) count 증가, end_index 증가, sum에 end_index 더함
//			else if (sum > N) start_index 증가, sum에 start_index 빼기
//			else if (sum < N) end_index 증가, sum에 end_index 더
//		}
		
		while (end_index != N) {
			if (sum == N) {
				count++; 
				end_index++; 
				sum += end_index;
			} else if (sum > N) {
				sum -= start_index;
				start_index++;
			} else if (sum < N) {
				end_index++;
				sum += end_index;
			}
		}
		
//		count 출력하기
		System.out.println(count);
	}

}