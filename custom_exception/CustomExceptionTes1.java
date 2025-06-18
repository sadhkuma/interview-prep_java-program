package custom_exception;

public class CustomExceptionTes1 {
	public static void main(String[] args) throws UnderAgeException {
		int age = 17;
		if (age < 18) {
			throw new UnderAgeException("You can't vote as your age is below  18");
		} else {
			System.out.println("you can vote now!");
		}
	}
}
