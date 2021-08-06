import java.io.*;
import java.lang.reflect.Array;
import java.util.*;


public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		//System.setIn(new FileInputStream("res/input.txt"));
		Scanner sc = new Scanner(System.in);
		String[][] board = {{"q","w","e","r","t","y","u","i","o","p"},{"a","s","d","f","g","h","j","k","l"},{"z","x","c","v","b","n","m"}};
		String str1[] = {"q","w","e","r","t","a","s","d","f","g","z","x","c","v"};//14
		String str2[] = {"y","u","i","o","p","h","j","k","l","b","n","m","*","*"};//12
		
		int ax = 0 ; 
		int ay = 0 ; // 초기 왼손
		
		int bx = 0 ; // 초기 오른손
		int by = 0 ;
		
		int sum = 0;
		String a = sc.next();
		String b = sc.next();
		sc.nextLine();
		
		String key = sc.next();
		
		for(int i = 0 ;  i < 3 ; i++) {
			for(int  j = 0 ; j < board[i].length ; j++) {
				if(a.equals(board[i][j])) {
					ax = i;
					ay = j;
				}
			}
		} // 왼손 초기 좌표 계산
		
		for(int i = 0 ;  i < 3 ; i++) {
			for(int  j = 0 ; j < board[i].length ; j++) {
				if(b.equals(board[i][j])) {
					bx = i;
					by = j;
				}
			}
		} // 오른손 초기 좌표 계산 
		int lidx = ax;
		int lidy = ay;
		
		int ridx = bx;
		int ridy = by;
		
		
		for(int i = 0 ; i < key.length() ; i++) {
			
			String x = key.substring(i,i+1);
			
			for(int j = 0 ; j < 14 ; j++) {
				if(x.equals(str1[j])) { //왼손 배열확인
					
					for(int k = 0 ;  k < 3 ; k++) {
						for(int  l = 0 ; l < board[k].length ; l++) {
							if(x.equals(board[k][l])) {
								sum += Math.abs(lidx - k) + Math.abs(lidy - l);
								lidx = k;
								lidy = l;
								
							}
						}
					}
				}else if(x.equals(str2[j])){ // 오른손
					for(int k = 0 ;  k < 3 ; k++) {
						for(int  l = 0 ; l < board[k].length ; l++) {
							if(x.equals(board[k][l])) {
								sum += Math.abs(ridx - k) + Math.abs(ridy - l);
								ridx = k;
								ridy = l;
							}
						}
					}
				}
			}
		}
		sc.close();
		System.out.println(sum + key.length());
	}
}
