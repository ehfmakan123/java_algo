import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
static int X , Y;
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			X = Integer.parseInt(st.nextToken());
			Y = Integer.parseInt(st.nextToken());
			if( X == 0 && Y ==0) {
				break;
			}else if( X % Y == 0 ){
				System.out.println("multiple");
			}else if(Y % X == 0) {
				System.out.println("factor");
			}else {
				System.out.println("neither");
			}
		}
	}
}
