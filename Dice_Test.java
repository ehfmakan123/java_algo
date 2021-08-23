package Test;

import java.util.Arrays;

public class DiceTest {

	public static int[] arr = new int[] {1,2,3,4,5,6};
	public static int N = 3;
	public static int[] num = new int[3];
	public static int count = 0 ;
	public static boolean[] chk = new boolean[100];
	
	public static void dice(int cnt){
		if(cnt == N) {
			System.out.println(Arrays.toString(num));
			count++;
			return;
		}
		for(int i = 0 ; i < arr.length; i++) {
			num[cnt] = arr[i];
			dice(cnt+1);
		}
	}
	public static void dice2(int cnt){
		if(cnt == N) {
			System.out.println(Arrays.toString(num));
			count++;
			return;
		}
		for(int i = 0 ; i < arr.length; i++) {
			if(chk[i] == true) continue;
			num[cnt] = arr[i];
			chk[i] = true;
			dice2(cnt+1);
			chk[i] = false;
		}
	}
	
	public static void main(String[] args) {
		dice2(0);
		System.out.println(count);
	}

}
