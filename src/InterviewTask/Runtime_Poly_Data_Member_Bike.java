package InterviewTask;

public class Runtime_Poly_Data_Member_Bike {

	int speedLimit = 100;

	public void run() {
		System.out.println("Running with limit speed..");
	}
}

//A method is overridden, not the data members, so runtime polymorphism  can't be achieved by data members.

class Honda extends Runtime_Poly_Data_Member_Bike {
	int speedLimit = 200;

	public void run() {
		System.out.println("Running with 200 speed..");
	}

	public static void main(String[] args) {
		Runtime_Poly_Data_Member_Bike bike = new Honda();
		System.out.println("speedLimit is : " + bike.speedLimit);
		bike.run();
	}
}
