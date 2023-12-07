package minesweeper;

public class Result {
    Game game;

    public Result(Game game) {
        this.game = game;
    }


    public  boolean isAllMarkedMinesFound() {
        boolean isAllMinesMarked = true;

        for (Cell mine : game.field.minesArray) {
            if (!mine.isMarked) {
                isAllMinesMarked = false;
                break;
            }
        }

        boolean isMinesQuantity = game.markedMines == game.field.minesArray.size();
        return isAllMinesMarked && isMinesQuantity;
    }

    public boolean isNoOpenMinesLeft() {
        for (int i = 0; i < game.field.cells.length; i++) {
            for (int j = 0; j < game.field.cells.length; j++) {
                if (!game.field.cells[i][j].isOpened && !game.field.cells[i][j].isMine) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isNotGameOver() {
        return !(isAllMarkedMinesFound() || isNoOpenMinesLeft());
    }

    public boolean checkExplodes(Cell cell) {
        if (cell.isMine){
            game.field.setAllBombOpened();
            return true;
        } else {
            return false;
        }
    }
}