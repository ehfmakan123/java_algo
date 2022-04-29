import java.util.*;
class Solution {
    public int solution(int[] citations) {
        int len = citations.length; // 배열길이를 저장
        
        Arrays.sort(citations); // 정렬
        
        int answer = 0 ; 
        
        for(int i = 0 ; i <  len ; i++) { // for문을 돌린다.
        	
        	int key = len - i ;  // 비교값 ( N 부터 시작)
        	
        	if(citations[i] >= key) { // 최솟값 찾기 , key 번 이상 인용된게 key개 여야함.
        		answer = key; // 찾ㅇ으면 이걸 결과로 출력 ( Max)
        		break;
        	}
        }
        return answer;
    }
}
