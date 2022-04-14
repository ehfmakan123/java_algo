package Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Turret_BOJ1002 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int t = 1; t <=T ; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int cx = Integer.parseInt(st.nextToken());
			int cy = Integer.parseInt(st.nextToken());
			int r1 = Integer.parseInt(st.nextToken());
			int bx = Integer.parseInt(st.nextToken());
			int by = Integer.parseInt(st.nextToken());
			int r2 = Integer.parseInt(st.nextToken());
			double dpow =  Math.pow(Math.abs(cx-bx), 2)+  Math.pow(Math.abs(cy-by), 2);
			
			if(cx == bx && cy == by && r1 == r2) { // 같은원일떄
				System.out.println("-1");
			}else if(dpow > Math.pow(r1+r2, 2)) { // 두 점의 사이가 반지름의 합보다 클때 
				System.out.println("0");
			}else if(dpow < Math.pow(r2-r1, 2)) { // 원안에 원이 있는데 내접 X
				System.out.println("0");
			}else if(dpow == Math.pow(r2-r1, 2)) { // 내접
				System.out.println("1");
			}else if(dpow == Math.pow(r1+r2, 2)) { // 외접
				System.out.println("1");
			}else {
				System.out.println("2");
			}
		}
	}

}

//범위를 이상하게 나누어서 시간이 오래걸렸음;;; 
//형변환 해서 하면 계산이 이상해진다 (double -> int )등.. (부동소수점) -> 의!
