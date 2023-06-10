package test;

import game.Cell;

public class testCellConstructor {

	public static void main(String[] args) {
		
		int boardSize = 7;
		int startupSize = 3;
		int n = 50;					//number of tests
		int i = 1;
		boolean testResult = true;
		Cell cell = null;
		while (i <= n & testResult) {
			cell = new Cell(boardSize, startupSize);
			System.out.println(cell);
			testResult = verticalOK(cell) && horizontalOK(cell);
			i++;
		}
		if(testResult) {
			System.out.println("Test passed");
		} else {
			System.out.println("Test failed");
			System.out.println("Cell " + cell + " out of range");
		}

	}
	
	public static boolean verticalOK(Cell cell) {
		return ((cell.getVertical() >= 0) && (cell.getVertical() <= cell.getBoardSize() - cell.getStartupSize()));
	}
	
	public static boolean horizontalOK(Cell cell) {
		return ((cell.getHorizontal() >= 0) && (cell.getHorizontal() <= cell.getBoardSize()));
	}

}
