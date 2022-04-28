package Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class PrinterQueue_BOJ1966 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T =Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer("");
		for(int t = 0 ; t <T ; t++) {
			st = new StringTokenizer(br.readLine());
			int N =Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			Queue<Doc> q = new LinkedList<Doc>(); // Doc로 변경해서 queue에 저장
			int res = 0 ;
			
			st = new StringTokenizer(br.readLine());
			for(int i =0  ; i < N ;i++) {
				q.offer(new Doc( i , Integer.parseInt(st.nextToken()))); // 순서와 우선순위 저장
			}
      
			while(!q.isEmpty()) {
				Doc tmp = q.poll(); // 비교할값을 큐에서 빼줌 (첫번째값) 

				for(Doc x : q) { // 큐를 순회 -> tmp가 제일 우선순위가 높은지 확인
					if(x.pri > tmp.pri) { // 비교값보다 우선순위가 크면
						q.offer(tmp); // 큐에 다시 tmp를 넣음 (뒤로 가셈)
						tmp = null; // tmp 비워주고 for문 넘어감
						break;
					}
				}
        
				if(tmp != null) {  // 우선순위가 맞으면
					res++; // 자릿수 카운팅
					if(tmp.num == M) { // 찾는 숫자가 맞으면
						System.out.println(res); // 해당 자릿수 출력
					}
				}
			}
			
		}
	}

}
class Doc { // 번호와 우선순위를 받아서 Doc 클래스로 저장
	int num;
	int pri;
	public Doc(int num , int pri) {
		this.num = num;
		this.pri =pri;
	}
}
