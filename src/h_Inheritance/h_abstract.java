// ?????? ?????????(abstract method)??? ?????? ??????????????? ????????? ???????????????????????? ????????? ??? ?????? ???????????? ???????????????.
// ??????????????? ?????? ????????? ?????? ???????????? ???????????? ???????????? ????????? ?????? ?????????(abstract class)?????? ?????????.

abstract class Animal {	abstract void cry(); }

class Cat extends Animal {
	void cry() {
		System.out.println("????????????!");
	}
}

class Dog extends Animal {
	void cry() {
		System.out.println("??????!");
	}
}

public class h_abstract_method {
	public static void main(String[] args) {
		// Animal a = new Animal(); // ?????? ???????????? ??????????????? ????????? ??? ??????.
		Cat c = new Cat();
		Dog d = new Dog();
		
		c.cry();
		d.cry();
	}
}