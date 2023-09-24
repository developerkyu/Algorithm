import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		
		HashMap<String, String> map = new HashMap<String, String>();
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			String action = st.nextToken();
		
			if (map.containsKey(name)) {
				map.remove(name);
			} else {
				map.put(name, action);
			}
		}
		
		ArrayList<String> list = new ArrayList<String>(map.keySet());
		
		Collections.sort(list, Collections.reverseOrder());
		
		for (String li: list) {
			System.out.println(li + " ");
		}
	}

}