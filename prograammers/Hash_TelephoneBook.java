import java.util.*;

class Solution {
    public boolean solution(String[] arr) { // T/F 로 출력 입력은 String[]
        boolean answer = true; 
        Arrays.sort(arr); // 일단 정렬.

        int len = arr.length;
        
        for(int i = 0 ; i < len-1 ; i++){  
            if(arr[i+1].startsWith(arr[i])){ // arr[i] 가 arr[i+1] 에 있는지 검사하는 함수 startWith()
              answer = false; 
            }
        }
        return answer;
    }
}
