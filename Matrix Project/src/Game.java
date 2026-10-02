import java.util.Scanner;
public class Game
	{
		static int guessCounter = -1;
		public static final String GREEN = "\u001B[30;42m";
		public static final String YELLOW = "\u001B[30;43m";
		public static final String GREY = "\u001B[30;100m";
		public static final String RESET = "\u001B[0m";
		public static void runGame()
			{
				String correctWord = WordPick.pickWord();
				boolean won = false;
				for (int i = 0; i < 6; i++)
					{
						String[] guess = takeGuess();
						displayGuess(guess, correctWord);
						won = winCheck(guess, correctWord);
						if (won == true)
							{
								i = 6;
							}
						else
							{
								continue;
							}
					}
				if (won == false)
					{
						System.out.println("You Lose!");
						System.out.println("The word was " + correctWord);
					}
			}
		
		public static String[] takeGuess()
		{
			Scanner userStringInput = new Scanner(System.in);
			boolean noGuess = true;
			boolean realGuess = false;
			String guess = "";
			String[] guessSplit = new String[5];
			while (noGuess)
			{
				guess = userStringInput.nextLine();
				guessSplit = guess.split("");
				for (int i = 0; i < WordList.splitList().length; i++)
					{
						if (WordList.splitList()[i].contains(guess))
							{
								realGuess = true;
								i = WordList.splitList().length + 1;
							}
						else 
							{
								realGuess = false;
							}
					}
				if (guess.length() > 5)
					{
						System.out.println("Please guess a word with 5 letters.");
					}
				else if (guess.length() < 5)
					{
						System.out.println("Please guess a word with 5 letters.");
					}
				else if (realGuess == false)
					{
						System.out.println("That word isn't isn't in the word list.");
					}
				else
					{
						noGuess = false;
					}
			}
			
			guessCounter++;
			return guessSplit;
		}
		
		public static void displayGuess(String[] guess, String correctWord)
		{
			String[] correctSplit = correctWord.split("");
			String correctWordStr = String.join("", correctWord);
			for (int i = 0; i < 5; i++)
				{
					Display.grid[guessCounter][i] = guess[i]; 
				}
			
			for (int i = 0; i < 5; i++)
				{
					if (guess[i].equals(correctSplit[i]))
						{
							
							Display.grid[guessCounter][i] = (GREEN + guess[i] + RESET); 
							
						}
					else if (correctWordStr.contains(guess[i]))
						{
							
							Display.grid[guessCounter][i] = (YELLOW + guess[i] + RESET); 
						}
					else
						{
							
							Display.grid[guessCounter][i] = (GREY + guess[i] + RESET); 
						}
				}
			
			Display.displayBoard();
		}
		
		
		public static boolean winCheck(String guessArray[], String correctWord)
		{
			boolean won;
			String guess = String.join("", guessArray);
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
