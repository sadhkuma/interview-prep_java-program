package practice;

public class PrimeBetween200And300 {
    public static void main(String[] args) {
        System.out.println("Prime numbers between 200 and 300:");

        for (int number = 200; number <= 300; number++) {
            if (isPrime(number)) {
                System.out.print(number + " ");
            }
        }
    }   

    // Method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
