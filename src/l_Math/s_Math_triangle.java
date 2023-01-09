// sin() 메소드, cos() 메소드와 tan() 메소드
// 자바에서는 삼각 함수와 관련된 다양한 연산을 간편하게 수행할 수 있도록 많은 삼각 함수를 제공하고 있습니다.
// sin() 메소드는 전달된 double형 값의 사인값을, cos() 메소드는 코사인값을, tan() 메소드는 탄제트값을 반환합니다.

public class s_Math_triangle {
	public static void main(String[] args) {
		System.out.println(Math.sin(Math.toRadians(30)));
		System.out.println(Math.sin(Math.PI / 6));
		
		System.out.println(Math.tan(Math.toRadians(45)));
		System.out.println(Math.tan(Math.PI / 4));
		
		System.out.println(Math.cos(Math.toRadians(60)));
		System.out.println(Math.cos(Math.PI / 3));
	}
}