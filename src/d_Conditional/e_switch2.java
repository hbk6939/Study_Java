public class prog {
	public static void main(String[] args) {
		char ch = 'i';
		
		switch (ch) {
			case 'a':
				System.out.println("해당 문자는 'A'입니다.");
			case 'e':
				System.out.println("해당 문자는 'E'입니다.");
			case 'i':
				System.out.println("해당 문자는 'I'입니다.");
			case 'o':
				System.out.println("해당 문자는 'O'입니다.");
			case 'u':
				System.out.println("해당 문자는 'U'입니다.");
			default:
				System.out.println("해당 문자는 모음이 아닙니다.");
		}
	}
}