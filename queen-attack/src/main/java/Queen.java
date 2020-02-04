import java.util.Optional;

public class Queen {
	Integer currentRow;
	Integer currentCol;

	public Queen(Integer currentRow, Integer col) {
		validatePosition(currentRow,col);
		this.currentRow = currentRow;
		this.currentCol = col;
	}
    public void validatePosition(Integer currentRow, Integer currentCol){
			Optional.of(currentCol)
				.filter(r->r<=7)
				.orElseThrow(()-> new IllegalArgumentException("Queen position must have column <= 7."));
		Optional.of(currentRow)
				.filter(c->c<=7)
				.orElseThrow(()-> new IllegalArgumentException("Queen position must have row <= 7."));
		Optional.of(currentRow)
				.filter(r->r>=0)
				.orElseThrow(()-> new IllegalArgumentException("Queen position must have positive row."));
		Optional.of(currentCol)
				.filter(r->r>=0)
				.orElseThrow(()-> new IllegalArgumentException("Queen position must have positive column."));
    }
	public Integer getCurrentRow() {
		return currentRow;
	}

	public void setCurrentRow(Integer currentRow) {
		this.currentRow = currentRow;
	}

	public Integer getCurrentCol() {
		return currentCol;
	}

	public void setCurrentCol(Integer currentCol) {
		this.currentCol = currentCol;
	}
}