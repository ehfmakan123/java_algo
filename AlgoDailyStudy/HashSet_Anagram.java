package HashSet;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Anagram {

	public static void main(String[] args)  throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String str2 = br.readLine();
		String ans = "YES";
		
		HashMap<Character, Integer> hm = new HashMap<>();
		
		for(char key : str.toCharArray()) {
			hm.put(key, hm.getOrDefault(key, 0) + 1);
		}
		
		for(char key : str2.toCharArray()) {
			if(!hm.containsKey(key) || hm.get(key) == 0) { // 두번째 문자열이 hashmap 에 없거나 남은 key 값이 0 일때
				ans = "NO";
			}else {
				hm.put(key, hm.get(key)-1);
			}
		}
		System.out.println(ans);
		
	}

}
