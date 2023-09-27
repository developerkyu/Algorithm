import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int K = Integer.parseInt(st.nextToken());
		
		int arr [] = new int [K];
		
		for (int i = 0; i < K; i++) {
			st = new StringTokenizer(br.readLine());
			int num = Integer.parseInt(st.nextToken());
			
			int index = i - 1;
			if (num == 0) {
				while (index >= 0) {
					if (arr[index] == 0) {
						index--;
					} else {
						arr[index] = 0;
						break;
					}
				}
			} else {
				arr[i] = num;
			}
		}
		
		int sum = 0;
		
		for (int i = 0; i < K; i++) {
			sum += arr[i];
		}
		
		
		System.out.println(sum);
	}

}