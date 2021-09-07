package Test;
class Solution {
  public int solution(String dartResult) {
		int[] score = new int[3]; // 3회 다트 던짐.
		int answer = 0; // 출력값.
		int idx = 0; // 특정 명령 실행을 위한 확인 index
 
		for (int i = 0; i < dartResult.length(); i++) {
			char c = dartResult.charAt(i); // c에 값을 하나씩 잘라서 판별.
			if (c >= '0' && c <= '9') { // c가 숫자인 경우(0~9)
				if (c == '1') { //c가 1인경우 뒤에 0이있나 확인하여 10인지를 판별.
					
					if (dartResult.charAt(i + 1) == '0') { // 뒤에 0이 올 경우 10을 저장.
						score[idx] = 10;
						i++;
						idx++;
						continue;
					}
					
					score[idx] = 1;
					idx++;
					
				} else {
					score[idx] = c - '0'; // 10이 아닌 숫자의 경우 해당하는 값을 위치에 저장.
					idx++;
				}
			} else if (c == 'S' || c == 'D' || c == 'T') { // 문자열의 경우를 처리
				if (c == 'D') { //  D의 경우 제곱
					score[idx - 1] *= score[idx - 1];
				} else if (c == 'T') { // T의 경우 3제곱
					score[idx - 1] *= score[idx - 1] * score[idx - 1]; 
				}//현재 값이 문자일 경우 이전 idx를 참조하여 숫자를 확인.
			} else if (c == '*' || c == '#') { // * , #과 같은 문자의 경우
				if (c == '*') {
					if (idx == 1) { // 처음에 *이 나온경우.
						score[0] *= 2;
						continue;
					} 
					score[idx - 1] *= 2;  // 그 외의 경우 해당 점수와 바로전의 점수를 2배
					score[idx - 2] *= 2;
				} else if (c == '#') { // #이 나온경우 해당 점수를 *-1 하여 저장.
					score[idx - 1] *= -1;
				}
			}
		}
        answer = score[0] + score[1] + score[2]; // score 1,2,3 의 점수를 합하여 저장
        return answer;
  }
}
