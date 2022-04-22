package String;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class ExtractNumber {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
// 		Queue<Integer> q = new LinkedList<Integer>();
// 		for(char c : str.toCharArray()) {
// 			if(Character.isDigit(c)) {
// 				int key = c-'0';
// 				q.offer(key);
// 			}
// 		}
// 		int sum = 0 ;
// 		while(!q.isEmpty()) {
// 			sum += q.peek()*(Math.pow(10, q.size()-1));
// 			q.poll();
// 		}
// 		System.out.println(sum);
// 	}
	
//	##################### 2번/3번 째 풀이방법 (더 간단하다!!!)####################
	int sum = 0 ;
		String res ="";
		for(char c : str.toCharArray()) {
			if(Character.isDigit(c)) {
				int key = c-'0';
				sum = sum *10 + key;
				res += c;
			}
		}
		System.out.println(sum); // int 로 나타내기
		System.out.println(Integer.parseInt(res)); // String으로 입력 후 integer 변환
	}
}
