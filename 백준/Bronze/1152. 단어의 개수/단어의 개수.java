import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		int count;
		if (str.charAt(0) == 32 && str.charAt(str.length() - 1) == 32) count = -1;
		else if (str.charAt(0) == 32 || str.charAt(str.length() - 1) == 32) count = 0;
		else count = 1;
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 32) {
				count++;
			}
		}
		
		System.out.println(count);
		
	}

}