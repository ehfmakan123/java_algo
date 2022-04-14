package Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TaxiGeometry_BOJ3053 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double N =Double.parseDouble(br.readLine());
		double res = N*N*Math.PI;
		double res2 = 2*N*N;
		System.out.println(String.format("%6f", res));
		System.out.println(String.format("%6f", res2));
	}

}

// int N 으로 받으면 틀림
// 아마 int 로 받으면 pi 곱하는 과정에서 형변환 중에 숫자가 조금씩 바뀌는거 같음
// 입력 자료형을 전부 double 로 바꾸어 해결
