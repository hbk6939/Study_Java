import java.util.*;
import java.util.stream.*;

public class Stream_API {
	public static void main(String[] args){
		String[] arr = new String[]{"넷", "둘", "셋", "하나"};
		
		// 배열에서 스트림 생성
		Stream<String> stream1 = Arrays.stream(arr);
		stream1.forEach(e -> System.out.print(e + " "));
		System.out.println();
		
		// 배열의 특정 부분만을 이용한 스트림 생성
		Stream<String> stream2 = Arrays.stream(arr, 1, 3);
		stream2.forEach(e -> System.out.print(e + " "));
        System.out.println();
	}
}
// 스트림 API(Stream API)
// 자바에서는 많은 양의 데이터를 저장하기 위해서 배열이나 컬렉션을 사용합니다.
// 또한, 이렇게 저장된 데이터에 접근하기 위해서는 반복문이나 반복자(iterator)를 사용하여 매번 코드를 작성해야 했습니다.
 
// 하지만 이렇게 작성된 코드는 길이가 너무 길고 가독성도 떨어지며, 코드의 재사용이 거의 불가능합니다.
// 또한, 데이터베이스의 쿼리와 같이 정형화된 처리 패턴을 가지지 못했기에 데이터마다 다른 방법으로 접근해야만 했습니다.
 
// 이러한 문제점을 극복하기 위해서 Java SE 8 버전부터 도입된 방법이 바로 스트림(stream) API입니다.
// 스트림 API는 데이터를 추상화하여 다루므로, 다양한 방식으로 저장된 데이터를 읽고 쓰기 위한 공통된 방법을 제공합니다.
// 따라서 스트림 API를 이용하면 배열이나 컬렉션뿐만 아니라 파일에 저장된 데이터도 모두 같은 방법으로 다룰 수 있습니다.