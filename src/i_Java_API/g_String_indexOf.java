public class g_String_indexOf {
	public static void main(String[] args) {
		String str = new String("Oracle Java");
		System.out.println("\n원본 문자열 : " + str);
		
		System.out.println(str.indexOf('o'));
		System.out.println(str.indexOf('a'));
		System.out.println(str.indexOf("Java"));
		System.out.println("indexOf() 메소드 호출 후 원본 문자열 : " + str + "\n");
	}
}

// indexOf() 메소드
// indexOf() 메소드는 해당 문자열에서 특정 문자나 문자열이 처음으로 등장하는 위치의 인덱스를 반환합니다.
// 만약 해당 문자열에 전달된 문자나 문자열이 포함되어 있지 않으면 -1을 반환합니다.