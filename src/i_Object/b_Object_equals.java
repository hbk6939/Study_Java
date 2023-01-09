// equals() 메소드
// equals() 메소드는 해당 인스턴스를 매개변수로 전달받는 참조 변수와 비교하여, 그 결과를 반환합니다.
// 이때 참조 변수가 가리키는 값을 비교하므로, 서로 다른 두 객체는 언제나 false를 반환하게 됩니다.

class Car {
	private String modelName;
	private int modelYear;
	private String color;
	private int maxSpeed;
	
	Car(String modelName, int modelYear, String color, int maxSpeed) {
		this.modelName = modelName;
		this.modelYear = modelYear;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	Car() {
		this("아반떼", 2016, "흰색", 200);
	}
	
	public String getModel() {
		return this.modelYear + "년식 " + this.modelName + " " + this.color;
	}
}

public class b_Object_equals {
	public static void main(String[] args) {
		Car car01 = new Car();
		Car car02 = new Car();
		System.out.println(car01.equals(car02)); // false
		
		car01 = car02;			// 두 참조 변수가 같은 주소를 가리킴.
		System.out.println(car01.equals(car02)); // true
	}
}