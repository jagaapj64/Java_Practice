package InterviewTask;

public class Runtime_Poly_Multilevel_Inheritance_Animal {

	public void eat() {
		System.out.println("eating");
	}
	
	public void bark() {
		System.out.println("barking.");
	}
}

class Dog extends Runtime_Poly_Multilevel_Inheritance_Animal {
	public void eat() {
		System.out.println("eating fruits..");
	}
	public void bark() {
		System.out.println("barking heavly...");
	}
}

class BabyDog extends Dog {
	public void eat() {
		System.out.println("drinking milk...");
	}

	public static void main(String[] args) {
		Runtime_Poly_Multilevel_Inheritance_Animal a1, a2, a3;
		a1 = new Runtime_Poly_Multilevel_Inheritance_Animal();
		a2 = new Dog();
		a3 = new BabyDog();
		a1.eat();
		a2.eat();
		a3.eat();
		a3.bark();
	}
}
