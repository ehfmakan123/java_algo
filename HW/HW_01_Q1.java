import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int r = Integer.parseInt(br.readLine());
		double s = (Math.PI)*Math.pow(r, 2);
		s = (Math.round(s*1000))/1000.0;
		System.out.println("반지름이 "+r+"cm인 원의 넓이는 "+s+"Cm^2 입니다.");
	
	}

}


//	double 형의 소숫점 출력 방법 숙지하기..!

// Q1. 반지름 R이 주어졋을때 너비를 출력하는 알고리즘
// 소숫점 셋째자리 까지 출력.	
