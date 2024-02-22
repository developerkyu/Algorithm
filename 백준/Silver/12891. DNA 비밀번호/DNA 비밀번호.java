import java.io.*;
import java.util.*;

public class Main {
	static int[] checkArr = new int[4];
	static int[] myArr = new int[4];
	static int checkSecret = 0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// DNA 문자열의 길이 S, 부분 문자열의 길이를 입력 P
		int S = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());
		
		// DNA 문자열 A 입력
		st = new StringTokenizer(br.readLine());
		char[] A = new char[S];
		A = st.nextToken().toCharArray();
		
		
		// 부분 문자열에 포함돼야 할 ACGT의 최소 개수 입력
		// 배열로 저장  [A, C, G, T]
		// 2 0 1 1 이면 int [] checkArr = [2, 0, 1, 1]
		st = new StringTokenizer(br.readLine());
		
		
		int count = 0;
		
		for (int i = 0; i < 4; i++) {
			checkArr[i] = Integer.parseInt(st.nextToken());
			if (checkArr[i] == 0) {
				checkSecret++;
			}
		}
		
		// 초기 0 ~ P까지 부분 문자열 검사
		for (int i = 0; i < P; i++) {
			Add(A[i]);
		}
		
		// 초기 0 ~ P까지 검사하여 checkSecret이 4이면 카운트 1증가
		if (checkSecret == 4) count++;
		
		// 나머지 1 ~ S까지
		for (int i = P; i < S; i++) {
			 // int j는 시작점
			int j = i - P; // 0 -> 1 -> 2...
			
			// Add(A[P]) -> Add(A[P + 1]) -> Add(A[P + 2])
			Add(A[i]);
			
			// Remove(A[0]) -> Remove(A[1]) -> Remove(A[2])
			Remove(A[j]);
			
			if (checkSecret == 4) count++;
		}
		
		System.out.println(count);
		

	}

	public static void Remove(char c) {
		switch (c) {
		case 'A':
			if (myArr[0] == checkArr[0]) checkSecret--;
			myArr[0]--;
			break;
		
		case 'C':
			if (myArr[1] == checkArr[1]) checkSecret--;
			myArr[1]--;
			break;
			
		case 'G':
			if (myArr[2] == checkArr[2]) checkSecret--;
			myArr[2]--;
			break;
			
		case 'T':
			if (myArr[3] == checkArr[3]) checkSecret--;
			myArr[3]--;
			break;
		}
		
	}

	public static void Add(char c) {
		switch (c) {
		case 'A':
			myArr[0]++;
			if (myArr[0] == checkArr[0]) checkSecret++;
			break;
		
		case 'C':
			myArr[1]++;
			if (myArr[1] == checkArr[1]) checkSecret++;
			break;
			
		case 'G':
			myArr[2]++;
			if (myArr[2] == checkArr[2]) checkSecret++;
			break;
			
		case 'T':
			myArr[3]++;
			if (myArr[3] == checkArr[3]) checkSecret++;
			break;
		}
		
	}

}