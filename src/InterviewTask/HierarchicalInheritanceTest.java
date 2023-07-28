package InterviewTask;

class Car {
	public void dispH1() {
		System.out.println("disp() method of Car");
	}
}

class Audi extends Car {
	public void dispH2() {
		System.out.println("disp() method of Audi");
	}
}

class BMW extends Car {
	public void dispH3() {
		System.out.println("disp() method of BMW");
	}
}

class Innova extends Car {
	public void dispH4() {
		System.out.println("disp() method of Innova");
	}
}

public class HierarchicalInheritanceTest {

	public static void main(String[] args) {

		//Assigning ClassH2 object to ClassH2 reference
		Audi h2 = new Audi();
        //call dispH2() method of Audi
        h2.dispH2();
        //call dispH1() method of Car
        h2.dispH1();
        
        
        //Assigning ClassH3 object to ClassH3 reference
        BMW h3 = new BMW();
        //call dispH3() method of BMW
        h3.dispH3();
        //call dispH1() method of Car
        h3.dispH1();
        
        //Assigning ClassH4 object to ClassH4 reference
        Innova h4 = new Innova();
        //call dispH4() method of Innova
        h4.dispH4();
        //call dispH1() method of Car
        h4.dispH1();
	}
}
