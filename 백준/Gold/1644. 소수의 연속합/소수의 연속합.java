import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int cnt = isPrimeNumber(N) ? 1 : 0;
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for (int i = 0; i <= N; i++) {
			if (isPrimeNumber(i)) {
				arr.add(i);
			}
		}
		
		int sum = N == 1 ? 1 : arr.get(0);
		int end = 0;
		int start = 0;

		while (end < arr.size() - 1 && start < arr.size() - 1) {
			if (sum == N) {
				cnt++;
				end++;
				sum += arr.get(end);
			} else if (sum > N) {
				sum -= arr.get(start);
				start++;
			} else if (sum < N) {
				end++;
				sum += arr.get(end);
			}
		}
		
		System.out.println(cnt);
		
	}
	
//	public static boolean is_prime(int num) {
//		if (num < 2) return false;
//		
//		if (num == 2) return true;
//		
//		for (int i = 2; i < num; i++) {
//			if (num % i == 0) {
//				return false;
//			}
//		}
//		
//		return true;
//	}
	
	public static boolean isPrimeNumber(int targetNumber) {
		if (targetNumber < 2) return false;
		
		if (targetNumber == 2) return true;
		
		if (targetNumber == 3) return true;
	    for(int i = 2 ; i <= Math.sqrt(targetNumber); i++){
	        if(targetNumber % i == 0 ) {
	            return false;
	        }
	    }
	    return true;
	}
}