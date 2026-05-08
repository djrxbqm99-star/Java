package Test01;

public class test08 {

	public static void main(String[] args) {
		
		int n = 5;
		for(int i = 0; i<n; i++) {
		
			for(int j=n-1; j>i; j--) { // 처음 j가 4부터 시작
				System.out.print(" ");
			}
		
		for(int j =0; j<2 * i + 1; j++) {
			System.out.print("☆");
		}
		System.out.print("\n");
	}
}
}