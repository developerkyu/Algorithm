import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		mData []A = new mData[N];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			A[i] = new mData(Integer.parseInt(st.nextToken()), i);
		}
		
		Arrays.sort(A);
		
		int max = 0;
		
		for (int i = 0; i < N; i++) {
			if (max < A[i].index - i) {
				max = A[i].index - i;
			}
		}
		
		System.out.println(max + 1);
	}
}

class mData implements Comparable<mData> {
	int value;
	int index;
	
	public mData(int value, int index) {
		super();
		this.value = value;
		this.index = index;
	}
	
	@Override
	public int compareTo(mData o) {
		return this.value - o.value;
	}
}