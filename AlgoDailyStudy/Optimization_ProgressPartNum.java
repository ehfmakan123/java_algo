package Optimization;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ProgressNum {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] arr =new int[N];
		
		st =new StringTokenizer(br.readLine());
		
		for(int i = 0 ; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int res = 0  , sum = 0 , lt = 0 ; // 왼쪽끝 lt , 오른쪽 끝 rt  / arr[lt] ~ arr[rt] 까지 합
		for(int rt = 0 ; rt < N ; rt++) { 
			sum +=arr[rt]; // 처음 arr[rt] 추가할때 + 해준다
			if(sum == M ) { 
				res++;
			}while(sum >= M) { // arr[rt] 추가한값이 목표보다 크거나 같으면
				sum -= arr[lt]; // 왼쪽 끝 arr[lt]를 삭제
				lt++;			// 인덱스가 다음 왼쪽끝(lt+1)으로 이동
				if(sum == M) { // 목표값일 경우 res++
					res++;
				}
			}
		}
		System.out.println(res);
		
	}
}
