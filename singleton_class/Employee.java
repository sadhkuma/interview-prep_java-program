package singleton_class;

public class Employee {
	// Private static instance of the class
	/*
	 * Create a private static variable of the class type. This variable will hold
	 * the single instance of the class.
	 */
	private static Employee instance;

//Private constructor to prevent instantiation
	/*
	 * Declare the constructor of the class as private. This prevents direct
	 * instantiation of the class from outside
	 */
	private Employee() {
//Initialization code here
	}

	// Public method to provide access to the instance
	/*
	 * Provide a public static method that returns the instance of the class. This
	 * method checks if an instance already exists. If not, it creates a new
	 * instance and returns it. Subsequent calls to this method will return the same
	 * instance
	 */
	public static Employee getInstance() {
		if (instance == null) {
			synchronized (Employee.class) {
				if (instance == null) {

					instance = new Employee();
				}
			}
		}
		return instance;
	}

	// Example method
	public void showMessage() {
		System.out.println("Hello, I am a Singleton!");
	}

}
