import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
static int[][] map ;
static int[] dx = {0,-1,1,0,0};
static int[] dy = {0,0,0,-1,1};
static int N ,res;
static Queue<salt> q; 

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int tc = 1 ; tc <= T ; tc++) {
			sb.append("#").append(tc).append(" ");
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken()); // 연못의 크기.
			int S = Integer.parseInt(st.nextToken()); // 소금쟁이 수
			map = new int [N][N];
			res = 0 ;
			q = new LinkedList<salt>(); 
			
			for(int i = 0 ; i < S ; i++) {
				st = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				int d = Integer.parseInt(st.nextToken());
				q.offer(new salt(x, y, d));
			}
			solve();
			sb.append(res+"\n");
		}
		System.out.println(sb.toString());
		br.close();
		
	}
	
	private static void solve() {
		while(!q.isEmpty()) {
			salt psalt = q.poll(); // 소금쟁이 출발~ 
//			System.out.print(psalt.x +" ");
			if(map[psalt.x][psalt.y] == 1) { // 시작위치 체크.
//				System.out.println("우물킬은 에바지 ㅋㅋ");
				map[psalt.x][psalt.y] = 0 ;
				continue;
			}
			
			for(int i = 1 ; i <= 3 ; i++) {
						int k = psalt.d;
						int nx = psalt.x + i*dx[k];
						int ny = psalt.y + i*dy[k];
						if(nx >= 0 && ny >= 0 && nx < N && ny < N && map[nx][ny] == 0) {
							map[psalt.x][psalt.y] = 0; //  현재 위치를 벗어남.
							map[nx][ny] = 1; // 다음 장소로 간닷..!
							psalt.x = nx;
							psalt.y =ny;
							if(i == 3) {
								res++; // 이걸사네 ㅋㅋ
//								System.out.println("이걸 사네 ㅋㅋ");
							}
						}else {
//							System.out.println("이게 죽네 ㅋㅋ");
							break;
					}
				}
			}
		}
	}

	class salt{
		public int x;
		public int y;
		public int d;
		salt(int x, int y, int d){
			this.x = x;
			this.y = y;
			this.d = d ;
		}
}


// 소금쟁이 중첩.
// N*N 정사각형 연못 가정 , 소금쟁이가 물위를 뛰어다님. 순서대로 3,2,1칸 뜀
// 여러마리가 순서랑 방향 다르게 뜀. 연못밖으로 나가거나 앞에 뛴 소금쟁이가 
// 세번뛰고 머무른 위치랑 겹치면 죽음 끄앙... 
// 시작위치에 다른 소금쟁이가 있어도 죽음 끄앙...
// 살아있는 소금쟁이 수는???

// 초기화 같은 잔실수가 많아서 시간이 엄청 걸렸다 반성하자 
// 실수 1 : salt 클래스 구현부 선언
// 실수 2 : psalt 좌표 이동 후 psalt의 좌표값을 nx로 바꿔주는것
// 위 두개 때문에 30분은 넘게 잡아먹혔음 
