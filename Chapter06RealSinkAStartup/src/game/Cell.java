package game;

public class Cell {
	
	private int vertical;
	private int horizontal;
	private int boardSize;
	private int startupSize;
	
	public Cell(int boardSize, int startupSize) {
		this.boardSize = boardSize;
		this.startupSize = startupSize;
		int max = boardSize - startupSize;
		int min = 0;
		vertical = (int) (Math.random()*(max - min + 1)) + min;
		horizontal = (int) (Math.random()*(boardSize - 1 - min + 1)) + min;
	}

	public int getVertical() {
		return vertical;
	}

	public void setVertical(int vertical) {
		this.vertical = vertical;
	}

	public int getHorizontal() {
		return horizontal;
	}

	public void setHorizontal(int horizontal) {
		this.horizontal = horizontal;
	}
	
	public int getBoardSize() {
		return boardSize;
	}

	public void setBoardSize(int boardSize) {
		this.boardSize = boardSize;
	}

	public int getStartupSize() {
		return startupSize;
	}

	public void setStartupSize(int startupSize) {
		this.startupSize = startupSize;
	}

	@Override
	public String toString() {
		return "Cell [vertical=" + vertical + ", horizontal=" + horizontal + "]";
	}
	
	

}
