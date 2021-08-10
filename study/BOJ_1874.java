//스택수열

package algo.study;

import java.io.*;
import java.util.Stack;
public class stack {
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("res/stack_input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();	// 출력할 결과물 저장
		Stack<Integer> stack = new Stack<>();
		int N = Integer.parseInt(br.readLine()); // 배열의 갯수를 입력받음.
		int idx = 0; // 시작점 설정.
		
		// N 번 반복
		for(int i = 0 ; i< N ; i++) {
			int val = Integer.parseInt(br.readLine());
			if(val > idx) {
				// idx + 1부터 입력받은 value 까지 push를 한다.
				for(int j = idx + 1; j <= val; j++) {
					stack.push(j); // val 보다 작은값들을 stack에 push
					sb.append("+").append("\n");	// + 를 저장한다. 
				}
				idx = val; 	// 마지막으로 push 한 값을 저장!
			}
			// stack 에 쌓은 원소가 val 이 아닌경우
			else if(stack.peek() != val) {
				System.out.println("NO");
				return; // 한해주면 null point에러
			}
			stack.pop();
			sb.append("-").append("\n");
		}
		System.out.println(sb);
		br.close();
	}
}

