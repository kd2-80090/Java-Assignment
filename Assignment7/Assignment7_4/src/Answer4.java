import java.util.Scanner;

public class Answer4 {
		public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a string: ");
	        String input = sc.nextLine();

	        // Remove leading and trailing spaces and split the string by spaces
	        String[] words = input.trim().split("\\s+");

	        int wordCount = words.length;

	        System.out.println("Number of words: " + wordCount);

	}
}
