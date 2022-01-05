import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Croatia_BOJ2941 {
	public static int res;
	public static void main(String[] args)throws Exception {
	//	System.setIn(new FileInputStream("res/Croatia_input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		res = 0;
		String str = br.readLine(); // 문장을 읽음
		
		int len = str.length();
		
		for(int i = 0 ; i <len; i++) {
			
			char c = str.charAt(i); // i 번째 문자를 char 형으로 받음.
			
			if(c == 'c' && i < len -1) { 
				if(str.charAt(i+1) == '=' || str.charAt(i+1) == '-' ) {  // c 경우
					i++;					// 2글자 짜리이므로 i++ 해서 다다음 자리부터 읽음
				}
			}else if(c == 'd'  && i < len -1) {
				if(str.charAt(i+1) == '-' ) {		//d-
					i++;
				}else if(str.charAt(i+1) == 'z' && i < len - 2) {
					if(str.charAt(i+2) == '=') {
						i+=2;						// dz= 은 3글자 짜리 이므로 +2
					}
				}
			}else if((c == 'l' || c == 'n') && i < len -1) {	// lj nj
				if(str.charAt(i + 1) == 'j') {
					i++;
				}
			}
			else if((c == 's' || c == 'z') && i < len -1) {		//s= z=
				if(str.charAt(i + 1) == '=' ) {
					i++;
		  		}
		    }
			res++;
		}
		System.out.println(res);
		br.close();
	}
}
