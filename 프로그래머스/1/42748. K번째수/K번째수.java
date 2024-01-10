import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < commands.length;i++) {
            int start = commands[i][0];
            int end = commands[i][1];
            int index = commands[i][2];
            
            int[] temp = Arrays.copyOfRange(array, start - 1, end);
            
            Arrays.sort(temp);
            
            list.add(temp[index - 1]);
        }
        
        int[] answer = new int[list.size()];
        int index = 0;
        for (int i: list) {
            answer[index++] = i;
        }
        
        return answer;
    }
}