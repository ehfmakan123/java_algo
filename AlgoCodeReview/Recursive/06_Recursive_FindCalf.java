import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	int answer = 0;
	int[] dis = {-1, 1 ,5};
	boolean[] chk ;
	Queue<Integer> q = new LinkedList<>();
	
	public int BFS(int s, int e) {
		chk = new boolean[10001]; // 전체 위치를 저장할 chk 배열
		chk[s] = true;	// 처음 시작위치 s 는 방문 체크해주기
		q.offer(s);	// 큐에 루트를 넣어준다.
		int L = 0;	// 루트는 레벨 0 (이동 거리 0)
		while(!q.isEmpty()) {	// 큐에 넣은 친구들을 하나씩 꺼내서 볼거야
			int len = q.size();	// 큐의 크기만큼 레벨 순환
			for(int i = 0; i < len ;i++) {
				int x = q.poll(); // 비교군을 큐에서 꺼냄
				for(int j= 0 ; j < dis.length ; j++) { // dis 배열에 있는걸 하나씩 확인
					int nx = x+dis[j]; // 다음 위치값 x + dis[j]
					if(nx == e) return L+1; // 여기서 도착하면 그대로 레벨 +1 (nx기준) 출력!!
					if(nx >= 1 && nx <= 10000 && !chk[nx]) { //범위 조건을 만족하면
						chk[nx] = true; // 방문체크 해주기.
						q.offer(nx);	// nx좌표를 큐에 넣어주기!
					}
				}
			}
			L++; // for문을 돌았으면 레벨 증가... (전 레벨 큐를 전부 꺼내봤으면)
		}
		return -1 ; // BFS 종료시 리턴값... 근데 무조건 있다 했으니까 상관 X
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st =new StringTokenizer(br.readLine());
		Main T = new Main();
		int s = Integer.parseInt(st.nextToken());
		int e = Integer.parseInt(st.nextToken());
		System.out.println(T.BFS(s,e));
	}
}


//설명
//
//현수는 송아지를 잃어버렸다. 다행히 송아지에는 위치추적기가 달려 있다.
//
//현수의 위치와 송아지의 위치가 수직선상의 좌표 점으로 주어지면 현수는 현재 위치에서 송아지의 위치까지 다음과 같은 방법으로 이동한다.
//
//송아지는 움직이지 않고 제자리에 있다.
//
//현수는 스카이 콩콩을 타고 가는데 한 번의 점프로 앞으로 1, 뒤로 1, 앞으로 5를 이동할 수 있다.
//
//최소 몇 번의 점프로 현수가 송아지의 위치까지 갈 수 있는지 구하는 프로그램을 작성하세요.
//
//입력
//첫 번째 줄에 현수의 위치 S와 송아지의 위치 E가 주어진다. 직선의 좌표 점은 1부터 10,000까지이다.
//
//
//출력
//점프의 최소횟수를 구한다. 답은 1이상이며 반드시 존재합니다.

// BFS 기본을 이용한 송아지 찾기 문제..
// BFS는 시작위치를 큐에 넣고 하나씩 확인하면서 찾는식으로 구현한다..
// 구현하는거 헷갈리지 말고 차근차근 생각해보기!!!

