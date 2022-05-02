	package Test;
	
	import java.io.BufferedReader;
	import java.io.InputStreamReader;
	import java.util.StringTokenizer;
	
	public class NtoM4 {
	static int N, M;
	static int[] arr;
	static StringBuilder sb = new StringBuilder();
		 
		public static void main(String[] args) throws Exception {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			arr = new int[M];
			
			comb(0,1);
			System.out.println(sb.toString());
			br.close();
		 
		}
	
		private static void comb(int D, int s) {
			// TODO Auto-generated method stub
			if(D == M) {
				for(int x : arr) {
					sb.append(x+" ");
				}sb.append("\n");
			}else {
				for(int i = s ; i <= N ;i++) {
					arr[D] = i;
					comb(D+1 , i);
				}
			}
		}
	}
