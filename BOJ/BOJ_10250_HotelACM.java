package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class HotelACM_BOJ10250 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st ;
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
			for(int t = 1 ; t <= T ; t++) {
				st = new StringTokenizer(br.readLine());
				int H = Integer.parseInt(st.nextToken());
				int W = Integer.parseInt(st.nextToken());
				int N = Integer.parseInt(st.nextToken());
				int a = N % H ;
				if(N%H == 0) {
					a = H;
				}
				int b = 0;
				if(N%H != 0 ) {
					b = N/H +1;
				}else
					b = N/H ;
				if(b < 10) {
				sb.append(a+"0"+b+"\n");
				}else {
					sb.append(a);
					sb.append(b+"\n");
				}
			}
			sb.substring(0, sb.length()-1);
			System.out.println(sb.toString());
			br.close();
	}

}
