public class h_String_trim {
	public static void main(String[] args) {
		String str = new String("  Java		");
		System.out.println("\n원본 문자열 : " + str);
		
		System.out.println(str + '|');
		System.out.println(str.trim() + '|');
		System.out.println("trim() 메소드 호출 후 원본 문자열 : " + str + "\n");
	}
}

// trim() 메소드
// trim() 메소드는 해당 문자열의 맨 앞과 맨 뒤에 포함된 모든 공백 문자를 제거해 줍니다.