public class e_String_compareTo {
	public static void main(String[] args) {
		String str = new String("abcd");
		System.out.println("\n원본 문자열 : " + str);
		
		System.out.printf("%s와 \"bcef\" compareTo 비교 : %d\n" , str, str.compareTo("bcef"));
        System.out.printf("%s와 \"abcd\" compareTo 비교 : %d\n" , str, str.compareTo("abcd"));
		
        System.out.printf("%s와 \"Abcd\" compareTo 비교 : %d\n" , str, str.compareTo("Abcd"));
        System.out.printf("%s와 \"Abcd\" compareToIgnoreCase 비교 : %d\n" , str, str.compareToIgnoreCase("Abcd"));
		System.out.println("compareTo() 메소드 호출 후 원본 문자열 : " + str + "\n");
	}
}

// compareTo() 메소드
// compareTo() 메소드는 해당 문자열을 인수로 전달된 문자열과 사전 편찬 순으로 비교합니다.
// 이 메소드는 문자열을 비교할 때 대소문자를 구분하여 비교합니다.
// 만약 두 문자열이 같다면 0을 반환하며, 해당 문자열이 인수로 전달된 문자열보다 작으면 음수를, 크면 양수를 반환합니다.