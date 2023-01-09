// toString() 메소드
// toString() 메소드는 해당 인스턴스에 대한 정보를 문자열로 반환합니다.
// 이때 반환되는 문자열은 클래스 이름과 함께 구분자로 '@'가 사용되며, 그 뒤로 16진수 해시 코드(hash code)가 추가됩니다.
// 16진수 해시 코드 값은 인스턴스의 주소를 가리키는 값으로, 인스턴스마다 모두 다르게 반환됩니다.

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

public class a_Object_toString {
	public static void main(String[] args) {
		Car car01 = new Car();
		Car car02 = new Car();
		
		System.out.println(car01.toString());
		System.out.println(car02.toString());
	}
}