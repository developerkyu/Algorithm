import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
//		수열의 크기 n을 입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
//		수열에 포함되는 수 입력 -> 배열로
		StringTokenizer st = new StringTokenizer(br.readLine());
		int arr[] = new int [n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
//		합해서 만들어야 하는 수 x 입력
		int x = Integer.parseInt(br.readLine());

//		배열을 정렬
		Arrays.sort(arr);
		
//		start는 배열의 처음, end는 배열의 끝, count = 0
		int start = 0;
		int end = n - 1;
		int count = 0;
		
//		while (start < end) {
//			if (start + end < x) {
//				start++
//			} else if (start + end > x) {
//				end--
//			} else if (start + end == x) {
//				count++
//				start++
//			}
//		}
//		
//		count 출력
		
		while (start < end) {
			if (arr[start] + arr[end] < x) {
				start++;
			} else if (arr[start] + arr[end] > x) {
				end--;
			} else if (arr[start] + arr[end] == x) {
				count++;
				start++;
			}
		}
		
		System.out.println(count);
	}

}