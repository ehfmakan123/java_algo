package Test;
import java.io.BufferedReader;
//Swea-1223
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Stack;

public class Calculator2_SWEA1223 {
	public static void main(String[] args)throws Exception {
		System.setIn(new FileInputStream("res/Calcuclator2_inmput.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Stack<Character> op = new Stack<>(); //  연산자를 담을 스택을 선언
		Stack<Integer> num = new Stack<>(); // 숫자를 담을 스택 선언
		
		for(int tc = 1 ; tc <= 10 ; tc++) {
			int T = Integer.parseInt(br.readLine());
			String line = br.readLine();
			String str = "";
			for(int i = 0 ; i < line.length(); i++) {
				char c = line.charAt(i);
				
				if(c-'0' >= 0 && c-'0' <= 9 ) {
					str += c;
				}else {
					if(c == '*')	op.push(c);
					else {
						while(!op.isEmpty() && (op.peek() == '*' || op.peek() == '+')) {
							str += op.pop();
						}
						op.push(c);
					}
				}
			}
			while(!op.empty())	str += op.pop();
			
			
			
			for(int i = 0 ; i< T ; i++) {
				char c = str.charAt(i);
				
				if(c-'0' >= 0 && c-'0' <= 9 ) {
					num.push(c-'0');
				}
				else {
					int num1 = num.pop();
					int num2 = num.pop();
					
					if(c=='*') num.push(num1*num2);
					else if(c == '+') num.push(num1+num2);
				}
			}
			System.out.print("#" + tc +" "+ num.pop()+"\n");
		}
		br.close();
	}

}
