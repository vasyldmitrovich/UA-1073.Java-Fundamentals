package minesweeper;

import java.util.Scanner;

public class Game {
    Field field;
    Result result = new Result(this);
    int markedMines = 0;
    boolean isFirstTurn = true;
    Scanner scanner = new Scanner(System.in);

    public void start() {
        System.out.print("How many mines do you want on the field? ");
        int mines = scanner.nextInt();
        field = new Field(mines);
        field.printField();

        boolean isExploded = false;

        while (result.isNotGameOver()) {
            System.out.print("Set/unset mines marks or claim a cell as free: ");
            int col = Integer.parseInt(scanner.next()) - 1;
            int row = Integer.parseInt(scanner.next()) - 1;
            boolean commandMarkFree = scanner.next().equals("free");

            if (commandMarkFree) {
                if (isFirstTurn) {
                    field.checkFirstTurn(row, col);
                    isFirstTurn = false;
                }
                isExploded = result.checkExplodes(field.cells[row][col]);
                if (isExploded) {
                    field.printField();
                    break;
                } else {
                    field.openArea(row, col);
                }
            } else {
                markedMines += field.markCellAsMine(field.cells[row][col]);
            }
            field.printField();
        }
        if (isExploded) {
            System.out.println("You stepped on a mine and failed!");
        } else {
            System.out.println("Congratulations! You found all mines!");
        }
    }
}