package sub2;

public class Book {

	private String title;
	private String author;
	private int copies;
	
	public Book(String title, String author, int copies) {
		this.title = title;
		this.author = author;
		this.copies = copies;
	}
	
	
	
	public boolean borrowBook() {
		if(copies > 0) {
		       copies --;
			return true;
		}else {
			return false;
		}
		
	}
	public void  returnBook() {
		copies ++;
		
	}
	public void show() {
		System.out.println("책 제목 : " + this.title);
		System.out.println("저자 이름 : " + this.author);
		System.out.println("이용 가능한 복사본 수  : " + this.copies);
		
	}
	
}
