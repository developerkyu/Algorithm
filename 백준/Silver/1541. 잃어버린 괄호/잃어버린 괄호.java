import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		// 1. String을 입력 받는다
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();
		String[] sNum = S.split("-");
		int answer = 0;
		
		for (int i = 0; i < sNum.length; i++) {
			int temp = mySum(sNum[i]);
			
			if (i == 0) answer += temp;
			else answer -= temp;
		}
		
		System.out.println(answer);
	}

	public static int mySum(String s) {
		int sum = 0;
		String[] temp = s.split("\\+");
		for (int i = 0; i < temp.length; i++) {
			sum += Integer.parseInt(temp[i]);
		}
		
		return sum;
	}

}