// 참조 변수의 타입 변환
// 자바에서는 참조 변수도 다음과 같은 조건에 따라 타입 변환을 할 수 있습니다.

// 1. 서로 상속 관계에 있는 클래스 사이에만 타입 변환을 할 수 있습니다.
// 2. 자식 클래스 타입에서 부모 클래스 타입으로의 타입 변환은 생략할 수 있습니다.
// 3. 하지만 부모 클래스 타입에서 자식 클래스 타입으로의 타입 변환은 반드시 명시해야 합니다.

// 참조 변수의 타입 변환도 기본 타입의 타입 변환과 마찬가지로 타입 캐스트 연산자(())를 사용합니다.


class Parent { }
class Child extends Parent { }
class Brother extends Parent { }


public class f_polymorphism{
    public static void main(String[] args) {
        Parent pa01 = null;
        Child ch = new Child();
        Parent pa02 = new Parent();
        Brother br = null;

        pa01 = ch;          // pa01 = (Parent)ch; 와 같으며, 타입 변환을 생략할 수 있음.    
        try {
            br = (Brother)pa02; // 타입 변환을 생략할 수 없음.
            // br = (Brother)ch;   // 직접적인 상속 관계가 아니므로, 오류 발생.
        } catch (Exception e) {
            System.out.println("오류 : " + e);
        }
    }
}