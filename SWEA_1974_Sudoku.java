//SWEA_1974
import java.io.*;
import java.util.*;
public class Sudoku {

	public static boolean check1(int[][] a) {
		HashSet<Integer> set =new HashSet<Integer>();
		for(int i = 0 ; i <9 ; i++) {
			for(int j =0; j < 9 ; j++) {
				set.add(a[i][j]);
			}
			if(set.size() != 9) return false;
			set.clear();
		}
		return true;
	}
	public static boolean check2(int[][] a) {
		HashSet<Integer> set =new HashSet<Integer>();
		for(int i = 0 ; i <9 ; i++) {
			for(int j =0; j < 9 ; j++) {
				set.add(a[j][i]);
			}
			if(set.size() != 9) return false;
			set.clear();
		}
		return true;
	}
	
	public static boolean check3(int[][] a) {
		HashSet<Integer> set =new HashSet<Integer>();
		for(int i = 0 ; i < 9 ; i+= 3) {
			for(int  j = 0 ; j< 3 ; j++) {
				set.add(a[i][j]);
				set.add(a[i+1][j]);
				set.add(a[i+2][j]);
				
			}
			if(set.size() != 9) return false;
			set.clear();
		}
		return true;
		
	}

	public static void main(String[] args) throws Exception{
		//System.setIn(new FileInputStream("res/Sudoku_input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		int[][] arr = new int [9][9]; // 9*9 배열 생성
		int [] tmp = new int [9]; // check 배열 만들거임. 쓰고 나서 항상 초기화 해야함.
		int res = 0 ; // 계산 후 경우의 수를 통과하면 1
		for(int tc = 1; tc <= T ; tc++ ) { // 테스트 케이스 만큼 돌림!!
			sb.append("#").append(tc).append(" ");

			for(int i = 0 ; i < 9 ; i ++) { // 배열을 입력 받아서 모두 넣음!!
				StringTokenizer st = new StringTokenizer(br.readLine()," ");
				for(int j = 0 ; j < 9 ; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			if((check1(arr)&&check2(arr)&&check3(arr))) {
				res = 1;
			}
			
			sb.append(res+"\n");
			res = 0;
		}	
		System.out.println(sb);
    br.close();
	}
}
