import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 초기화 
		// (배열의 크기 size, start_index = 0, end_index = 0,
		// count = 0, sum = arr[0])
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int [size + 1];
		
		long N = sc.nextLong();
		int start_index = 0;
		int end_index = 0;
		int count = 0;
		
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		
		arr[size] = 1;
		
		int sum = arr[0];
		
		sc.close();
		
//		while (end_index <= size - 1) {
//			if (sum > N) sum -= arr[start_index]; start_index++;
//			else if (sum == N) count++; end_index++; sum += arr[end_index];
//			else if (sum < N) end_index++; sum += arr[end_index];
//		}
		
		while (end_index <= size - 1) {
			if (sum == N) {
				end_index++;
				sum += arr[end_index];
				count++;
			} else if (sum > N) {
				sum -= arr[start_index];
				start_index++;
			} else if (sum < N) {
				end_index++;
				sum += arr[end_index];
			}
		}
		
		System.out.println(count);
	}

}