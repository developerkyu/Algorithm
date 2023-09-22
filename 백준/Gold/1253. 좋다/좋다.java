import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static int count = 0;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
//		수의 개수 N 입력
//		
//		정수 arr 입력
//		
//		arr 정렬
//		
//		int count = 0;
//		
//		for (int i = 2 부터 N까지 반복) {
//			int start = 0, end = i - 1;
//			
//			while (start < end) {
//				if (start + end < arr[i]) {
//					start++;
//				} else if (start + end > arr[i]) {
//					end--;
//				} else if (start + end == arr[i]) {
//					count++;
//					break;
//				}
//			}
//		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int []list = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < N; i++) {
			list[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(list);
		
		for (int i = 0; i < N; i++) {
			int left = 0;
            int right = N - 1;
			
            while(true){
                // 현재 나(i)의 위치에 있는 경우
                if (left == i) left++;
                else if (right == i) right--;

                // 결과를 찾을 수 없다.
                if (left >= right) break;

                // 정렬이 되어 있으므로, 합이 더 크다면 더 작은 수와 더해주어야 하니까 왼쪽으로 움직이는 right 값을 변경
                if (list[left] + list[right] > list[i]) right--;
                else if (list[left] + list[right] < list[i]) left++;
                else{      // 좋다!
                    count++;
                    break;
                }
            }

		}
		
		System.out.println(count);
	}

}