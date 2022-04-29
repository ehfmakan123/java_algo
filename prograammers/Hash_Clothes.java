import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        HashMap<String, Integer> hm = new HashMap<>();
        int answer = 1;
        
        for(int i = 0 ; i < clothes.length ; i++) {
        	String key = clothes[i][1];
        	hm.put(key, hm.getOrDefault(key, 0) +1);
        }
        for(int x : hm.values()) {
        	answer *= (x+1);
        }
        
        return answer-1;
    }
}
