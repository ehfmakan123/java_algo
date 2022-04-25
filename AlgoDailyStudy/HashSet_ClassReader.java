package HashSet;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class ClassReader {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashMap<Character, Integer> hs = new HashMap<>(); // 해시맵 선언 [ char , int]
		int N = Integer.parseInt(br.readLine());
		
		for(char x : br.readLine().toCharArray()) { // str 배열화 해서 for each 돌면서
			hs.put(x, hs.getOrDefault(x, 0)+1); // 기존값이 없으면 X,0 있으면 +1
		}
		
		int max = -1; // max value 값 초기화
		
		char res = ' '; // 출력값 초기화
		for(char x : hs.keySet()) { // keyset() 을 이용해 hashmap 전체 탐색
			if(hs.get(x) > max) { // get을 이용해 해당 key 값의 value를 불러와서 비교
				max = hs.get(x); // max 값에 value를 저장
				res = x;	// 결과값에 key 를 저장
			}
		}
		System.out.println(res);
	}

}
