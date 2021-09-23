
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
	System.setIn(new FileInputStream("res/top_input.txt"));
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 버퍼드 리더 Scanner 로 컴파일하면 시간초과
	int N = Integer.parseInt(br.readLine());			// br.readLine() 으로 정수 읽음
	StringTokenizer st = new StringTokenizer(br.readLine());  // 뒤에 문자열을 잘라서 읽음
	
	
	Stack<int[]> stack = new Stack<>(); // 스택선언 배열을 스택으로 쌓는데 0번째에는 신호를 송신하는 송신탑 번호 ,1번째에는 현재 송신탑의 높이
	for(int i = 0 ; i < N ; i++) {
		
		int height = Integer.parseInt(st.nextToken());  // 토크나이저로 받은 string 을 인트로 잘라서 넣음 
		
		
		while(!stack.isEmpty()) { // 스택이 비어있지 않을 경우 반복문 계속돌림.
			
			if(stack.peek()[1] >= height) { // 스택에 있는 송신탑 높이와 현재 높이를 비교
				System.out.print(stack.peek()[0] + " "); // 스택에 있는 송신탑의 위치값을 출력
				break;
			}
			stack.pop(); // 스택에 들어간 데이터를 버림 (스택의 송신탑보다 현재 탑이 더 높은 경우)
		}
		
		
		
		
		if(stack.isEmpty()) { // 스택에 데이터가 없는 경우 현재의 송신탑보다 높은 탑이 없으므로 데이터를 받을 탑이 X
			System.out.print("0 ");
		}
		stack.push(new int[] {i+1 , height}); // 위치값을 0 부터 받았지만 문제에서는 1부터 표기하니 위치값 + 1 저장
		
		}
	}
}
