package practice;

/*Input: d2e3d3a1  output: ddeeeddda (coding)*/
public class PrintChar {
public static void main(String[] args) {
	String input = "d2e3d3a1";
    StringBuilder output = new StringBuilder();

    for (int i = 0; i < input.length(); i += 2) {
        char c = input.charAt(i);
        int count = Character.getNumericValue(input.charAt(i + 1));
        for (int j = 0; j < count; j++) {
            output.append(c);
        }
    }

    System.out.println(output.toString()); // Output: ddeeeddda
}
}
