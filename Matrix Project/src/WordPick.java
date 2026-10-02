
public class WordPick
	{
		
		
		public static String pickWord()
		{
			int wordNumber = (int) (Math.random() * WordList.splitList().length);
			String chosenWord = WordList.splitList()[wordNumber];
			return chosenWord;
		}

	}
