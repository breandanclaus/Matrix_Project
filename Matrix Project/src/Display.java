
public class Display
	{
		static String[][] grid = new String[6][5];
		static String[][] colorGrid = new String[6][5];
		public static void prepareBoard()
		{
			for (int row = 0; row < grid.length; row++)
				{
					for (int col = 0; col < grid[0].length; col++)
						{
							grid [row][col] = " ";
						}
				}
			
			for (int row = 0; row < colorGrid.length; row++)
				{
					for (int col = 0; col < colorGrid[0].length; col++)
						{
							colorGrid [row][col] = " ";
						}
				}
		}

		public static void displayBoard()
			{
				System.out.println("-----------");
				System.out.println("|" + grid [0][0] + "|" + grid [0][1] + "|" + grid [0][2] + "|" + grid [0][3] + "|" + grid [0][4] + "|");
				System.out.println("|" + colorGrid [0][0] + "|" + colorGrid [0][1] + "|" + colorGrid [0][2] + "|" + colorGrid [0][3] + "|" + colorGrid [0][4] + "|");
				System.out.println("-----------");
				System.out.println("|" + grid [1][0] + "|" + grid [1][1] + "|" + grid [1][2] + "|" + grid [1][3] + "|" + grid [1][4] + "|");
				System.out.println("|" + colorGrid [1][0] + "|" + colorGrid [1][1] + "|" + colorGrid [1][2] + "|" + colorGrid [1][3] + "|" + colorGrid [1][4] + "|");
				System.out.println("-----------");
				System.out.println("|" + grid [2][0] + "|" + grid [2][1] + "|" + grid [2][2] + "|" + grid [2][3] + "|" + grid [2][4] + "|");
				System.out.println("|" + colorGrid [2][0] + "|" + colorGrid [2][1] + "|" + colorGrid [2][2] + "|" + colorGrid [2][3] + "|" + colorGrid [2][4] + "|");
				System.out.println("-----------");
				System.out.println("|" + grid [3][0] + "|" + grid [3][1] + "|" + grid [3][2] + "|" + grid [3][3] + "|" + grid [3][4] + "|");
				System.out.println("|" + colorGrid [3][0] + "|" + colorGrid [3][1] + "|" + colorGrid [3][2] + "|" + colorGrid [3][3] + "|" + colorGrid [3][4] + "|");
				System.out.println("-----------");
				System.out.println("|" + grid [4][0] + "|" + grid [4][1] + "|" + grid [4][2] + "|" + grid [4][3] + "|" + grid [4][4] + "|");
				System.out.println("|" + colorGrid [4][0] + "|" + colorGrid [4][1] + "|" + colorGrid [4][2] + "|" + colorGrid [4][3] + "|" + colorGrid [4][4] + "|");
				System.out.println("-----------");
				System.out.println("|" + grid [5][0] + "|" + grid [5][1] + "|" + grid [5][2] + "|" + grid [5][3] + "|" + grid [5][4] + "|");
				System.out.println("|" + colorGrid [5][0] + "|" + colorGrid [5][1] + "|" + colorGrid [5][2] + "|" + colorGrid [5][3] + "|" + colorGrid [5][4] + "|");
				System.out.println("-----------");
			}
		
		
	}
