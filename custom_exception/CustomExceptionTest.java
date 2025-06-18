package custom_exception;

//Class to demonstrate the custom exception
public class CustomExceptionTest {
public static void main(String[] args) {
   try {
       // Trigger the custom exception
       throw new CustomException("This is a custom exception message");
   } catch (CustomException e) {
       // Handle the custom exception
       System.out.println("Caught custom exception: " + e.getMessage());
   }
}
}
