package sub3;
/**
 * 날짜 : 2026.05.11
 * 이름 : 김민찬
 * 내용 : Java 
 */
public class StringBuilderTest {

	public static void main(String[] args) {
		
		// String 불변성(immutable)으로 인한 메모리 낭비
		String str = "Java";
		System.out.println("str : " + str.hashCode());
		
		str += "Programming";
		System.out.println("str : " + str.hashCode());
		
		// StringBulider로 메모리 절약
		StringBuilder sb = new StringBuilder("Java");
		System.out.println("sb : " + sb.hashCode());
		
		sb.append("Programming");
		System.out.println("sb : " + sb.hashCode());
	}
}
