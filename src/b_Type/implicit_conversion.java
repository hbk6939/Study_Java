public class implicit_conversion {
	public static void main(String[] args) {
		double num1 = 10; // double형 변수에 int형 데이터를 대입하므로, int형 데이터가 double형으로 자동 타입 변환
		// int num2 = 3.14; // int형 변수가 표현할 수 있는 범위보다 더 큰 double형 데이터를 대입하므로, 데이터의 손실
		double num3 = 7.0f + 3.14; // 데이터의 손실이 최소화되도록 float형 데이터가 double형으로 자동 타입 변환
		System.out.println(num1);
        // System.out.println(num2);
		System.out.println(num3);
	}
}