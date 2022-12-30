public class l_break {
	public static void main(String[] args) {
		int num = 1, sum = 0;
		
		while (true) {	// 무한 루프
			sum += num;
			if (num == 100) {
				break;
			}
			num++;
		}
		
		System.out.println(sum);
	}
}