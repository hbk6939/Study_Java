public class i_String_toLowerCase {
	public static void main(String[] args) {
		String str = new String("Java");
		System.out.println("\n원본 문자열 : " + str);
		
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println("두 메소드 호출 후 원본 문자열 : " + str + "\n");
	}
}

// toLowerCase()와 toUpperCase() 메소드
// toLowerCase() 메소드는 해당 문자열의 모든 문자를 소문자로 변환시켜 줍니다.
// 또한, toUpperCase() 메소드는 해당 문자열의 모든 문자를 대문자로 변환시켜 줍니다.