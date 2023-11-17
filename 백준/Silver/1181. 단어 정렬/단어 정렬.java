import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		String[] strArr = new String [N];
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			strArr[i] = st.nextToken();
		}
		
		Arrays.sort(strArr, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				if (s1.length() == s2.length()) {
					return s1.compareTo(s2);
				} else {
					return s1.length() - s2.length();
				}
			}
			
		});
		
		String[] result = Arrays.stream(strArr).distinct().toArray(String[]::new);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < result.length; i++) {
			sb.append(result[i] + "\n");
		}
		System.out.println(sb);

	}

}