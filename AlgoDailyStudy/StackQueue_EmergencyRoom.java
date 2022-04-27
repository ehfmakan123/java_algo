package StackQueue;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class EmergencyRoom {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] arr = new int[N];
		st = new StringTokenizer(br.readLine());
    
		for(int i = 0 ; i < N ;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
    int res = 0;
		
		Queue<Person> q = new LinkedList<>();
		
		for(int i = 0 ;i < N ;i++) {
			q.offer(new Person(i ,arr[i]));
		}
    
    // 여기까지가 입력
		
		while(!q.isEmpty()) { // 큐가 빌때까지 반복 ( 우선순위 정렬)
			Person tmp = q.poll(); // 큐의 첫번째를 비교
			for(Person x : q) { // 다음 큐 부터 비교 
				if(x.priority > tmp.priority) {  // 위험도가 기준값보다 크면
					q.offer(tmp); // 큐에 tmp 를 넣음(맨 뒤로 보냄)
					tmp = null; // 기준 초기화
					break;  // for 문 break;
				}
			}
			if(tmp != null) { // tmp의 위험도가 더 큰 경우
				res++; // 현재 id값 => res
				if(tmp.id == M) { // tmp의 id 값이 결과값과 같으면
					System.out.println(res); 
				}
			}
		}
	}

}

class Person{ // 새로운 클래스 생성 (id , priority)
	int id ; // 처음 들어온 순서
	int priority; // 위험도
	public Person(int id , int priority) {
		this.id = id;
		this.priority = priority;
	}
}



/// 어렵다 나중에 한번 더 
