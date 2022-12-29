public class b_assignment_operator {
	public static void main(String[] args) {
		int num1 = 7, num2 = 7, num3 = 7;
		
        System.out.println("num1 : "+ num1 + " num2 : " + num2 + " num3 : " + num3);
        
		num1 = num1 - 3;
		num2 -= 3;
		num3 =- 3;
		
		System.out.println("-  연산자에 의한 결과 : "+ num1);
		System.out.println("-= 연산자에 의한 결과 : "+ num2);
		System.out.println("=- 연산자에 의한 결과 : "+ num3);
	}
}