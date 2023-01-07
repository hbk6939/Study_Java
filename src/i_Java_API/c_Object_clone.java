// clone() 메소드
// clone() 메소드는 해당 인스턴스를 복제하여, 새로운 인스턴스를 생성해 반환합니다.
// 하지만 Object 클래스의 clone() 메소드는 단지 필드의 값만을 복사하므로, 필드의 값이 배열이나 인스턴스면 제대로 복제할 수 없습니다.
// 따라서 이러한 경우에는 해당 클래스에서 clone() 메소드를 오버라이딩하여, 복제가 제대로 이루어지도록 재정의해야 합니다.
 
// 이러한 clone() 메소드는 데이터의 보호를 이유로 Cloneable 인터페이스를 구현한 클래스의 인스턴스만이 사용할 수 있습니다.

import java.util.*;

class Car implements Cloneable {
	private String modelName;
	private ArrayList<String> owners = new ArrayList<String>();

	public String getModelName() { return this.modelName; }
	public void setModelName(String modelName) { this.modelName = modelName; }

	public ArrayList getOwners() { return this.owners; }
	public void setOwners(String ownerName) { this.owners.add(ownerName); }
	
	public Object clone() {
		try {
			Car clonedCar = (Car)super.clone();
			// clonedCar.owners = (ArrayList)owners.clone();
			return clonedCar;
		} catch (CloneNotSupportedException ex) {
			ex.printStackTrace();
			return null;
		}
	}
}

public class c_Object_clone {
	public static void main(String[] args) {
		Car car01 = new Car();

		car01.setModelName("아반떼");
		car01.setOwners("홍길동");
		System.out.println("Car01 : " + car01.getModelName() + ", " + car01.getOwners() + "\n");
		
		Car car02 = (Car)car01.clone();
		car02.setOwners("이순신");
		System.out.println("Car01 : " + car01.getModelName() + ", " + car01.getOwners());
		System.out.println("Car02 : " + car02.getModelName() + ", " + car02.getOwners());
	}
}