// 클래스 초기화 블록
// 클래스 초기화 블록은 인스턴스 초기화 블록에 static 키워드를 추가하여 정의할 수 있습니다.
// 이러한 클래스 초기화 블록은 클래스가 처음으로 메모리에 로딩될 때 단 한 번만 실행됩니다.
 
// 클래스 초기화 블록은 생성자나 인스턴스 초기화 블록으로는 수행할 수 없는 클래스 변수의 초기화를 수행할 때 사용됩니다.

class InitBlock {
	static int classVar;						// 클래스 변수
	int instanceVar;							// 인스턴스 변수
	static {									// 클래스 초기화 블록을 이용한 초기화
		classVar = 10;
	}
}

public class d_Field_Init_class {
	public static void main(String[] args) {
		System.out.println(InitBlock.classVar);	// 클래스 변수에 접근
	}
}