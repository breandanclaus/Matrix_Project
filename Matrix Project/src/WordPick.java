
public class WordPick
	{
		
		public static String[] splitWord()
		{
			String wordPick = pickWord();
			String[] word = wordPick.split("");
			return word;
		}
		
		public static String pickWord()
		{
			int wordNumber = (int) (Math.random() * 40) + 1;
			String chosenWord = WordList.splitList()[wordNumber];
			System.out.println(chosenWord);
			return chosenWord;
		}

	}
