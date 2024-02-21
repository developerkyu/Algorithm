import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());	
		int n = Integer.parseInt(st.nextToken());
	
		st = new StringTokenizer(br.readLine());
		String s = st.nextToken();
		String sPattern = "\\.*pPAp\\.*";
		Pattern pattern = Pattern.compile(sPattern);
		Matcher matcher = pattern.matcher(s);
		
		int count = 0;
		
		while (matcher.find()) {
			count++;
		}
		
		System.out.println(count);
	}

}