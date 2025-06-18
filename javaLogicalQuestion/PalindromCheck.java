package javaLogicalQuestion;

public class PalindromCheck {
public static void main(String[] args) {
	String str="Kajal";
	int i=0;
	int j=str.length()-1;
	while(i<j) {
		if(str.charAt(i)!=str.charAt(j)) {
			System.out.println("String is not palindrome");
		}
		i++;
		j--;
	}
		System.out.println("String is palindrome");
	
}
}
