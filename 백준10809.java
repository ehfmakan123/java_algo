import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		sc.nextLine();
		String st = sc.nextLine();
		int sum = 0;
		
		for(int i = 0 ; i < x ; i++) {
			sum += st.charAt(i)-48;
		}
		System.out.println(sum);
	}
}
