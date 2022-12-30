class Test {
	void display(int num1) { System.out.println(num1); }
	void display(int num1, int num2) { System.out.println(num1 * num2); }
	void display(int num1, double num2) { System.out.println(num1 + num2); }
}

public class g_Method_Overloading {
	public static void main(String[] args) {
		Test myfunc = new Test();
		myfunc.display(10);
		myfunc.display(10, 20);
		myfunc.display(10, 3.14);
		myfunc.display(10, 'a');
	}
}