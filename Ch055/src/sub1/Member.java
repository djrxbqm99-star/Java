package sub1;

public class Member {
	
	String name;
	int age;
	boolean isActive;
	
	
	public void activate() {
		this.isActive = true;
	}
	
	public void deactivate() {
		this.isActive = false;
	}
	
	public boolean isAdult() {
		if(age >=20) {
			return true;
		}else {
			return false;
		}
	}
	
	public void show() {
		System.out.println("회원 이름 : " +this.name);
		System.out.println("회원 나이 : " +this.age);
		System.out.println("활성 회원 여부 : " +this.isActive);
	}
	
	

}
