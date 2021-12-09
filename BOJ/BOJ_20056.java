package Test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class F_WizardShark_BOJ20056 {
	
	static class Fireball{ // 여러개의 변수를 담고있는 fireball class 생성
		int x, y, m, s, d; // x,y 좌표값 , 질량 , 속도 , 방향
		public Fireball(int x, int y, int m, int s, int d) {
			this.x = x;
			this.y = y;
			this.m = m; 
			this.s = s;
			this.d = d;
		}
	}	
	static int N,M,K; // N, M, K 받음 ( 맵의 크기 , F갯수 , 이동 횟수 )
	static int res ; // 결과 저장 res
	static int[] dx = {1,1, 0, -1, -1, -1, 0, 1}; // 8방 탐색
	static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
	static List<Fireball>[][] map; // list 배열 map
	static List<Fireball> list = new ArrayList<>(); 

	public static void main(String[] args)throws Exception {
		System.setIn(new FileInputStream("res/F_WizardShark_input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		
		map = new List[N][N];
		
		for(int i = 0 ; i < N ; i++) {
			for(int j = 0 ; j < N ; j++) {
				map[i][j]  = new ArrayList<>();
			}
		}
		for(int i = 0 ;i < M ; i++) {
			st = new StringTokenizer(br.readLine()); // x,y 좌표값은 1,1 부터 시작하므로 1씩 빼서 입력받았음
			list.add(new Fireball(Integer.parseInt(st.nextToken()) - 1,
					Integer.parseInt(st.nextToken()) - 1,
					Integer.parseInt(st.nextToken()),
					Integer.parseInt(st.nextToken()),
					Integer.parseInt(st.nextToken())));
		}
		solve();

	}

	private static void solve() {
		int res = 0 ;
		for(int t = 0 ; t < K ; t++) {
			
			
			for(Fireball cur : list) { //list 에 있는 fireball을 순회
				// 파이어볼 이동
				int nx = (cur.x + N + dx[cur.d] * (cur.s % N)) % N; // N번째 칸이 1이랑연결
				int ny = (cur.y + N + dy[cur.d] * (cur.s % N)) % N;
				
				cur.x = nx;
				cur.y = ny; 
				
				map[nx][ny].add(cur);// 이동 끝난 후 위치에 fireball 저장
			}
			
			for(int i = 0 ; i < N ; i++) {
				for(int j = 0 ; j < N ; j++) {
					if(map[i][j].size() == 1) map[i][j].clear();
					if(map[i][j].size() < 2) continue;
					
					int msum = 0 ;
					int ssum = 0 ; // 질량합 ,속력합
					
					boolean even = map[i][j].get(0).d % 2 == 0 ? true : false;
					boolean odd = map[i][j].get(0).d % 2 == 1 ? true : false;

					for(Fireball cur : map[i][j]) {
						msum += cur.m;
						ssum += cur.s;
						even = even & cur.d % 2 == 0 ? true : false;
						odd = odd & cur.d % 2  == 1 ? true : false;
						list.remove(cur);
					}
					
					int nm = msum/5;
					int size =map[i][j].size();
					map[i][j].clear();
					
					if(nm == 0)	continue;
					
					int ns = ssum/size;
					
					if(even | odd) { 	// 0 2 4 6
						for(int k = 0; k < 8; k += 2) {
							list.add(new Fireball(i, j, nm, ns, k));
						}
					}else { // 1 3 5 7
						for(int k = 1; k < 8; k += 2) {
							list.add(new Fireball(i, j, nm, ns, k));
						}
					}
					
				}
			}
		}
		for(Fireball cur : list) res += cur.m;
		System.out.println(res);
	}
}
