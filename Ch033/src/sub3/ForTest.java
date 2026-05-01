/**
 * 날짜 : 2026.04.27
 * 이름 : 김민찬
 * 내용 : Java 반복문 for 실습 
 */




package sub3;

public class ForTest {

	public static void main(String[] args) {
	
		for(int i =0; i<10; i++) {
			System.out.println("i : " + i);
		}
		
		int sum = 0;
		
		for(int k = 1; k<=10; k++) {
			sum += k;
		}
		
		System.out.println("1부터 10까지 합 : " + sum);
		
		
		int tot = 0;
		
		for(int l = 0; l<=10; l++) {
			if(l % 2 == 0) {
				tot += l;
			}
			
		}
		System.out.println("1부터 10까지 짝수 합 : " + tot);
		
		
		for(int a = 1; a<=3; a++) {
				System.out.println("a : " + a);
			for(int b = 1; b<=5; b++) {
				System.out.println("b : " + b);
				
				} 
			
			}
		
		
		for(int x =2; x<=9; x++) {
			for(int y = 1; y<=9; y++) {
				int z = x * y;
				System.out.printf("%d X %d = %d\n",x,y,z);
			}
		}
	
		// 별삼각형
		for(int start = 10; start >= 1; start--) {
			
			for(int end =1; end <= start; end++) {
				System.out.print("★");
				
			}
			System.out.println("\n");
		}
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
	}
}