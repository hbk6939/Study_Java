public class Lambda_Expression {
	public static void main(String[] args){
		new Thread(new Runnable() {
			public void run() {
				System.out.println("전통적인 방식의 일회용 스레드 생성");
			}
		}).start();
		
		new Thread(()->{
			System.out.println("람다 표현식을 사용한 일회용 스레드 생성");
		}).start();
	}
}
// 람다 표현식(lambda expression)이란 간단히 말해 메소드를 하나의 식으로 표현한 것입니다.
// 즉, 식별자 없이 실행할 수 있는 함수 표현식을 의미하며, 따라서 익명 함수(anonymous function)라고도 부릅니다.
 
// 메소드를 이렇게 람다 표현식으로 표현하면 클래스를 만들고 객체를 생성하지 않아도 메소드를 사용할 수 있습니다.
// 또한, 람다 표현식은 메소드의 매개변수로 전달될 수도 있고, 메소드의 결괏값으로 반환될 수도 있습니다.
// 이러한 람다 표현식은 기존의 불필요한 코드를 줄여주고, 작성된 코드의 가독성을 높이는 데 그 목적이 있습니다.