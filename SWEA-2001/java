
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.*;


public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		
		System.setIn(new FileInputStream("res/파리잡기_input.txt"));
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		
		for(int t = 1;  t <= tc ; t++ ) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int x = (N-M+1)*(N-M+1);
			
			int[][] arr = new int[N][N];
			int[] arr2 = new int[x];
			int count = 0;
			int result = 0;
			
			for(int i = 0 ; i < N ; i++) {
				for(int j = 0 ; j <N ; j++) {
					arr[i][j]  =sc.nextInt();
				}
			}
			for(int i = 0 ; i < N - M +1 ; i++) {
				for(int j = 0 ; j < N -M + 1 ; j++) {
					 int sum = 0;
					 for(int k = 0 ; k < M ; k++) {
						 for(int l = 0 ; l < M ; l++) {
							 sum += arr[i+k][j+l];
						 }
					 }
					 arr2[count++] = sum;
				}
			}
			Arrays.sort(arr2);
			result = arr2[x-1];
			System.out.println("#"+t+" "+result);
		}
	}
}
