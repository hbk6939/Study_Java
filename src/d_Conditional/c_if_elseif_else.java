public class c_if_elseif_else {
	public static void main(String[] args) {
		char ch = 'J';
		
		if (ch >= 'a' && ch <= 'z') {
			System.out.println("해당 문자는 영문 소문자입니다.");
		} else if (ch >= 'A' && ch <= 'Z') {
			System.out.println("해당 문자는 영문 대문자입니다.");
		} else {
			System.out.println("해당 문자는 영문자가 아닙니다.");
		}
	}
}