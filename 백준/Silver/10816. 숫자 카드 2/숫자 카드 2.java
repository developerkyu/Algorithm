import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(st.nextToken());
		int [] list = new int [20000001];
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			list[Integer.parseInt(st.nextToken()) + 10000000]++;
		}
		
		st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < M; i++) {
			sb.append(list[Integer.parseInt(st.nextToken()) + 10000000]).append(" ");
		}
		
		System.out.println(sb);

	}

}