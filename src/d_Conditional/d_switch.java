public class d_switch {
	public static void main(String[] args) {
		char ch = 'e';
		
		switch (ch) {
			case 'a':
				System.out.println("해당 문자는 'A'입니다.");
				break;
			case 'e':
				System.out.println("해당 문자는 'E'입니다.");
				break;
			case 'i':
				System.out.println("해당 문자는 'I'입니다.");
				break;
			case 'o':
				System.out.println("해당 문자는 'O'입니다.");
				break;
			case 'u':
				System.out.println("해당 문자는 'U'입니다.");
				break;
			default:
				System.out.println("해당 문자는 모음이 아닙니다.");
				break;
		}
	}
}