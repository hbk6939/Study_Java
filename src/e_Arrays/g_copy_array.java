import java.util.Arrays;

public class g_copy_array {
	public static void main(String[] args) {
		int[] arr1 = new int[]{1, 2, 3, 4, 5};
		int newLen = 10;
		
        
		// 1. System 클래스의 arraycopy() 메소드
        // System.arraycopy(1.원본배열, 2.원본 배열의 복사 시작 지점, 3.복사할 배열, 4.복사할 배열의 복사 시작 지점, 5.복사할 요소의 개수)
		int[] arr2 = new int[newLen];
		System.arraycopy(arr1, 0, arr2, 0, arr1.length);
		
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
        System.out.println("\narr2 : "+Arrays.toString(arr2)+"\n");
		
        
		// 2. Arrays 클래스의 copyOf() 메소드
        // Arrays.copyOf(복사할배열, 복사할 길이)
		int[] arr3 = Arrays.copyOf(arr1, 10);
		
		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i] + " ");
		}
        System.out.println("\narr3 : "+Arrays.toString(arr3)+"\n");
		
        
		// 3. Object 클래스의 clone() 메소드
		int[] arr4 = (int[])arr1.clone();
		
		for (int i = 0; i < arr4.length; i++) {
			System.out.print(arr4[i] + " ");
		}
        System.out.println("\narr4 : "+Arrays.toString(arr4)+"\n");
		
        
		// 4. for 문과 인덱스를 이용한 복사
		int[] arr5 = new int[newLen];
		
		for (int i = 0; i < arr1.length; i++) {
			arr5[i] = arr1[i];
		}
		
		for (int i = 0; i < arr5.length; i++) {
			System.out.print(arr5[i] + " ");
		}
        System.out.println("\narr5 : "+Arrays.toString(arr5)+"\n");
	}
}