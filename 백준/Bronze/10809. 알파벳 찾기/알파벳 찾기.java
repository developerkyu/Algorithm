import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
//		a ~ z 까지 문자를 배열에 넣는다.
//		
//		
//		단어를 입력 받는다.
//		
//		
//		배열 루프를 돌면서 단어에 해당 문자가 어디에 있는지 찾아서 String에
//		추가한다.
		
		String aToz = "abcdefghijklmnopqrstuvwxyz";
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String S = br.readLine();
		
		StringBuffer sb = new StringBuffer();
		
		for (int i = 0; i < aToz.length(); i++) {
			sb.append(S.indexOf(aToz.charAt(i)) + " ");
		}
		
		System.out.println(sb.toString());

	}

}