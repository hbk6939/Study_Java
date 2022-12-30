class Field {
	static int classVar = 10;						// 클래스 변수 선언
	int instanceVar = 20;							// 인스턴스 변수 선언
}

public class a_Field {
	public static void main(String[] args) {
		int var = 30;								// 지역 변수 선언
		System.out.println("var : "+ var + "\n");				// 지역 변수 참조
		
		Field myField1 = new Field();				// 인스턴스 생성
		Field myField2 = new Field();				// 인스턴스 생성
		
        System.out.println("클래스 변수 참조");
		System.out.println("Field.classVar : " + Field.classVar);			// 클래스 변수 참조
		System.out.println("myField1.classVar : " + myField1.classVar);
		System.out.println("myField2.classVar : " + myField2.classVar + "\n");

		myField1.classVar = 100;					// 클래스 변수의 값을 변경
        System.out.println("myField1.classVar = 100\n클래스 변수의 값을 변경 -> 클래스 변수 참조");
		System.out.println("Field.classVar : " + Field.classVar);			// 클래스 변수 참조
		System.out.println("myField1.classVar : " + myField1.classVar);
		System.out.println("myField2.classVar : " + myField2.classVar + "\n");

        System.out.println("인스턴스 변수 참조");
		System.out.println("myField1.instanceVar : " + myField1.instanceVar);	// 인스턴스 변수 참조
		System.out.println("myField2.instanceVar : " + myField2.instanceVar + "\n");

		myField1.instanceVar = 200;					// 인스턴스 변수의 값을 변경
        System.out.println("myField1.instanceVar = 200\n인스턴스 변수의 값을 변경 -> 인스턴스 변수 참조");
		System.out.println("myField1.instanceVar : " + myField1.instanceVar);	// 인스턴스 변수 참조
		System.out.println("myField2.instanceVar : " + myField2.instanceVar);

	}
}