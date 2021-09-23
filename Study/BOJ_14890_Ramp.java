package Test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ramp_BOJ14890 {
	static int N , L , res = 0 ;
	static int[][] map1 , map2;
	static boolean[] ramp;
	public static void main(String[] args) throws Exception {
		//System.setIn(new FileInputStream("res/Ramp_input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		L = Integer.parseInt(st.nextToken());
		map1 = new int[N][N]; // 가로 확인
		map2 = new int[N][N]; // 세로 확인용 배열 (뒤집은 행렬)
		
		for(int i = 0 ; i < N ; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0 ; j < N ; j++) {
				map1[i][j] = map2[j][i] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i = 0 ; i < N ; i++) {
			chk(i,map1); // 확인
			chk(i,map2); // 뒤집어서 확인
		}
		System.out.print(res);
    br.close();
	}
	private static void chk(int x, int[][] arr) {
		ramp = new boolean [N]; // 경사로 사용 확인 배열
		
		for(int i = 0 ; i < N-1 ; i++) { // 한줄 확인. (다음 배열까지 확인하기 때문에 N-1까지만)
			if(arr[x][i] != arr[x][i+1]) { // 좌우 배열의 차를 구한다.
				int dis = arr[x][i] - arr[x][i+1]; // 두 배열의 차
				if(dis*dis != 1) return;// 차가 1일때만 경사로가 가능하다.
				
				if(dis == 1) { //오른쪽 경사로
					for(int j = 1 ; j <= L ;j++) { // 다음 배열이 더 낮은곳에 있으므로 다음 배열 부터 경사로 설치 및 검사.
						if(i+j >= N || ramp[i+j] == true) return; // 경사로 설치후 길이가 N을 벗어나거나 사용한 길일경우.
						if(arr[x][i] -1 == arr[x][i+j])ramp[i+j] = true; // 경사로를 이을 수 있을경우 
						else return;
					}
				}else { // 왼쪽 경사로 dis = -1
					for(int j = 0 ; j < L ;j++) { // 현재배열이 더 낮으므로 여기에서 부터 경사로 설치 및 검사.
						if(i - j < 0 || ramp[i-j] == true) return; // 경사로 설치후 길이가 N을 벗어나거나 사용한 길일경우.
						if(arr[x][i] == arr[x][i-j]) ramp[i-j] = true; // 경사로를 이을 수 있을경우.
						else return;
					}
				}	
			}
		}
		res++; // 체크를 한번 돌면 길이 생긴것이므로 ++
	}
}
