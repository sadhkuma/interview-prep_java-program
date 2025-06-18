package singleton_class;

public class SingletonTest {

    // Main method to demonstrate the Singleton pattern
    public static void main(String[] args) {
        // Get the single instance of Singleton
    	Employee singleton = Employee.getInstance();

        // Call the example method
        singleton.showMessage();
    }
}
