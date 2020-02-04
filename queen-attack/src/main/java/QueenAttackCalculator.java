

public class QueenAttackCalculator {
    Queen queen1;
    Queen queen2;

    public QueenAttackCalculator(Queen queen1, Queen queen2) {
        validateQueens(queen1,queen2);
        this.queen1 = queen1;
        this.queen2 = queen2;
    }
    public void validateQueens(Queen queen1, Queen queen2){
        if (queen1==null || queen2==null){
        throw new IllegalArgumentException("You must supply valid positions for both Queens.")   ;
        }
        if (queen1.currentCol.equals(queen2.currentCol)&&queen1.currentRow.equals(queen2.currentRow)){
            throw new IllegalArgumentException("Queens cannot occupy the same position.")   ;
        }

    }

    public boolean canQueensAttackOneAnother(){
        if (queen1.getCurrentRow() == queen2.getCurrentRow()  || queen1.getCurrentCol() == queen2.getCurrentCol()
                || queen1.getCurrentRow()  - queen1.getCurrentCol() == queen2.getCurrentRow()  - queen2.getCurrentCol()
                || queen1.getCurrentRow()  + queen1.getCurrentCol() == queen2.getCurrentRow()  + queen2.getCurrentCol()){
            return true;
        }
        return false;
    }
    public Queen getQueen1() {
        return queen1;
    }

    public void setQueen1(Queen queen1) {
        this.queen1 = queen1;
    }

    public Queen getQueen2() {
        return queen2;
    }

    public void setQueen2(Queen queen2) {
        this.queen2 = queen2;
    }
}