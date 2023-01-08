// clone() 메소드
// clone() 메소드는 해당 인스턴스를 복제하여, 새로운 인스턴스를 생성해 반환합니다.
// 하지만 Object 클래스의 clone() 메소드는 단지 필드의 값만을 복사하므로, 필드의 값이 배열이나 인스턴스면 제대로 복제할 수 없습니다.
// 따라서 이러한 경우에는 해당 클래스에서 clone() 메소드를 오버라이딩하여, 복제가 제대로 이루어지도록 재정의해야 합니다.
 
// 이러한 clone() 메소드는 데이터의 보호를 이유로 Cloneable 인터페이스를 구현한 클래스의 인스턴스만이 사용할 수 있습니다.

import java.util.*;

class Car implements Cloneable {
	private String modelName; // 모델명
	private ArrayList<String> owners = new ArrayList<String>(); // 오너 리스트

	public String getModelName() { return this.modelName; } // 모델명 getter
	public void setModelName(String modelName) { this.modelName = modelName; } // 모델명 setter

	public ArrayList getOwners() { return this.owners; } // 오너 리스트 getter
	public void setOwners(String ownerName) { this.owners.add(ownerName); } // 오너 리스트 setter
	
	public Object clone() { // implements Cloneable을 통한 Object의 clone() 메소드 오버리이딩
		try {
            // ②번 라인에서는 부모 클래스의 clone() 메소드를 호출하여 clone() 메소드를 오버라이딩
            // 하지만 ②번 라인처럼 clone() 메소드를 재정의하면, 필드의 값이 ①번 라인처럼 인스턴스일 때는 제대로 된 복제를 수행할 수 없습니다.
			Car clonedCar = (Car)super.clone(); // ②
            // 따라서 정확한 복제를 위해서는 ③번 라인처럼 배열이나 인스턴스인 필드에 대해서는 별도로 clone() 메소드를 구현하여 호출
			clonedCar.owners = (ArrayList)owners.clone(); // ③            
			return clonedCar;
		} catch (CloneNotSupportedException ex) { // ④
			ex.printStackTrace();
			return null;
		}
	}
}

public class c_Object_clone {
	public static void main(String[] args) {
        // ⑤번 라인에서는 Car 클래스의 인스턴스인 car01을 생성
		Car car01 = new Car(); // ⑤

		car01.setModelName("아반떼");
		car01.setOwners("홍길동");
		System.out.println("Car01 : " + car01.getModelName() + ", " + car01.getOwners() + "\n"); // ⑥
		
        // ⑦번 라인에서는 오버라이딩한 clone() 메소드를 호출하여 복제를 수행
		Car car02 = (Car)car01.clone(); // ⑦
        // ⑧번 라인에서는 복제된 인스턴스인 car02의 owners 필드에 새로운 값을 하나 추가
		car02.setOwners("이순신"); // ⑧
        // ⑨번 라인의 실행 결과를 보면, ⑦번 라인의 결과와는 달리 원본 인스턴스인 car01의 owners 필드에도 새로운 값이 추가되었음을 확인
		System.out.println("Car01 : " + car01.getModelName() + ", " + car01.getOwners()); // ⑨
		System.out.println("Car02 : " + car02.getModelName() + ", " + car02.getOwners()); // ⑩
	}
}

            // 이처럼 단순히 부모 클래스의 clone() 메소드를 호출하여 clone() 메소드를 재정의하면,
            // 배열이나 인스턴스인 필드는 복제되는 것이 아닌 해당 배열이나 인스턴스를 가리키는 주소값만이 복제되는 것입니다.