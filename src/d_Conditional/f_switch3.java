public class f_switch3 {
	public static void main(String[] args) {
		char ch = 'E';
		
		switch (ch) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				System.out.println("해당 문자는 소문자 모음입니다.");
				break;
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				System.out.println("해당 문자는 대문자 모음입니다.");
				break;
			default:
				System.out.println("해당 문자는 모음이 아닙니다.");
				break;
		}
	}
}