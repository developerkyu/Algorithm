import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 과목의 개수를 입력 받는다
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		// 과목의 개수 크기의 int 배열 하나를 만든다.
		int[] arr = new int[num];
		
		// 입력받은 과목의 개수만큼 점수를 받는다.
		// int 배열에 점수들을 저장한다.
		for (int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}
		
		sc.close();
		
		// 최고점을 찾는다.
		int highest = arr[0];
		for (int i = 1; i < num; i++) {
			if (arr[i] > highest) {
				highest = arr[i];
			}
		}
		
		// 최고점을 기준으로 평균을 다시 구한다.
		double sum = 0.0;
		for (int i = 0; i < num; i++) {
			sum += (arr[i] / (double) highest * 100);
		}
		
		double average = sum / num;
		
		System.out.println(average);
	}

}