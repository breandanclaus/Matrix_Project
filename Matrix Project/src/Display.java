
public class Display
	{
		static String[][] grid = new String[6][5];
		public static void prepareBoard()
		{
			for (int row = 0; row < grid.length; row++)
				{
					for (int col = 0; col < grid[0].length; col++)
						{
							grid [row][col] = " ";
						}
				}
		}

		public static void displayBoard()
			{
				System.out.println("-----------");
				System.out.println("|" + grid [0][0] + "|" + grid [0][1] + "|" + grid [0][2] + "|" + grid [0][3] + "|" + grid [0][4] + "|");
				System.out.println("-----------");
				System.out.println("|" + grid [1][0] + "|" + grid [1][1] + "|" + grid [1][2] + "|" + grid [1][3] + "|" + grid [1][4] + "|");
				System.out.println("-----------");
				System.out.println("|" + grid [2][0] + "|" + grid [2][1] + "|" + grid [2][2] + "|" + grid [2][3] + "|" + grid [2][4] + "|");
				System.out.println("-----------");
				System.out.println("|" + grid [3][0] + "|" + grid [3][1] + "|" + grid [3][2] + "|" + grid [3][3] + "|" + grid [3][4] + "|");
				System.out.println("-----------");
				System.out.println("|" + grid [4][0] + "|" + grid [4][1] + "|" + grid [4][2] + "|" + grid [4][3] + "|" + grid [4][4] + "|");
				System.out.println("-----------");
				System.out.println("|" + grid [5][0] + "|" + grid [5][1] + "|" + grid [5][2] + "|" + grid [5][3] + "|" + grid [5][4] + "|");
				System.out.println("-----------");
			}
		
	}
