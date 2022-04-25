package HashSet;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class FindAllAnagram {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		String str2 = br.readLine();
		
		int res = 0 ;
		
		HashMap<Character, Integer> hm = new HashMap<>();
		HashMap<Character, Integer> hm2 = new HashMap<>(); // 해시셋 두개를 비교 ( equals 사용 가능)
		
		for(char key : str2.toCharArray()) {
			hm2.put(key, hm2.getOrDefault(key, 0) + 1);
		}
		
		int l = str2.length()-1;
		
		for(int i = 0 ; i < l; i++) { // 기준 해시셋 (윈도우)
			hm.put(str.charAt(i), hm.getOrDefault(str.charAt(i), 0) +1);
		}
		
		int lt = 0 ;
		
		for(int rt = l ; rt < str.length() ; rt++) { // 비교 해시셋 
			hm.put(str.charAt(rt), hm.getOrDefault(str.charAt(rt), 0) + 1);
			if(hm.equals(hm2)) res++;
			hm.put(str.charAt(lt), hm.getOrDefault(str.charAt(lt), 0) -1);
			if(hm.get(str.charAt(lt)) == 0) {
				hm.remove(str.charAt(lt));
			}
			lt++;
		}
		System.out.println(res);
	}

}
