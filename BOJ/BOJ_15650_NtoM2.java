import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
static int M , N;
static int[] arr;
static StringBuilder sb;
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		sb = new StringBuilder();
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int[M];
		
		dfs(1,0); // 1부터 시작
		System.out.println(sb.toString());
		br.close();
		
	}
	private static void dfs(int st, int depth) {
		// TODO Auto-generated method stub
		if(depth == M) { // 깊이가 M일때 (종료 조건)
			for(int i : arr) {
				sb.append(i+" "); // 배열에 있는걸 전부 sb에 넣음
			}
			sb.append("\n");
			return;
		}
		
		for(int i = st; i <= N; i++) { // 현재 시작점 부터 반복 (중복 X)
			arr[depth] = i; // depth 번째 배열에 i 입력
			dfs(i+1, depth+1); // dfs 
		}
	}

	

}
