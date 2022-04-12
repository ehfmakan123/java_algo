package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class findroot {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int res = Integer.parseInt(br.readLine());
		int ans = (int) Math.sqrt(res);
		int key = ans * ans;
//		System.out.println(ans);
		if( key != (res)) {
			System.out.println("-1");
		}else {
			System.out.println((ans+1)*(ans+1));
		}
	
	}

}

// 프로그래머스 
