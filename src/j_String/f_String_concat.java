public class f_String_concat {
	public static void main(String[] args) {
		String str = new String("Java");
		System.out.println("\n원본 문자열 : " + str);

		System.out.println(str.concat("수업"));
		System.out.println("concat() 메소드 호출 후 원본 문자열 : " + str + "\n");
	}
}

// concat() 메소드
// concat() 메소드는 해당 문자열의 뒤에 인수로 전달된 문자열을 추가한 새로운 문자열을 반환합니다.
// 만약 인수로 전달된 문자열의 길이가 0이면, 해당 문자열을 그대로 반환합니다.