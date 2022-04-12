class Solution {
    public long solution(long n) {
        long answer = 0;
		long ans = (int) Math.sqrt(n);
		long key = ans * ans;
		if( key != (n)) {
			return -1;
		}else {
			return ((ans+1)*(ans+1));
		}
    }
}
// 프로그래머스 정수 제곱근 구하기
