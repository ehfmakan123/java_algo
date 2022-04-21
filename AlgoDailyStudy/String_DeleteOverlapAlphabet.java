package String;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class DeleteOverlapAlphabet {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		Queue<Character> q = new LinkedList<Character>() ;
		
		for(int i = 0 ; i < str.length(); i++) {
			char c = str.charAt(i);
			if(!q.contains(c)) {
				q.offer(c);
			}
		}
		while(!q.isEmpty()) {
			System.out.print(q.poll());
		}
	}

}

// queue에 중복되지 않게 넣고 
