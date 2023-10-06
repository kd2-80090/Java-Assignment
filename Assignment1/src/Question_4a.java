


/*
4. Write a program to generate following pattern
a)
	*
   * *
  * * *
 * * * *
* * * * *
*/



public class Question_4a {

	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			for(int j= i;j<=i;j++){
				System.out.print(" * ");
			}
			System.out.print("\n");
		}
	}

}
