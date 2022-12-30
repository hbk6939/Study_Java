// 인스턴스 초기화 블록
// 인스턴스 초기화 블록은 단순히 중괄호({})만을 사용하여 정의할 수 있습니다.
// 이러한 인스턴스 초기화 블록은 생성자와 마찬가지로 인스턴스가 생성될 때마다 실행됩니다.
// 하지만 언제나 인스턴스 초기화 블록이 생성자보다 먼저 실행됩니다.
 
// 생성자와 인스턴스 초기화 블록의 차이는 거의 없으므로 인스턴스 초기화 블록은 잘 사용되지 않습니다.
// 단, 여러 개의 생성자가 있으면 모든 생성자에서 공통으로 수행되어야 할 코드를 인스턴스 초기화 블록에 포함하여 코드의 중복을 막을 수 있습니다.

class Car {
	private String modelName;
	private int modelYear;
	private String color;
	private int maxSpeed;
	private int currentSpeed;

	{	// 인스턴스 초기화 블록
		this.currentSpeed = 100;
	}
	
	Car() {}
	Car(String modelName, int modelYear, String color, int maxSpeed) {
		this.modelName = modelName;
		this.modelYear = modelYear;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	public int getSpeed() {
		return currentSpeed;
	}
}

public class c_Field_Init_instance {
	public static void main(String[] args) {
		Car myCar = new Car();					// 인스턴스 생성
		System.out.println(myCar.getSpeed());	// 인스턴스 메소드의 호출
	}
}