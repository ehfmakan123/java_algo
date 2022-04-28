package Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class HideAndSeek_BOJ1697 {
static int N , K;
static boolean[] chk;
static int[] d ;
static Queue<Integer> q = new LinkedList<Integer>();
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		chk = new boolean[100001];
		d = new int[] {-1,1};
		
		System.out.println(bfs(N,K));
	}
	private static int bfs(int s, int k) {
		chk[s] = true;
		q.offer(s);
		int lev = 0;
		while(!q.isEmpty()) {
			int len = q.size();
			for(int i = 0 ; i < len ; i++) {
				int x = q.poll();
				if(x == k) return lev;
				for(int j = 0 ; j<3 ; j++) {
					int nx;
					if(j < 2) {
						nx = x + d[j];
					}else {
						nx = x*2;
					}
					if(nx >=0 && nx <= 100000 && !chk[nx]) {
						q.offer(nx);
						chk[nx]  = true;
					}
				}
			}
			lev++;
		}
		// TODO Auto-generated method stub
		return 0;
	}

}
