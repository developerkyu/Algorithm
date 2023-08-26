import java.util.Scanner;

public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int length = sc.nextInt();
        String number = sc.next();
        
        sc.close();
        
        int result = 0;
        
        for (int i = 0; i < length; i++) {
        	result += number.charAt(i) - '0';
        }
        
        System.out.println(result);
        
	}

}