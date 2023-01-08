public class d_String_charAt {
	public static void main(String[] args) {
		String str = new String("Java");
		System.out.println("\n원본 문자열 : " + str);
		
		for (int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i) + " ");
		}
		System.out.println("\ncharAt() 메소드 호출 후 원본 문자열 : " + str + "\n");
	}
}

// charAt() 메소드
// charAt() 메소드는 해당 문자열의 특정 인덱스에 해당하는 문자를 반환합니다.
// 만약 해당 문자열의 길이보다 큰 인덱스나 음수를 전달하면, IndexOutOfBoundsException 오류가 발생합니다.