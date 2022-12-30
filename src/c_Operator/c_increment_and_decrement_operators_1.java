public class c_increment_and_decrement_operators_1 {
	public static void main(String[] args) {
		int x = 10;
		int y = x-- + 5 + --x;
		
		System.out.println("x : "+ x + ", y : " + y);
	}
}