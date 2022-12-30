// 오버로딩(overloading)은 새로운 메소드를 정의하는 것입니다.
// 오버라이딩(overriding)은 상속받은 기존의 메소드를 재정의


class Parent {
	void display() {
		System.out.println("부모 클래스의 display() 메소드입니다.");
	}
}

class Child extends Parent {
	void display() {			// 오버라이딩된 display() 메소드
		System.out.println("자식 클래스의 display() 메소드입니다.");
	}
	void display(String str) {	// 오버로딩된 display() 메소드
		System.out.println(str);
	}
}

public class e_Overloading_and_overriding {
	public static void main(String[] args) {
		Child ch = new Child();
        Parent pa = new Parent();
		ch.display();
		ch.display("오버로딩된 display() 메소드입니다.\n");
        pa.display();
	}
}