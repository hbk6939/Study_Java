// super() 메소드
// this() 메소드가 같은 클래스의 다른 생성자를 호출할 때 사용된다면, super() 메소드는 부모 클래스의 생성자를 호출할 때 사용됩니다.
 
// 자식 클래스의 인스턴스를 생성하면, 해당 인스턴스에는 자식 클래스의 고유 멤버뿐만 아니라 부모 클래스의 모든 멤버까지도 포함되어 있습니다.
// 따라서 부모 클래스의 멤버를 초기화하기 위해서는 자식 클래스의 생성자에서 부모 클래스의 생성자까지 호출해야만 합니다.
// 이러한 부모 클래스의 생성자 호출은 모든 클래스의 부모 클래스인 Object 클래스의 생성자까지 계속 거슬러 올라가며 수행됩니다.
 
// 따라서 자바 컴파일러는 부모 클래스의 생성자를 명시적으로 호출하지 않는 
// 모든 자식 클래스의 생성자 첫 줄에 자동으로 다음과 같은 명령문을 추가하여, 부모 클래스의 멤버를 초기화할 수 있도록 해줍니다.

class Parent {
	int a;
	
	Parent() { a = 10; }
	Parent(int n) { a = n; }
}

class Child extends Parent {
	int b;
	
	Child() {
        // 주석 안지우면 자동 super()을 컴파일러가 생성해서 a = 10, b = 20 지우면 a = 40, b = 20
		super(40); 
		b = 20;
	}
	
	void display() {
		System.out.println(a);
		System.out.println(b);
	}
}

public class c_super {
	public static void main(String[] args) {
		Child ch = new Child();
		ch.display();
	}
}