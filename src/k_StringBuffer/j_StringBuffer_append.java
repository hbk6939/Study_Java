// java.lang.StringBuffer 클래스
// String 클래스의 인스턴스는 한 번 생성되면 그 값을 읽기만 할 수 있고, 변경할 수는 없습니다.
// 하지만 StringBuffer 클래스의 인스턴스는 그 값을 변경할 수도 있고, 추가할 수도 있습니다.
 
// 이를 위해 StringBuffer 클래스는 내부적으로 버퍼(buffer)라고 하는 독립적인 공간을 가집니다.
// 버퍼 크기의 기본값은 16개의 문자를 저장할 수 있는 크기이며, 생성자를 통해 그 크기를 별도로 설정할 수도 있습니다.
// 하지만 인스턴스 생성 시 사용자가 설정한 크기보다 언제나 16개의 문자를 더 저장할 수 있도록 여유 있는 크기로 생성됩니다.
 
// 덧셈(+) 연산자를 이용해 String 인스턴스의 문자열을 결합하면, 내용이 합쳐진 새로운 String 인스턴스를 생성합니다.
// 따라서 문자열을 많이 결합하면 결합할수록 공간의 낭비뿐만 아니라 속도 또한 매우 느려지게 됩니다.
 
// 하지만 StringBuffer 인스턴스를 사용하면 문자열을 바로 추가할 수 있으므로, 공간의 낭비도 없으며 속도도 매우 빨라집니다.
// 이러한 StringBuffer 클래스는 java.lang 패키지에 포함되어 제공됩니다.


// append() 메소드
// append() 메소드는 인수로 전달된 값을 문자열로 변환한 후, 해당 문자열의 마지막에 추가합니다.
// 이 메소드는 String 클래스의 concat() 메소드와 같은 결과를 반환하지만, 내부적인 처리 속도가 훨씬 빠릅니다.
    
public class j_StringBuffer_append {
	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("Java");
		System.out.println("\n원본 문자열 : " + str);

		System.out.println(str.append("수업"));
		System.out.println("append() 메소드 호출 후 원본 문자열 : " + str + "\n");
	}
}