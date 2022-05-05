package gameboard.model.material.hashmap;

import java.util.HashMap;
import java.util.Map;

import gameboard.model.material.Constants;
import gameboard.model.material.Disc;
import gameboard.model.material.IGameBoard;
import gameboard.model.material.Position;

public class GameBoardHashMap implements IGameBoard {

	private final Map<Position, Disc> discs;

	public GameBoardHashMap() {
		this.discs = new HashMap<>();
	}

	public Map<Position, Disc> discs() {
		return discs;
	}

	public boolean isDiscAt(Position position) {
		return (this.discs.get(position)!=null);
	}

	public boolean isEmpty() {
		return true;
		// TODO : one line instruction : see javadoc ;-)
	}

	public boolean put(Position position, Disc disc) {
		return false;
		// TODO
	}

	public void clear() {
		// TODO : one line instruction : see javadoc ;-)
	}

	public int howManyDiscsOnBoard() {
		return 0;
		// TODO : one line instruction : see in javadoc ;-)
	}

	public Disc discAt(Position position) {
		return null;
		// TODO : one line instruction : see in javadoc ;-)
	}

	public Disc removeDiscAt(Position position) {
		return null;
		// TODO : one line instruction : see in javadoc ;-)
	}

	public String toAscii() {
		return "";
		// TODO
	}

}