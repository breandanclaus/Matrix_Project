import java.util.Scanner;
public class Game
	{
		static int guessCounter = -1;
		
		public static void runGame()
			{
				String[] correctWord = WordPick.splitWord();
				for (int i = 0; i < 6; i++)
					{
						String[] guess = takeGuess();
						displayGuess(guess, correctWord);
						boolean won = winCheck(guess, correctWord);
						if (won == true)
							{
								i = 6;
							}
						else
							{
								continue;
							}
					}
			}
		
		public static String[] takeGuess()
		{
			Scanner userStringInput = new Scanner(System.in);
			boolean noGuess = true;
			String guess = "";
			while (noGuess)
			{
				guess = userStringInput.nextLine();
				if (guess.length() > 5)
					{
						System.out.println("Please guess a word with 5 letters.");
					}
				else if (guess.length() < 5)
					{
						System.out.println("Please guess a word with 5 letters.");
					}
				else
					{
						noGuess = false;
					}
			}
			String[] guessSplit = guess.split("");
			guessCounter++;
			return guessSplit;
		}
		
		public static void displayGuess(String[] guess, String[] correctWord)
		{
			
			String correctWordStr = String.join("", correctWord);
			for (int i = 0; i < 5; i++)
				{
					Display.grid[guessCounter][i] = guess[i]; 
				}
			
			for (int i = 0; i < 5; i++)
				{
					if (guess[i].equals(correctWord[i]))
						{
							Display.colorGrid[guessCounter][i] = "1";
						}
					else if (correctWordStr.contains(guess[i]))
						{
							Display.colorGrid[guessCounter][i] = "2";
						}
					else
						{
							Display.colorGrid[guessCounter][i] = "0";
						}
				}
			
			Display.displayBoard();
		}
		
		
		public static boolean winCheck(String[] guessArray, String[] correctWordArray)
		{
			boolean won;
			String guess = String.join("", guessArray);
			String correctWord = String.join("", correctWordArray);
			if (guess.equals(correctWord))
				{
					System.out.println("You Win!");
					won = true;
				}
			else
				{
					won = false;
				}
			return won;
		}
	}
