import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int[] coin = new int [N];
		int count = 0;
		
		for (int i = N - 1; i >= 0; i--) {
			coin[i] = Integer.parseInt(br.readLine());
		}
		
		for (int i : coin) {
			if (i <= K) {
				count += (K / i);
				K = K % i;
			}
		}
		
		System.out.println(count);
		
	}

}