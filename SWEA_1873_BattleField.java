import java.io.*;
import java.util.*;
public class BattleFiled {

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("res/배틀필드_input.txt"));
		Scanner sc = new Scanner(System.in);
		
		int tc = sc.nextInt();
		
		for(int t = 1 ; t <= tc ; t++) {
			int H = sc.nextInt();
			int W = sc.nextInt();
			char[][] arr = new char[H][W]; 
		
			int x = 0; 
			int y = 0;	// 전차 좌표 넣을 x ,y 
			int dir = 0; // 전차 방향
			for(int i = 0 ; i < H ; i++) {
				String str = sc.next();
				for(int j = 0 ; j < W ; j++) {
					arr[i][j] = str.charAt(j);
					
					if(arr[i][j] == '<' || arr[i][j] == '>' || arr[i][j] == '^'|| arr[i][j] == 'v') {
						x = i;
						y = j; 
					}
					switch(arr[i][j]) {
					case '^':
						dir = 1;
						break;
					case 'v':
						dir = 2;
						break;
					case '<':
						dir = 3;
						break;
					case '>' :
						dir = 4;
						break;
				}
			}
		}		
		int N = sc.nextInt();
		String in = sc.next();
		
		for(int i = 0 ; i < N ; i++) {
			String a = in.substring(i,i+1);
			int idx = 0 ;
			switch(a) {
			case "U":
				dir = 1;
				arr[x][y] = '^';
				if(x>0 && arr[x-1][y] == '.') {
					arr[x-1][y] = arr[x][y];
					arr[x][y] = '.';
					x -= 1;
				}break;
			case "D":
				dir = 2;
				arr[x][y] = 'v';
				if(x<H-1 && arr[x+1][y] == '.') {
					arr[x+1][y] = arr[x][y];
					arr[x][y] = '.';
					x += 1;
				}break;
			case "L":
				dir = 3;
				arr[x][y] = '<';
				if(y>0 && arr[x][y-1] == '.') {
					arr[x][y-1] = arr[x][y];
					arr[x][y] = '.';
					y -= 1;
				}break;
			case "R":
				dir = 4;
				arr[x][y] = '>';
				if(y<W-1 && arr[x][y+1] == '.') {
					arr[x][y+1] = arr[x][y];
					arr[x][y] = '.';
					y += 1;
				}break;
			case "S":
				switch(dir) {
				case 1:
					idx = x;
					while(true) {
						if(idx - 1 < 0 || arr[idx-1][y] == '#')break;
						if(arr[idx-1][y] == '*') {
							arr[idx-1][y] = '.';
							break;
						}
						idx--; // 포탄 날아가욧
					}
					break;
					
				case 2:
					idx = x;
					while(true) {
						if(idx + 1 >= H || arr[idx+1][y] == '#')break;
						if(arr[idx+1][y] == '*') {
							arr[idx+1][y] = '.';
							break;
						}
						idx++; // 포탄 날아가욧
					}
					break;
				case 3:
					idx = y;
					while(true) {
						if(idx-1 < 0 ||  arr[x][idx-1] == '#')break;
						if(arr[x][idx-1] == '*') {
							arr[x][idx-1] = '.';
							break;
						}
						idx--; // 포탄 날아가욧
					}
					break;
				case 4:
					idx = y;
					while(true) {
						if(idx + 1 >= W || arr[x][idx+1] == '#')break;
						if(arr[x][idx+1] == '*') {
							arr[x][idx+1] = '.';
							break;
							}
							idx++; // 포탄 날아가욧
						}
						break;
					}
					break;
				}
			}
			
			System.out.print("#"+t+" ");
			for(int i = 0 ; i < H ; i++) {
				for(int j = 0 ; j < W ; j++) {
					System.out.print(arr[i][j]);
				}
				System.out.println();
			}
		}
	}
}
