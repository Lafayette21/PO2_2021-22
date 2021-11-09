import java.lang.reflect.Array;
import java.util.Random;

public class LiveGame {
    private byte[][] board;
    private int xlabel;
    private int ylabel;
    private int steps;

    // creates random board
    private void randomDistribution() {
        Random rnd = new Random();
        for (int i = 0; i < xlabel; i++) {
            for (int j = 0; j < ylabel; j++) {
                if (rnd.nextBoolean() == true) {
                    board[i][j] = 1;
                } else {
                    board[i][j] = 0;
                }
            }
        }
    }

    // creates "boat" distribution
    private void boat(int middleX, int middleY) {
        board[middleY - 1][middleX - 1] = 1;
        board[middleY - 1][middleX] = 1;

        board[middleY][middleX - 1] = 1;
        board[middleY][middleX + 1] = 1;

        board[middleY + 1][middleX] = 1;
    }

    // creates "blinker" distribution
    private void blinker(int middleX, int middleY) {
        board[middleY - 1][middleX] = 1;
        board[middleY][middleX] = 1;
        board[middleY + 1][middleX] = 1;
    }

    // creates "spaceship" distribution
    private void spaceship(int middleX, int middleY) {
        board[middleY - 1][middleX + 1] = 1;
        board[middleY - 1][middleX] = 1;
        board[middleY - 1][middleX - 1] = 1;

        board[middleY][middleX - 1] = 1;

        board[middleY + 1][middleX] = 1;
    }

    // Constructor
    public LiveGame(int size_x, int size_y, int step, int preset) {
        xlabel = size_x;
        ylabel = size_y;
        steps = step;
        board = new byte[xlabel][ylabel];

        if (preset == 0) {
            randomDistribution();
        }
        if (preset == 1) {
            boat(xlabel / 2, ylabel / 2);
        }
        if (preset == 2) {
            blinker(xlabel / 2, ylabel / 2);
        }
        if (preset == 3) {
            spaceship(xlabel / 2, ylabel / 2);
        }
    }

    // Copying of board
    private byte[][] copyBoard(byte[][] board1, int xSize, int ySize) {
        byte[][] help = new byte[xSize][ySize];
        for (int i = 0; i < xSize; i++) {
            for (int j = 0; j < ySize; j++) {
                help[i][j] = board1[i][j];
            }
        }
        return help;

    }

    // printing byte[][] tab
    private void printTab(byte[][] b1, int xSize, int ySize) {
        for (int i = 0; i < xlabel; i++) {
            for (int j = 0; j < ylabel; j++) {
                if (b1[i][j] == 1) {
                    System.out.print("X ");
                } else {
                    System.out.print("O ");
                }
            }
            System.out.println();
        }
    }

    // Method to print board using private printTab method
    public void printBoard() {
        printTab(this.board, xlabel, ylabel);
    }

    // Counting alive neighbours next to x and y field
    public int countNeighbours(int x, int y) {
        int count = 0;
        // Left upper corner
        if (x == 0 && y == 0) {
            count = board[0][1] + board[1][1] + board[1][0];
        }
        // right upper corner
        else if (x == 0 && y == ylabel - 1) {
            count = board[0][ylabel - 2] + board[1][ylabel - 2] + board[1][ylabel - 1];
        }
        // left down corner
        else if (x == xlabel - 1 && y == 0) {
            count = board[xlabel - 2][0] + board[xlabel - 1][1] + board[xlabel - 2][1];
        }
        // rigth down corner
        else if (x == xlabel - 1 && y == ylabel - 1) {
            count = board[xlabel - 1][ylabel - 2] + board[xlabel - 2][ylabel - 2] + board[xlabel - 2][ylabel - 1];
        }
        // row 0
        else if (x == 0) {
            for (int i = x; i <= x + 1; i++) {
                for (int j = y - 1; j <= y + 1; j++) {
                    if (board[i][j] == 1 && !(i == x && j == y)) {
                        count++;
                    }
                }
            }
        }
        // column 0
        else if (y == 0) {
            for (int i = x - 1; i <= x + 1; i++) {
                for (int j = y; j <= y + 1; j++) {
                    if (board[i][j] == 1 && !(i == x && j == y)) {
                        count++;
                    }
                }
            }
        }
        // last row
        else if (x == xlabel - 1) {
            for (int i = x - 1; i <= x; i++) {
                for (int j = y - 1; j <= y + 1; j++) {
                    if (board[i][j] == 1 && !(i == x && j == y)) {
                        count++;
                    }
                }
            }
        }
        // last column
        else if (y == ylabel - 1) {
            for (int i = x - 1; i <= x + 1; i++) {
                for (int j = y - 1; j <= y; j++) {
                    if (board[i][j] == 1 && !(i == x && j == y)) {
                        count++;
                    }
                }
            }
        }
        // Rest
        else {
            for (int i = x - 1; i <= x + 1; i++) {
                for (int j = y - 1; j <= y + 1; j++) {
                    if (board[i][j] == 1 && !(i == x && j == y)) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    // symulation of Game
    public void play() {

        byte[][] help;
        for (int k = 0; k < steps; k++) {
            help = copyBoard(this.board, xlabel, ylabel);
            System.out.println("\n------ " + (k + 1) + " ------\n");
            for (int i = 0; i <= xlabel - 1; i++) {
                for (int j = 0; j <= ylabel - 1; j++) {
                    if (this.countNeighbours(i, j) == 3) {
                        help[i][j] = 1;
                    } else {
                        help[i][j] = 0;
                    }
                }
            }
            printTab(help, xlabel, ylabel);
            board = copyBoard(help, xlabel, ylabel);
        }

    }

}