// 자바에서 메소드를 오버라이딩하기 위한 조건은 다음과 같습니다.
 
// 1. 오버라이딩이란 메소드의 동작만을 재정의하는 것이므로, 메소드의 선언부는 기존 메소드와 완전히 같아야 합니다.
//     하지만 메소드의 반환 타입은 부모 클래스의 반환 타입으로 타입 변환할 수 있는 타입이라면 변경할 수 있습니다.
// 2. 부모 클래스의 메소드보다 접근 제어자를 더 좁은 범위로 변경할 수 없습니다
// 3. 부모 클래스의 메소드보다 더 큰 범위의 예외를 선언할 수 없습니다.

class Parent {
	void display() {
		System.out.println("부모 클래스의 display() 메소드입니다.");
	}
}

class Child extends Parent {
	void display() {
		System.out.println("자식 클래스의 display() 메소드입니다.");
	}
}

public class d_Method_Overriding {
	public static void main(String[] args) {
		Parent pa = new Parent();
		pa.display();
        
		Child ch = new Child();
		ch.display();
        
		Parent pc = new Child(); // 다형성 때문에 가능
		pc.display();
        
		// Child cp = new Parent();
	}
}