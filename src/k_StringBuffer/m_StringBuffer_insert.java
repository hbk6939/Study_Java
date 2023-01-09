// insert() 메소드
// insert() 메소드는 인수로 전달된 값을 문자열로 변환한 후, 해당 문자열의 지정된 인덱스 위치에 추가합니다.
// 이때 전달된 인덱스가 해당 문자열의 길이와 같으면, append() 메소드와 같은 결과를 반환합니다.

public class m_StringBuffer_insert {
	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("Java 만세!!");
		System.out.println("\n원본 문자열 : " + str);

		System.out.println(str.insert(4, "Script")); // 4번째 인덱스에 "Script"
		System.out.println("insert() 메소드 호출 후 원본 문자열 : " + str + "\n");
	}
}