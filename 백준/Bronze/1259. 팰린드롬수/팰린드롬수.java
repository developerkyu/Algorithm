import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int num = Integer.parseInt(st.nextToken());
		 
		StringBuffer sb = new StringBuffer();
		
		while (true) {
			if (num == 0) {
				break;
			} else {
				String S = num + "";
				
				int start = 0;
				int end = S.length() - 1;
				
				boolean flag = true;
				
				if (S.length() % 2 == 0) {
					// 짝수일 경우
					int mid = S.length() / 2;
					
					if (S.charAt(mid) != S.charAt(mid - 1)) {
						sb.append("no \n");
					} else if (S.charAt(mid) == S.charAt(mid - 1)) {
						while (start <= end - 2) {
							if (S.charAt(start) != S.charAt(end)) {
								sb.append("no \n");
								flag = false;
								break;
							} else if (S.charAt(start) == S.charAt(end)) {
								start++;
								end--;
							}
						}
						
						if (flag) {
							sb.append("yes \n");
						}
					}
				} else if (S.length() % 2 != 0) {
					while (start <= end - 2) {
						if (S.charAt(start) != S.charAt(end)) {
							sb.append("no \n");
							flag = false;
							break;
						} else if (S.charAt(start) == S.charAt(end)) {
							start++;
							end--;
						}
					}
					
					if (flag) {
						sb.append("yes \n");
					}
				}
				
				
				
				st = new StringTokenizer(br.readLine());
				num = Integer.parseInt(st.nextToken());
			}
		}
		
		System.out.println(sb);
	}

}