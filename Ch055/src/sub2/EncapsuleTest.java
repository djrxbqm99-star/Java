package sub2;
/**
 * 
 * 날짜 : 2026/04.29
 * 이름 : 김민찬
 * 내용 : Java 캡슐화 실습 
 * 
 * 
 */

public class EncapsuleTest {

	public static void main(String[] args) {
		
		// 객체 생성
		Car sonata = new Car("소나타", "흰색",0);
		Car avante = new Car();
		

		// 객체 초기화 -> 캡슐화된 속성을 생성자로 초기화
		// sonata.brand = "소나타";
		
		// sonata.color = "흰색";
		// sonata.speed = 0;
		
		
		//속성값 수정
		// sonata.color = "은색";
		sonata.setColor("은색"); // 안전하게 세터로 수정
		sonata.show();
		
		
		//세터 초기화
		avante.setBrand("아반떼");
		avante.setColor("검정");
		avante.setSpeed(0);
		
		
		
		
		System.out.println("차량명 : " + avante.getBrand());
		System.out.println("차량색 : " + avante.getColor());
		System.out.println("차량명 : " + avante.getSpeed());
		// Account 객체 생성(kb, we)
		
		Account kb = new Account("국민은행","11-22","김수로",1000);
		
		kb.setBank("아아은행");
		kb.setId("11");
		
		System.out.println("은행명 : " + kb.getBank());
		System.out.println("계좌번호 : " + kb.getId());
		
		
		
		
		
		
		// Member
		
		Member as = new Member("홍길동",20,true);
		as.show();
		
		
		
		
		
		
		
		
		// book
		
		Book qp = new Book("자바다","김시언",3);
		
		qp.show();
		
		
		// Movie 객체 생성 및 생성자 초기화
		Movie titanic = new Movie("타이타닉","제임스카메론",10.0,4);
		titanic.showDetails();
		
		
		
		
		
		
	}
}
