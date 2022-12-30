public class b_array_initialization {
	public static void main(String[] args) {
		int[] grade = new int[]{85, 65, 90};	// 길이가 3인 int형 배열을 선언과 동시에 초기화
        int[] grade1 = {70, 90, 80};          // 배열의 선언과 동시에 초기화할 수 있음.
        int[] grade2 = new int[]{70, 90, 80}; // 배열의 선언과 동시에 초기화할 수 있음.
        int[] grade3;
        // grade3 = {70, 90, 80};             // 이미 선언된 배열을 이 방법으로 초기화하면 오류가 발생함.
        int[] grade4;
        grade4 = new int[]{70, 90, 80};       // 이미 선언된 배열은 이 방법으로만 초기화할 수 있음.

		for (int i = 0; i < grade.length; i++) {
			System.out.print(grade[i] + " ");	// 인덱스를 이용한 배열로의 접근
		}
	}
}