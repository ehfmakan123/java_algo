package Test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Joekr_JO1205 {

	public static void main(String[] args) throws Exception{
		System.setIn(new FileInputStream("res/Joker_input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st ;
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		int joker = 0 ;
		st = new StringTokenizer(br.readLine()," ");
		for(int i = 0 ; i < N ; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			if(arr[i] == 0) joker++;
		}
		Arrays.sort(arr);
		if(joker==N) {
            System.out.println(joker);
        }else {
            int max=0;
            for (int i = joker; i < N; i++) {
                int jo=joker;
                int len=1;
                int val=arr[i];
                for (int j = i+1; j < N; j++) {
                    if(arr[j]==val) continue;
                    int diff=arr[j]-val;
                    if(diff<=jo+1) {
                        jo-=(diff-1);
                        len+=diff;
                        val=arr[j];
                    }else{
                        break;
                    }
                }
                max=Math.max(max,jo+len);
            }
            System.out.println(max);
        }
		br.close();
	}
}
