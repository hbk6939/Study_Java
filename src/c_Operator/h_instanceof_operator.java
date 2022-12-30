class A {}
class B extends A {}
public class h_instanceof_operator {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        System.out.printf("a instanceof A : %B \n", a instanceof A); // true
        // System.out.println(a instanceof A); // true
        
        System.out.printf("b instanceof A : %B \n", b instanceof A); // true
        // System.out.println(b instanceof A); // true
        
        System.out.printf("a instanceof B : %B \n", a instanceof B); // false
        // System.out.println(a instanceof B); // false
        
        System.out.printf("b instanceof B : %B \n", b instanceof B); // true
        // System.out.println(b instanceof B); // true
    }
}