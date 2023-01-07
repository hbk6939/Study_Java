// 인터페이스의 선언
// 자바에서 인터페이스를 선언하는 방법은 클래스를 작성하는 방법과 같습니다.
// 인터페이스를 선언할 때에는 접근 제어자와 함께 interface 키워드를 사용하면 됩니다.

interface Animal { public abstract void cry(); }

class Cat implements Animal {
	public void cry() {
		System.out.println("냐옹냐옹!");
	}
}

class Dog implements Animal {
	public void cry() {
		System.out.println("멍멍!");
	}
}

public class i_interface {
	public static void main(String[] args) {
		Cat c = new Cat();
		Dog d = new Dog();
		
		c.cry();
		d.cry();
	}
}