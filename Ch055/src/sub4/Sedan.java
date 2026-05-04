package sub4;



public class Sedan extends Car {
	
	private int cc; // 배기량
	
	public Sedan(String name, String color, int speed, int cc) {
		super(name, color, speed);  // 부모 Car의 생성자 호출 ** 혼자 정리  : sedan에 빨간 밋줄 뜨는데 나중에 정리하기 
		this.cc = cc;
	}

	
	public void drive() {	
		System.out.println("Sedan drive!!!");
		System.out.println("차량 배기량 : " + this.cc);
		super.show(); // 부모(super)의 show()호출
	
	}
	
	
	
	
	
}
