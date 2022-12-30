public class e_logical_operator {
	public static void main(String[] args) {
		char ch1 = 'b', ch2 = 'B';
		boolean result1, result2;
		
		result1 = (ch1 > 'a') && (ch1 < 'z') ; // T and T
		result2 = (ch2 < 'A') || (ch2 > 'Z') ; // F or F
		
		System.out.println("&& 연산자에 의한 결과 : "+ result1);
		System.out.println("|| 연산자에 의한 결과 : "+ result2);
		System.out.println("!  연산자에 의한 결과 : "+ !result2);
	}
}