
import java.util.*;

public class n_Math_random {
	public static void main(String[] args) {
        // 0.0 ?????? 1.0 ????????? ???????????? ????????? double??? ?????? ?????? ??????
		System.out.println((int)(Math.random() * 100) + "\n");
		
		Random ran = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d?????? : %d\n" , i+1, ran.nextInt(100));
        }
	}
}