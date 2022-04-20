package Test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Scale_BOj2920 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("res/Scale_input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int [8];
		int key = 0;
		
		for(int i = 0 ; i < 8 ;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		for(int i = 0 ; i< 7 ; i++) {
			if(arr[0]  == 1 && arr[i] == arr[i+1]-1) {
				key++;
			}else if(arr[0] == 8 && arr[i] == arr[i+1]+1) {
				key--;
			}else {
				System.out.println("mixed");
				break;
			}
		
		}
		if(key == 7) {
			System.out.println("ascending");
		}else if(key == -7) {
			System.out.println("descending");
		}
	}
}
