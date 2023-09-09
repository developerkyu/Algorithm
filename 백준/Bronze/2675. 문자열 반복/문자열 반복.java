import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int num = Integer.parseInt(st.nextToken());
			String S = st.nextToken();
			
			StringBuilder temp = new StringBuilder("");
			
			for (int j = 0; j < S.length(); j++) {
				for (int k = 0; k < num; k++) {
					temp.append(S.charAt(j));
				}
			}
			
			System.out.println(temp);
			
		}
	}

}