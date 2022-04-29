import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        Arrays.sort(participant); 
        Arrays.sort(completion);
        // 입력받은 두 배열을 정렬.
        int x = participant.length-1 ; // 1명만 탈락했다고 말해줫음 (만약 앞에서 두 배열이 전부 같으면 마지막놈이 자동으로 탈락)
        
        for(int i = 0 ; i< completion.length ; i++){
           if(!participant[i].equals(completion[i])){ // 각 배열이 같은지 확인 다른놈 있으면 그놈이 범인
               x = i; // 해당 인덱스를 저장
               break;
           }
        }
        
        
        return participant[x]; //탈락한 참가자 출력
     }
}
