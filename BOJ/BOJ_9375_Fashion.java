package Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class FashionKing_BOJ9375 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br  =new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		for(int t = 0 ; t < T ; t++) { // 테스트 케이스 
			HashMap<String, Integer> hm = new HashMap<>(); // 물건 종류 /  갯수 해시맵
			
			int N = Integer.parseInt(br.readLine());
			
			for(int i = 0 ; i< N ; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				st.nextToken(); // 물건 이름은 필요 X
				String str = st.nextToken(); // 종류를 str에 저장
				
				if(hm.containsKey(str)) { // 이미 저장한 종류면 key + 1
					hm.put(str, hm.get(str)+1);
				}else {
					hm.put(str, 1); // ㅇ없으면 새로 만들기
				}
			}
				
			int res = 1;
				
			for(int val : hm.values()) { // 종류별로 가진옷 갯수+1 만큼 전체 결과에 곱해줌.
				res *= (val+1);
			}
			
			sb.append(res-1).append("\n"); // 안입는 경우의 수 1 빼줌
		}
		System.out.println(sb.toString());
	}
}

// hat 2종류 , eyewear 3종류일 경우 -> 12 {(2+1) * (3+1)} -1 = 11가지 경우의 수.(뭐든지 1개만 입으면 됨(중복X))

