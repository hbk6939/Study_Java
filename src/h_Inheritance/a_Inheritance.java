class Parent {
	private int a = 10;		// private 필드
	public int b = 20;		// public 필드
}

class Child extends Parent {
	public int c = 30;		// public 필드
	void display() {
		// System.out.println(a);	// 상속받은 private 필드 참조
		System.out.println(b);		// 상속받은 public 필드 참조
		System.out.println(c);		// 자식 클래스에서 선언한 public 필드 참조
	}
}

public class a_Inheritance {
	public static void main(String[] args) {
		Child ch = new Child();
		ch.display();
	}
}

// Object 클래스
// 자바에서 Object 클래스는 모든 클래스의 부모 클래스가 되는 클래스입니다.
// 따라서 자바의 모든 클래스는 자동으로 Object 클래스의 모든 필드와 메소드를 상속받게 됩니다.
 
// 즉, 자바의 모든 클래스는 별도로 extends 키워드를 사용하여 Object 클래스의 상속을 명시하지 않아도 Object 클래스의 모든 멤버를 자유롭게 사용할 수 있습니다.
// 자바의 모든 객체에서 toString()이나 clone()과 같은 메소드를 바로 사용할 수 있는 이유가 해당 메소드들이 Object 클래스의 메소드이기 때문입니다.