package Test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class UpDownRigthLeft {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("res/UpDownRigthLeft.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		char key; // 비교값
		int x = 1 ; int y = 1;
		String str = br.readLine(); // 문자열 입력
		for(int i = 0 ; i < str.length() ; i++) { // 문자를 하나씩 확인
			key = str.charAt(i);
			if(key == 'R') { // R 이면 오른쪽 한칸
				if(y < 5) { // 범위 초과 아니면
					y++;
				}
			}else if( key == 'L') { // L 이면 왼쪽 한칸
				if(y >1) { // 1밑이면 범위 초과
					y--;
				}
			}else if( key == 'U') { // 위로 한칸
				if(x > 1) {
					x--;
				}
			}else if( key == 'D') { // 아래로 한칸
				if( x < 5) {
					x++;
				}
			}else { // 공백 문자 무시
				continue;
			}
		}
		System.out.println(x+" "+y);
	}

}
