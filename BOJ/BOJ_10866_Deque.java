import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Deque<Integer> dq = new LinkedList<>();
		int x = 0 ;
		for(int t = 0 ; t < N ; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String str = st.nextToken();
			switch (str) {
			case "push_front":
				x = Integer.parseInt(st.nextToken()); //addFirst()
				dq.addFirst(x);
				break;
			case "push_back":
				x = Integer.parseInt(st.nextToken()); //addLast()
				dq.addLast(x);
				break;
			case "pop_front":
				if(dq.isEmpty()) {
					System.out.println("-1");
				}else {
					System.out.println(dq.pollFirst()); // pollFisrt()
				}
				break;
			case "pop_back":
				if(dq.isEmpty()) {
					System.out.println("-1");
				}else {
					System.out.println(dq.pollLast()); // pollLast()
				}
				break;
			case "size":
				System.out.println(dq.size()); //size()
				break;
			case "empty":
				if(dq.isEmpty()) {
					System.out.println("1"); // isEmpty()
				}else {
					System.out.println("0");
				}
				break;
			case "front":
				if(dq.isEmpty()) {
					System.out.println("-1");
				}else {
					System.out.println(dq.peekFirst()); // peekFirst()
				}
				break;
			case "back":
				if(dq.isEmpty()) {
					System.out.println("-1");
				}else {
					System.out.println(dq.peekLast()); // peekLast()
				}
			}
		}
	}

}
