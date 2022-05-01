package gameboard.model.material;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public final class Position {

	private final Integer column;
	private final Integer row;

	public Position(Integer row, Integer column) {
		this.column = column;
		this.row = row;
	}

	public Integer row() {
		return row;
	}

	public Integer column() {
		return column;
	}

	@Override
	public String toString() {
		return row.toString() + "," + column.toString();
	}

}
