// max() 메소드와 min() 메소드
// max() 메소드는 전달된 두 값을 비교하여 그중에서 큰 값을 반환하며, min() 메소드는 그중에서 작은 값을 반환합니다.

public class q_Math_max_min {
	public static void main(String[] args) {
		System.out.println(Math.max(3.14, 3.14159));	// 3.14159
		System.out.println(Math.min(3.14, 3.14159));	// 3.14
		System.out.println();
		
		System.out.println(Math.max(-10, -11));			// -10
		System.out.println(Math.min(-10, -11));			// -11
	}
}