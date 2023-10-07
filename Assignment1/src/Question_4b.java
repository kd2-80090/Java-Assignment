
/*
 4. Write a program to generate following pattern
b)
           *
         ***
       *****
     *******
   *********
     *******
       *****
         ***
           *
*/

public class Question_4b {

	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5-i; j++) {
				System.out.print(" ");
			} 
			for(int k=1; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(" ");
			} 
			for(int k=1; k<=5-i; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
