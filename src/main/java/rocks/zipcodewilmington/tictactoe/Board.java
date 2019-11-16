package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    public Character[][] board;


    public Board(Character[][] matrix) {
        this.board = matrix;
    }

    public Boolean checkVerticalWin(Character OX) {

        for (int i = 0; i <= 2; i++) {
            if ((board[i][0] == OX && board[i][1] == OX && board[i][2] == OX)) {
                return true;
            }

        }
        return false;
    }

    public Boolean checkHorizontalWin(Character OX) {

        for (int i = 0; i <= 2; i++) {
            if ((board[0][i] == OX && board[1][i] == OX && board[2][i] == OX)) {
                return true;
            }

        }
        return false;
    }

    public Boolean checkDiagonalWin(Character OX) {
        if ((board[0][0] == OX && board[1][1] == OX && board[2][2] == OX) || (board[2][0] == OX && board[1][1] == OX && board[0][2] == OX)) {
            return true;
        }

        return false;
    }

    public Boolean isInFavorOfX() {
        if (checkVerticalWin('X') || checkHorizontalWin('X') || checkDiagonalWin('X')) {

            return true;
        }
        return false;
    }

    public Boolean isInFavorOfO() {

        if (checkVerticalWin('O') || checkHorizontalWin('O') || checkDiagonalWin('O')) {

            return true;
        }
        return false;
    }


    public Boolean isTie() {
        if (!isInFavorOfO() && !isInFavorOfX()) {
            return true;
        }
        return false;
    }

    public String getWinner() {
        if (isInFavorOfX()) {
            return "X";
        } else if (isInFavorOfO()) {

            return "O";
        }
        return "";
    }
}

