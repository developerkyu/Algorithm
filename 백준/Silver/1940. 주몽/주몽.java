import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		// N (재료의 개수), M (갑옷이 되는 번호) 저장하기, count = 0 초기화    
        int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
        int count = 0;
        
        // for (N 만큼 반복) {
        //    재료 배열 저장하기
        // }
        int[] A = new int [N];
        
        // 배열의 입력을 한 줄로 쭉 받으려면 StringTokenizer를 써야한다.
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        
        // 재료 배열 정렬하기
        Arrays.sort(A);
        
        // while(i < j) {
        //   if (재료의 합 < M) i++;
        //    else if (재료의 합 > M ) j--;
        //    else if (재료의 합 == M) i++; j--; count++;
        // }
        int i = 0;
        int j = N - 1;
        
        while (i < j) {
        	if (A[i] + A[j] < M) i++;
        	else if (A[i] + A[j] > M) j--;
        	else if (A[i] + A[j] == M) {
        		i++;
        		j--;
        		count++;
        	}
        }
          
        // count 출력하기
        System.out.println(count);
        
	}
}