
import java.io.*;
import java.util.*;

public class josephus {
	public static void main(String[] args) throws Exception {
	//System.setIn(new FileInputStream("res/input.txt"));
	BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st = new StringTokenizer(br.readLine());
	
	StringBuilder sb = new StringBuilder();
	sb.append("<");
	int N = Integer.parseInt(st.nextToken());
	int K = Integer.parseInt(st.nextToken());
	
	Queue <Integer> q = new LinkedList<Integer>();
	
	
	for(int i = 1 ; i  <= N ; i ++) {
		q.offer(i);
	}
	while(q.size() != 1) {
		for(int i= 0 ; i < K-1 ;i++) {
			q.offer(q.poll());
		}
		sb.append(q.poll()).append(", ");
	}
	sb.append(q.poll()).append(">"); // q의 사이즈가 1밖에 남지 않았을때에는 그냥 추가
	
	System.out.println(sb);
	br.close();
	}		
}

