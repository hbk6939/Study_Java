// delete() 메소드
// delete() 메소드는 전달된 인덱스에 해당하는 부분 문자열을 해당 문자열에서 제거합니다.
// 또한, deleteCharAt() 메소드를 사용하면 특정 위치의 문자 한 개만을 제거할 수도 있습니다.


public class l_StringBuffer_delete {
	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("Java Oracle");
		System.out.println("원본 문자열 : " + str);
		
        // System.out.println(str.delete(0, 1));
		System.out.println(str.delete(4, 8)); // [4, 8) 범위 제거
		System.out.println(str.deleteCharAt(1));
		System.out.println("deleteCharAt() 메소드 호출 후 원본 문자열 : " + str);
	}
}