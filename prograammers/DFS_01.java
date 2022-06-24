import java.util.*;

class Solution {
    int answer = 0; // 전역
    public int solution(int[] numbers, int target) {
        DFS(numbers, target , 0 , 0);
        return answer;
    }
    public void DFS(int[] numbers , int target, int sum , int depth){
        if(depth ==  numbers.length ){
            if(target == sum)   answer++;
        }else{
            DFS(numbers ,  target  ,  sum + numbers[depth] ,  depth+1);
            DFS(numbers ,  target  ,  sum - numbers[depth] ,  depth+1);
        }
    }
}

//  간단한 DFS 문제인데... 백준이나 SWEA 방식이랑 프로그래머스 방식이 달라서
//  실력이 부족한탓에 어떻게 해야할지 애를 많이 먹었음..
//  프로그래머스에서 코딩하는 습관을 좀 키워야 할 것 같다..!
//  문제 자체는 + , - 분기를 나누어서 DFS 만 해주면 되는 쉬운문제
//  프로그래머스 테스트는 내장함수 쓰기 어렵기때문에 꼭 필요한건 외워줘야한다... ㅠ
