package Test;

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;


public class Couple {
	
	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("res/Couple_input.txt"));	
		Scanner sc =new Scanner(System.in);
	
		for(int tc = 1 ; tc <= 10 ; tc++) {
			int N = sc.nextInt();
			sc.nextLine();
			String str = sc.next();
			
			int ans = 0 ;
			Stack<String> st = new Stack();
			
			for(int i = 0 ; i < N ; i++) { // key 는 str을 한글자식 잘랏음
				String key = str.substring(i,i+1);
				
				if( (key.equals(")") && !st.isEmpty() && st.peek().equals("(") ) )   // key가 해당 값이고 스택이 비지 않았으면서 
						st.pop();		// 스텍의 top값이 짝이면 삭제 아니면 else 마지막으로 가서 스텍의 top에 값을 push
				else if( (key.equals("]") && !st.isEmpty() && st.peek().equals("[") ) )
					st.pop();
				else if( (key.equals("}") && !st.isEmpty() && st.peek().equals("{") ) )
					st.pop();
				else if( (key.equals(">") && !st.isEmpty() && st.peek().equals("<") ) )
					st.pop();
				else
					st.push(key);
			}
			if(st.isEmpty()) {
				ans = 1; // true
			}else {
				ans = 0; // false
			}
			System.out.println("#"+tc+" "+ans);
		}
		sc.close();
	}
}




