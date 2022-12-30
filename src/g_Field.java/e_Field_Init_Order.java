// 필드의 초기화 순서
// 클래스의 필드는 앞서 살펴본 것과 같이 다양한 방법으로 초기화할 수 있습니다.
// 따라서 같은 필드가 여러 번 초기화될 가능성이 있습니다.
 
// 자바에서 필드는 다음과 같은 순서로 초기화됩니다.
 
// 1. 클래스 변수 : 기본값 → 명시적 초기화 → 클래스 초기화 블록
// 2. 인스턴스 변수 : 기본값 → 명시적 초기화 → 인스턴스 초기화 블록 → 생성자

class InitBlock {
	static int classVar = 10;					// 클래스 변수의 명시적 초기화
	int instanceVar = 10;						// 인스턴스 변수의 명시적 초기화
    
	static { classVar = 20; }					// 클래스 초기화 블록을 이용한 초기화
	{ instanceVar = 20; }						// 인스턴스 초기화 블록을 이용한 초기화
    
	InitBlock() { classVar = 400; instanceVar = 300; }			// 생성자를 이용한 초기화
                // classVar는 이미 static 으로 초기화 되어있어서 생성자로 바꿀 수 없어
}

public class e_Field_Init_Order {
	public static void main(String[] args) {
		System.out.println(InitBlock.classVar);
		InitBlock myInit = new InitBlock();
		System.out.println(myInit.instanceVar);
	}
}