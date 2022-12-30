public class f_bitwise_operator {
	public static void main(String[] args) {
		int num1 = 8, num2 = -8;
				
		System.out.println("~   연산자에 의한 결과 : "+ ~num1);
		System.out.println("<<  연산자에 의한 결과 : "+ (num1 << 2));
		System.out.println(">>  연산자에 의한 결과 : "+ (num2 >> 2));
		System.out.println(">>> 연산자에 의한 결과 : "+ (num1 >>> 2));
		System.out.println(">>> 연산자에 의한 결과 : "+ (num2 >>> 2));
	}
}