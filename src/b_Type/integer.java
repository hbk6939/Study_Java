public class integer {
	public static void main(String[] args) {
		byte num1 = 127;
		byte num2 = -128;
        
        System.out.println("num1 = " + num1);	// 127
		System.out.println("num2 = " + num2);	// -128
		
		num1++;		// 127 + 1
		num2--;		// -128 - 1

		System.out.println("num1 = " + num1);	// -128
		System.out.println("num2 = " + num2);	// 127
	}
}