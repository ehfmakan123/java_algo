import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        String[] str = new String[numbers.length]; // 받은 배열을 String으로 다시 저장할거임.
        
        for(int i = 0 ; i < str.length ;i++) {
        	str[i] = String.valueOf(numbers[i]); // 숫자형 입력을 문자형으로 변환 ex = 909 -> "909"
        }
        
        Arrays.sort(str , new Comparator<String>() {  // 정렬을 할건디 compare 를 바꿀거임.

			@Override
			public int compare(String o1, String o2) { // String 비교 방법을 재정의
				// TODO Auto-generated method stub
				return (o2+o1).compareTo(o1+o2); // (앞뒤로 바꿔서 저장한뒤 큰거를 출력) -> (39 vs 93 -> 93)
			}
        	
		});
        
        for(String x : str) { // str 배열에서 String x 를 뽑아서 ans 에 더해주기.
        	answer += x;
        }
        
        if(str[0].equals("0")) answer = "0"; // 만약 입력이 000이 나오면 어떻게 돌려도 0이니까 ans 를 0으로 초기화.
        
        return answer;
    }
}
