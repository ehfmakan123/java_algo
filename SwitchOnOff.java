// Q.
// 여러개의 전구를 원하는 상태로 바꾸려고 한다.
// 처음 전구 상태는 00000...00 이다 ( 1 = On / 0 = Off)
// 전구는 1~ N 번으로 표기한다.
// i번 전구의 스위치를 키면 i * n에 해당하는 모든 전구의 상태가 변한다.
// Ex) 00100100101 상태의 전구에서 3번 스위치를 내리면 3의 배수인 전구의 상태가 모두 변한다
// 00100010101 -> 00000110001 ( 3번 , 6번 , 9번 전구의 상태가 변경.)

// 첫줄에 테스트 케이스의 수 T를 입력받는다 ( 1~100)
// 각 테스트 케이스의 첫줄에 입력되는 전구의 수 N을 받는다 (1~10000)
// 다음줄에 목표로 하는 전구의 상태를 입력받는다 
// 출력은 #tc res(최소 변경 횟수)로 나타낸다.

public class Main {
	public static void main(String[] args)throws Exception {
		System.setIn(new FileInputStream("res/input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		for(int tc = 1 ; tc <= T ; tc++) {
			int res = 0;
			sb.append("#").append(tc).append(" ");
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int[] arr = new int[N];	// 입력배열
			String str[] = br.readLine().split(" ");
			for(int i = 0 ; i < N ; i++) { // 배열을 전부 입력배열에 넣었음.
				arr[i] = str[i].charAt(0)-'0';
			}
			for(int i = 0 ; i <N ; i++) {
				if(arr[i] == 1 && i == 0 ) { // 처음 들어온 수가 1일때
				//	System.out.println(Arrays.toString(arr));
					for(int j = 0 ; j < N ; j++) {
						arr[j] = arr[j]*(-1)+1;
					}
				//	System.out.println(Arrays.toString(arr));
					res++;
				}else if(arr[i] == 1) { // 그 다음부터 1일때
			//		System.out.println(Arrays.toString(arr));
					for(int j = 1 ; j*(i+1) <=N ; j++) {
						arr[(i+1)*j-1] = arr[(i+1)*j-1]*(-1) +1;
					}
			//		System.out.println(Arrays.toString(arr));
					res++;
				}
			}
			sb.append(res).append("\n");
		}
		System.out.println(sb.toString());
		br.close();
	}
}
