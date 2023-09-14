import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);

		
		long N = sc.nextLong();
		String answer = "";
		BigInteger b1 = new BigInteger("2");
		BigInteger b2 = new BigInteger("0");
		
		for (int i = 0; i < N; i++) {
			BigInteger num = sc.nextBigInteger();
			
			if (num.remainder(b1).equals(b2)) answer += "even\n";
			else answer += "odd\n";
		}
		
		sc.close();
		
		System.out.println(answer);
	}

}