public class d_relational_operator {
	public static void main(String[] args) {
		char ch1 = 'a', ch2 = 'A';
				
		System.out.println("== 연산자에 의한 결과 : "+ (ch1 == ch2));
		System.out.println(">  연산자에 의한 결과 : "+ (ch1 > ch2));
	}
}
// 일반적으로 영문자 'A'와 'a' 중에서 더 큰 문자는 'A'일 거라고 생각하기 쉽습니다.
// 하지만 아스키코드에서 'A'는 10진수 65로 나타내며, 'a'는 10진수 97로 나타냅니다.
// 따라서 두 문자를 비교하면 'a'가 더 크다는 결과가 나오게 되는 것입니다.
// 모든 영문 대문자의 아스키 코드 값은 모든 영문 소문자보다 작은 값을 가집니다.