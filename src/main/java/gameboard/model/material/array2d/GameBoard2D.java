package gameboard.model.material.array2d;

import gameboard.model.material.Constants;
import gameboard.model.material.Disc;
import gameboard.model.material.IGameBoard;
import gameboard.model.material.Position;

public class GameBoard2D implements IGameBoard {

	Disc[][] discs;

	public GameBoard2D() {
		this.discs = new Disc[Constants.ROWS][Constants.COLUMNS];
	}

	public Disc[][] discs() {
		return discs;
	}

	@Override
	public boolean isDiscAt(Position position) {
		return true;
		// TODO
	}

	@Override
	public boolean isEmpty() {
		return false;
		// TODO
	}

	@Override
	public boolean put(Position position, Disc disc) {
		return false;
		// TODO
	}

	@Override
	public void clear() {
		// TODO
	}

	@Override
	public int howManyDiscsOnBoard() {
		return 0;
		// TODO
	}

	@Override
	public Disc discAt(Position position) {
		return null;
		// TODO
	}

	@Override
	public Disc removeDiscAt(Position position) {
		return null;
		// TODO
	}

	@Override
	public String toAscii() {
		return "";
		// TODO
	}
}
