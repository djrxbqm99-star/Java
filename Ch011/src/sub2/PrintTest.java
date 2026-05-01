/**
 * 날짜 : 2026.04.27
 * 이름 : 김민찬
 * 내용 : 다양한 출력 실습 
 */


package sub2;

public class PrintTest {
	public static void main(String[] args) {
		
		// println : 라인 출력문
		System.out.println("Hello Java!"); //println(print line) : 문자열 출력 후 라인(다음 줄)  이동
		System.out.println("Welcome Java!");
		
		// print : 기본 출력문, 라인(줄바꿈, 개행) 이동 없음
		System.out.print("Greeting Java");
		System.out.print("Hey Java"); 
		System.out.print("\n");  // \n : 이스케이프 문ㅁ자, new line
		
		// printf : 포맷 출력문
		System.out.printf("number : %d\n", 27);               // %d " decimal, 숫자 출력
		System.out.printf("My name is : %s", "김민찬");		// %s : string, 문자열 출력
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
