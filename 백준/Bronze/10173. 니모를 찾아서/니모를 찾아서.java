import java.io.*;
import java.util.regex.*;

public class Main {
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String reg = "nemo";
		Pattern pattern = Pattern.compile(reg, Pattern.CASE_INSENSITIVE);
		
		while (true) {
			String s = br.readLine();
			if (s.equals("EOI")) break;

			Matcher matcher = pattern.matcher(s);
			
			if (matcher.find()) {
				System.out.println("Found");
			} else {
				System.out.println("Missing");
			}
		}
	}

}