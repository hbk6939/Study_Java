// floor() 메소드, ceil() 메소드와 round() 메소드
// floor() 메소드는 인수로 전달받은 값과 같거나 작은 수 중에서 가장 큰 정수를 반환합니다.
// 또한, ceil() 메소드는 반대로 인수로 전달받은 값과 같거나 큰 수 중에서 가장 작은 정수를 반환합니다.
// round() 메소드는 전달받은 실수를 소수점 첫째 자리에서 반올림한 정수를 반환합니다.

public class p_Math_floor_ceil_round {
	public static void main(String[] args) {
        System.out.println("Math.ceil() : 올림");
		System.out.println(Math.ceil(10.0));		// 10.0
		System.out.println(Math.ceil(10.1));		// 11.0
		System.out.println(Math.ceil(10.000001));	// 11.0
        System.out.println();
		
        System.out.println("Math.floor() : 내림");
		System.out.println(Math.floor(10.0));		// 10.0
		System.out.println(Math.floor(10.9));		// 10.0
        System.out.println();
		
        System.out.println("Math.round() : 반올림");
		System.out.println(Math.round(10.0));		// 10
		System.out.println(Math.round(10.4));		// 10
		System.out.println(Math.round(10.5));		// 11
        System.out.println();
	}
}