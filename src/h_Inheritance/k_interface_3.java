interface Animal { public abstract void cry(); }

interface Cat extends Animal {
	public abstract void cry();
}

interface Dog extends Animal {
	public abstract void cry();
}

class MyPet implements Cat, Dog {
	public void cry() {
		System.out.println("멍멍! 냐옹냐옹!");
	}
}

public class k_interface_3 {
	public static void main(String[] args) {
		MyPet p = new MyPet();
		p.cry();
	}
}