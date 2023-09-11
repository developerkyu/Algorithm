import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static int count = 0;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		
		for (int i = 0; i < N; i++) {
			String S = br.readLine();
			boolean flag = true;
			
			for (int j = 0; j < S.length() - 1; j++) {
				if (S.charAt(j) == S.charAt(j + 1)) {
					continue;
				} else {
					for (int k = j + 2; k < S.length(); k++) {
						if (S.charAt(j) == S.charAt(k)) {
							flag = false;
							break;
						}
					}
				}
			}
			
			if (flag) count++;
		}
		
		System.out.println(count);
	}

}