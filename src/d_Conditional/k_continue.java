public class k_continue {
	public static void main(String[] args) {
        
        System.out.println("1부터 100까지의 정수 중에서 5의 배수와 7의 배수를 모두 출력");
        
		for (int i = 1; i <= 100; i++) {
			if (i % 5 == 0 || i % 7 == 0) {
				System.out.println(i);
			} else {
				continue; // 아닐경우 계속
			}
		}
	}
}