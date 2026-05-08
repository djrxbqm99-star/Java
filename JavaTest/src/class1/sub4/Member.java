package class1.sub4;

public class Member {
	
	private String name;
	private String memberId;
	private Book borrowedBook;
	
	Member(String name, String memberId){
		this.name 
		= name;
		this.memberId = memberId;
		this.borrowedBook = null;
	}
	public void borrowBook(Book book) {
		this.borrowedBook = book;
		book.borrowBook();
	}
	
	public void returnBook(Book book) {
		this.borrowedBook = book;
		book.returnBook();
		this.borrowedBook = null;
	}
	
	public void getMemberInfo() {
		System.out.println("회원명 : " + name);
		System.out.println("아이디 : " + memberId);
		if(borrowedBook == null) {
			System.out.println("대출한 도서 : 없음");
		}else {
			System.out.println("대출한도서 : " +borrowedBook.getTitle() );
		}
		
		
		
		
	}
	
	
	

}
