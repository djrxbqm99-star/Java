/**
 * 날짜 : 2026.04.29
 * 이름 : 김민찬
 * 내용 : Java 클래스 기본 실습
 */


package sub1;

public class ClassTest {
	public static void main(String[] args) {
		
		// 객체 생성
		Car sonata  = new Car();
		
		// 객체 초기화
		sonata.brand = "소나타";
		sonata.color = "흰색";
		sonata.speed = 0;
		
		// 객체 활용
		sonata.speedUp(80);
		sonata.speedDown(20);
		sonata.show();
		
		
		
		
		
		Car avante = new Car();
		avante.brand = "아반데";
		avante.color = "검정";
		avante.speed = 0;
		
		avante.speedUp(60);
		avante.speedDown(10);
		avante.show();
		
		
		// Account 객체 생성 및 초기화
		Account kb = new Account();
		kb.bank = "국민은행";
		kb.id = "110-11-1234";
		kb.name = "김유신";
		kb.balance = 1000;
		
		kb.deposit(20000);
		kb.deposit(5000);
		kb.show();
		
		
		
		Account we = new Account();
		we.bank = "우리은행";
		we.id = "110-22-1001";
		we.name = "김춘추";
		we.balance = 1000;
		
		we.deposit(20000);
		we.withdraw(6000);
		we.show();
		
		
		// Book 객체 생성 및 초기화
		Book a = new Book();
		a.title = "이것이 자바다";
		a.author = "신용권";
		a.copies = 3;
		
		boolean result = a.borrowBook();
		if(result) {
			System.out.println("대출 성공!");
			a.show();
		}else {
			System.out.println("대출 실패!");
			a.returnBook();
			a.show();
		}
		
		
		Member me = new Member();
		
		me.name = "홍길동";
		me.age = 20;
		me.isActive = false;
		
		me.activate();
		
		
		
		boolean isAdult = me.isAdult();
		if(isAdult) {
			me.show();
			System.out.println("성인 입니다");
		}else {
			me.show();
			System.out.println("미성년자 입니다.");
		}
		
		
		
		
		
		
		
		
	}
}

