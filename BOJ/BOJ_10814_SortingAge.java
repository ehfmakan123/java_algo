package Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.StringTokenizer;

public class SortingAge_BOJ10814 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[][] str = new String[N][2] ;
		
		for (int i = 0 ; i< N ; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			str[i][0] =st.nextToken();
			str[i][1] = st.nextToken();
		}
		
		
//		Arrays.sort(str, new Comparator<String[]>() {
//
//			@Override
//			public int compare(String[] o1, String[] o2) {
//				// TODO Auto-generated method stub
//				return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
//			}
//		});
		
		
		Arrays.sort(str , (s1 ,s2)->{
				return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]);
		});
		
		for(int i = 0 ;i < N ; i++) {
			System.out.println(str[i][0]+" "+str[i][1]);
		}
	}
}
