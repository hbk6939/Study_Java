public class a_AutoBoxing {
	public static void main(String[] args) {
		Integer num = new Integer(17);	// 박싱
		int n = num.intValue();			// 언박싱
		System.out.printf("\n박싱 언박싱 : %d\n\n", n);
				
		Character ch = 'X';		// Character ch = new Character('X'); : 오토박싱
		char c = ch;			// char c = ch.charValue();           : 오토언박싱
		System.out.printf("오토박싱 오토언박싱 : %c\n", c);
	}
}