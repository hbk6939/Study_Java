// capacity() 메소드
// capacity() 메소드는 StringBuffer 인스턴스의 현재 버퍼 크기를 반환합니다.


public class k_StringBuffer_capacity {
	public static void main(String[] args) {
		StringBuffer str01 = new StringBuffer();
		StringBuffer str02 = new StringBuffer("Java");
		
		System.out.println(str01.capacity());
		System.out.println(str02.capacity());
	}
}

// 위의 예제처럼 길이가 4인 문자열로 StringBuffer 인스턴스를 생성하면, 
// 기본적으로 생성되는 여유 버퍼 크기인 16에 문자의 길이인 4를 더한 총 20개의 문자를 저장할 수 있는 버퍼가 생성되는 것을 확인할 수 있습니다.