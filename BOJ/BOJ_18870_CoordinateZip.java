package Test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class CoordinateZip_BOJ18870 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("res/CoordinateZip_input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 입력 숫자 갯수
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] arr = new int[N]; // 저장할 배열
		
		HashMap<Integer, Integer> rank = new HashMap<Integer, Integer>(); // 해시맵을 사용 key , value
		
		for(int i = 0 ; i < N ;i++) { // 배열에 저장
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int[] temp = arr.clone();
		
		Arrays.sort(temp); // 정렬
		
		int cnt = 0 ; // 각 원소의 순위
		
		for(int value : temp) { // 정렬한 배열을 순회 
			if(!rank.containsKey(value)) { // 값이 중복이 아니면 
				rank.put(value, cnt); // 해시맵에 값과 랭크를 저장
				cnt++; // 랭크를 저장하면 당연히 다음놈은 랭크가 낮아짐(1위 ->2위)
				}
		}
		StringBuilder sb = new StringBuilder();
		for(int index : arr) {// 원본 배열을 순회
			int res = rank.get(index); // 해시맵에서 원본 배열을 key 로 가진 value를 출력
			sb.append(res+" ");
		}
		br.close();
		System.out.println(sb.toString());
	}

}

//해시맵 사용법 숙지하기!!
