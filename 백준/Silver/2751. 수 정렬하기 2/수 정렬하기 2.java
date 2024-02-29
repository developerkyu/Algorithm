import java.io.*;

public class Main {
	public static int[] A, tmp;
	public static long result;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		A = new int [N + 1];
		tmp = new int [N + 1];
		for (int i = 1; i < N + 1; i++) {
			A[i] = Integer.parseInt(br.readLine());
		}
		
		merge_sort(1, N);
		for (int i = 1; i < N + 1; i++) {
			bw.write(A[i] + "\n");
		}
		
		bw.flush();
		bw.close();
	}

	public static void merge_sort(int start, int end) {
		if (end - start < 1) return;
		
		int middle = start + (end - start) / 2;
		
		merge_sort(start, middle);
		merge_sort(middle + 1, end);
		
		for (int i = start; i <= end; i++) {
			tmp[i] = A[i];
		}
		
		int k = start;
		int index1 = start;
		int index2 = middle + 1;
		while (index1 <= middle && index2 <= end) {
			if (tmp[index1] > tmp[index2]) {
				A[k] = tmp[index2];
				k++;
				index2++;
			} else {
				A[k] = tmp[index1];
				k++;
				index1++;
			}
		}
		
		while (index1 <= middle) {
			A[k] = tmp[index1];
			k++;
			index1++;
		}
		
		while (index2 <= end) {
			A[k] = tmp[index2];
			k++;
			index2++;
		}
	}

}