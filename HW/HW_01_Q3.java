import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int height = Integer.parseInt(st.nextToken());
		int weight = Integer.parseInt(st.nextToken());
		int res = weight +  100 - height;
		if(res > 0) {
			System.out.println("비만수치는 "+res+"입니다.");
			System.out.print("당신은 비만이군요");
		}
	}

}


// Q3. 몸무게 + 100 - 키 --> 비만수치
// 키와 몸무게를 자연수로받아 첫 째 줄에 비만수치 출력, 비만수치가 0보다 크면 
// 다음줄에 비만입니다 메시지 출력.
// 나는 비만이다.... ㅠ
