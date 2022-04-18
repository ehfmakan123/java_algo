package Test;

public class Test {
	private static int cnt = 0 ;
	private static int comb(int n ,int r) {
		// 자신을 포함해서 r개를 만드는 경우의 수 + 자신을 포함 X r 개 경우의 수.
		if(r == 0 || n == r ) return 1; // 뽑을게 0  or  n == r
		return comb(n-1 ,r-1) + comb(n-1 , r);
	}
	public static void main(String[] args) {
		
		hanoi(3,1,2,3);
		System.out.println(cnt);
		cnt = 0;
		hanoi(4,1,2,3);
		System.out.println(cnt);
	}
	private static void hanoi(int n , int start , int temp, int dest) {
		if(n==0)return;
		// 자신의위쪽의 n-1개 원판 들어내기 : 임시기둥으로 옮겨야해
		hanoi(n-1 , start ,dest , temp);
		// 자신의 원판 옮기기 : 목적기둥
		System.out.println(n+":"+start + ">" +dest);
		// 들어낸 임시기둥의 n-1개 원판 자신위에 쌓기 : 목적기둥으로 옮기기..?
		hanoi(n-1,temp,start , dest);
		cnt++;
	}

}
