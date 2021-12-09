
import java.io.*;
import java.util.*;

public class IronStick {
	public static void main(String[] args) throws Exception {
	System.setIn(new FileInputStream("res/Iron_Stick_input.txt"));
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringBuilder sb = new StringBuilder();
	
	int Tc = Integer.parseInt(br.readLine());
		
		for(int t = 1; t <= Tc ; t++) {
			sb.append("#").append(t).append(" ");
			int cnt = 0 ; //자르고있는 막대의 수
			int result = 0; // 잘려나간 막대
			
			String str = br.readLine();
			
			for(int i = 0 ; i < str.length()  ; i++) {
				if(str.charAt(i) == '(' && str.charAt(i+1) == ')') { // 레이저 포인트
					result += cnt; // 막대가 레이저 만나면 현재 막대수만큼 잘려나감
					i++;
				}else if(str.charAt(i) == '(' ) {
					cnt++;
				}else { // 막대가 닫히면서 기존막대 --
					cnt--; // 막대 끝
					result++; // 막대끝나면서 1개 잘려나왓음
				}
				
			}
			sb.append((result)+"\n");
			
		}
		System.out.print(sb);
		br.close();
	}
}
