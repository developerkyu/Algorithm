import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
				
		st = new StringTokenizer(br.readLine());
		
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0 ; i < N ; i++) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		
		list = list.stream().distinct().sorted().collect(Collectors.toList());
		
		for(Integer i : list) {
			System.out.print(i + " ");
		}

	}

}