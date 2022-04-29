import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] one = {1,2,3,4,5};
        int[] two = {2,1,2,3,2,4,2,5};
        int[] three = {3,3,1,1,2,2,4,4,5,5}; // 찍는놈들 배열
        
        int[] score = new int[3]; // 명수가 정해져있어
        
        for(int i = 0 ; i < answers.length ; i++) {
        	if(answers[i] == one[i%one.length]) score[0] ++;
        	if(answers[i] == two[i%two.length]) score[1] ++;
        	if(answers[i] == three[i%three.length]) score[2] ++;
        } // 각각 answer 를 순회하면서 채점
        int max = Math.max(Math.max(score[0], score[1]) , score[2]); // 최대값 구하기(최고점)
        Queue<Integer> q = new LinkedList<Integer>(); // 인덱스를 저장할 큐
      
        for(int i = 0 ; i < score.length ; i++) { // 동점일 경우를 생각해서 큐에 저장.
        	if(max == score[i]) {
        		q.offer(i+1); // 인덱스+1을 저장 (1번 2번 3번 식으로 출력해야함)
        	}
        }
        
        int[] answer = new int[q.size()]; // 정답 배열의 크기 지정.
        
        for(int i = 0 ; i < answer.length ; i++) {
        	answer[i] = q.poll(); // 정답 배열에 1등인 사람(들) 넣어주기
        }
        
        return answer;
    }
}
