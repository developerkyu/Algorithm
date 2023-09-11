import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String S = br.readLine();
		int [] arr = new int [S.length()];
		
		for (int i = 0; i < S.length(); i++) {
			arr[i] = S.charAt(i) - '0';
		}
		
		Arrays.sort(arr);
		
		for (int i = arr.length - 1; i >= 0;  i--) {
			System.out.print(arr[i]);
		}
	}

}
