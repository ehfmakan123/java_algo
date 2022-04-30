package DFSBFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class PizzaDist {
	
static int N , M ,res, len;
static int[][] arr;
static int[] comb;
static ArrayList<Point> pz , hs;

// 1은 집 2는 피자집 0은 빈칸.

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
    
		pz = new ArrayList<>(); // 피자집과 집의 위치를 arraylist에 저장.
		hs = new ArrayList<>();
    
		arr = new int[N][N];
		for(int i = 0 ; i <N ; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0 ; j < N ;j++) {
				int key = Integer.parseInt(st.nextToken());
				arr[i][j] = key;
				if(key == 1) {
					hs.add(new Point(i,j)); // 집 저장
				}else if(key == 2) {
					pz.add(new Point(i,j)); // 피자집 저장
				}
			}
		}
		res = Integer.MAX_VALUE; // res 초기화 (MAX)
		len = pz.size(); 
		comb = new int[M]; // 피자집 갯수 중에 M개를 뽑기위함. 
		dfs(0,0);
		System.out.println(res);
	}

private static void dfs(int D, int s) {
	// TODO Auto-generated method stub
	if( D == M) {  // 조합이 완료되면 실행( M개의 피자집 뽑기)
		 int sum = 0 ;
		 for(Point h : hs) {
			 int dis = Integer.MAX_VALUE;
			 for(int i : comb) {
				 dis = Math.min(dis, Math.abs(h.x-pz.get(i).x) + Math.abs(h.y - pz.get(i).y)); // 거리 계산
			 }
			 sum += dis; // 더하기
		 }
		 res = Math.min(res, sum); // 최솟값.
	}
	else { // 조합
		for(int i = s ; i < len ; i++) {
			comb[D] = i;
			dfs(D+1 , i+1);
			}
		}
	}
}

class Point{
	int x , y;
	public Point(int x , int y) {
		this.x = x;
		this.y = y;
	}
}


//어렵다..
