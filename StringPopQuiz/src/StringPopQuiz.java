import java.util.Scanner;

public class StringPopQuiz
	{

		public static void main(String[] args)
			{
				Scanner userInput = new Scanner(System.in);
				System.out.println("Hello! Enter two words please: ");
				
				String word1 = userInput.next();
				String word2 = userInput.next();
				
				
				System.out.print("Your words in camel case: " +  word1.toLowerCase()  );
				System.out.print(word2.substring(0, 1).toUpperCase() + word2.substring(1).toLowerCase());
					
				

			}

	}
