package InterviewTask;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

//https://stackoverflow.com/questions/6094575/creating-an-instance-using-the-class-name-and-calling-constructor#:~:text=You%20can%20use%20Class.,to%20get%20your%20new%20instance.
public class StaticVsDynamicLoadingMain {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {

//		PracticeTask.DynamicClassLoading
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter Class Name Dynamically : ");
		String str = scn.next();
		StaticClassLoading s = new StaticClassLoading();
		s.staticMethod();

		try {
			Class<DynamicClassLoading> cls = (Class<DynamicClassLoading>) Class.forName(str);
			Constructor<DynamicClassLoading> cons = cls.getDeclaredConstructor();
            // Since it is private, make it accessible.
			cons.setAccessible(true);
            // Create new object. 
			DynamicClassLoading d = (DynamicClassLoading) cons.newInstance();
			d.dynamicMethod();
		  System.out.println(System.getProperties());
			
		} catch (ClassNotFoundException e) {

			System.out.println("Please Enter Valid Class Name Path!!");
		}

	}

}
