package Test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class MelonField_BOJ2477 {
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("res/Melon_Field_input_txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int K =Integer.parseInt(br.readLine());
		StringTokenizer st;
		int[] arr = new int[6];
		for(int i = 0 ; i < arr.length ; i++) {
			st =  new StringTokenizer(br.readLine()," ");
				Integer.parseInt(st.nextToken());
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int W = 0 ; int Widx = 10;
		int H = 0 ; int Hidx = 10;
		for(int i = 0 ; i < arr.length ; i++) {
			if(i%2 == 0 ) {
				if(H < arr[i]) {
					H = arr[i];
					Hidx = i ;
				}
			}else {
				if(W < arr[i]) {
					W = arr[i];
					Widx = i ;
				}
			}
		}
		int w =arr[(Hidx + 3)%6];
		int h =arr[(Widx + 3)%6];
		System.out.println((H*W - h*w)*K);
		br.close();
	}
}
