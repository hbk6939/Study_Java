// 열거체(enumeration type)
// C언어와 C++에서는 열거체를 사용할 수 있지만, JDK 1.5 이전의 자바에서는 열거체를 사용할 수 없었습니다.
// 하지만 JDK 1.5부터는 C언어의 열거체보다 더욱 향상된 성능의 열거체를 정의한 Enum 클래스를 사용할 수 있습니다.

// 1. 열거체를 비교할 때 실제 값뿐만 아니라 타입까지도 체크합니다.
// 2. 열거체의 상숫값이 재정의되더라도 다시 컴파일할 필요가 없습니다.

enum Rainbow { RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET }

public class b_Enum {
	public static void main(String[] args) {
		Rainbow[] arr = Rainbow.values();
		
		for (Rainbow rb : arr) {
			System.out.println(rb);
		}
	}
}