package Test;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class StartLink {
static int res , N ;
static int[][] arr;
static boolean[] chk;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		arr = new int[N][N];
		chk = new boolean[N];
		res =Integer.MAX_VALUE;
		StringTokenizer st = new StringTokenizer("");
		for(int i = 0 ; i < N ;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0 ; j < N ; j++) {
				int key = Integer.parseInt(st.nextToken());
				arr[i][j] = key;
			}
		}
		
		comb(0,0);
		System.out.println(res);
		
	}
	private static void comb(int D, int s) { // 조합
		// TODO Auto-generated method stub
		if(D == N/2) { // 깊이가 전체의 반을 뽑았을때/
			int asum = 0 ; //a팀합
			int bsum = 0 ; //b팀합
			for(int i =0; i < N ;i++) {
				for(int j = i+1 ; j < N ;j++) {
					if(chk[i] && chk[j] ) { // 둘다 true (뽑힌팀)
						asum+= arr[i][j];
						asum += arr[j][i];
					}else if(!chk[i] && !chk[j]) { // 둘다 false (안뽑힌팀)
						bsum+= arr[i][j];
						bsum += arr[j][i];
					}
				}
			}
			
			int diff = Math.abs(asum - bsum); // 차이값 저장
			
			if(diff == 0) { // 차이가 0이면 최소니까 그대로 출력
				System.out.println(diff);
				System.exit(0); // 시스템 종료
			}
			res = Math.min(diff, res); // 최솟값 저장.
		}
		
		for(int i = s ; i < N ; i++) { // 중복 X 조합.
			if(!chk[i]) {
				chk[i] = true; //방문처리
				comb(D+1 , i+1); // 다음거
				chk[i] = false; //방문X
			}
		}
	}

}
