package Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RockPaperScissors {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < N ; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < N ; i++) {
			int key = Integer.parseInt(st.nextToken());
			if(arr[i] == key) {
				System.out.println("D");
			}else if(arr[i] == 1) {
				if(key == 3) {
					System.out.println("A");
				}else {
					System.out.println("B");
				}
			}else if(arr[i] == 2) {
				if(key == 1) {
					System.out.println("A");
				}else {
					System.out.println("B");
				}
			}else if(arr[i] == 3) {
				if(key == 1) {
					System.out.println("B");
				}else {
					System.out.println("A");
				}
			}
		}
	}
}
