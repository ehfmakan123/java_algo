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
		char key;
		int x = 1 ; int y = 1;
		String str = br.readLine();
		for(int i = 0 ; i < str.length() ; i++) {
			key = str.charAt(i);
			if(key == 'R') {
				if(y < 5) {
					y++;
				}
			}else if( key == 'L') {
				if(y >1) {
					y--;
				}
			}else if( key == 'U') {
				if(x > 1) {
					x--;
				}
			}else if( key == 'D') {
				if( x < 5) {
					x++;
				}
			}else {
				continue;
			}
		}
		System.out.println(x+" "+y);
	}

}
