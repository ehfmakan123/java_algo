import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        HashMap<String, Integer> hm = new HashMap<>(); // 들어오는 String[][] 을 해시맵에 저장할거임.
        int answer = 1; // 경우의 수 ->  (n+1) * (m+1) * (l+1) ..... -1 이런식으로 되는거니까 초기값을 1로 지정 (0하면 곱해도 0임) 
        
        for(int i = 0 ; i < clothes.length ; i++) { 
        	String key = clothes[i][1]; // 옷의 종류만 받으면됨 이름은 필요 X 
        	hm.put(key, hm.getOrDefault(key, 0) +1); // 해시맵에 저장하되 같은 종류면 +1 새로운거면 default 0 +1 
        }
        for(int x : hm.values()) { // 해시맵 안에 있는 value 들을 +1 해서 곱해줌
        	answer *= (x+1);
        }
        
        return answer-1; // 어떤 옷도 안입는 경우는 제외 ( 무조건 하나는 입어야함.)
    }
}
