import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) { 
       int[] ans = new int[commands.length]; // 답을 저장할 배열 선언 (들어오는 commmand배열 갯수만큼 출력 할거임)
        
       for(int i = 0 ; i  < commands.length ; i++) { 
    	   int[] temp = Arrays.copyOfRange(array,commands[i][0]-1, commands[i][1]); // copyOfRange 선언 (원본 배열 , 시작인덱스 , 끝 인덱스)
    	   Arrays.sort(temp); // 정렬
    	   ans[i] = temp[commands[i][2]-1]; // 정렬한 배열의 (마지막값-1)인덱스 -> ans에 넣어줌
       }
       return ans;
    }
}
