package Test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception{
		System.setIn(new FileInputStream("res/RoomAssignment_input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int[][] arr = new int[2][7];
		int res = 0;
		for(int i = 0 ; i < N ; i++) {
			st = new StringTokenizer(br.readLine());
			int S = Integer.parseInt(st.nextToken());
			int Y = Integer.parseInt(st.nextToken());	
			arr[S][Y]++;
		}
		for(int i= 0; i<  2 ; i++) {
			for(int j = 0 ; j < 7 ; j++) {
			res +=	arr[i][j] % K == 0 ? arr[i][j]/K : arr[i][j]/K +1;
			}
		}
		System.out.println(res);
		br.close();
	}
}
