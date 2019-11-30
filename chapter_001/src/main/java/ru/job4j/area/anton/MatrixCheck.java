package ru.job4j.area.anton;

/**
 * Класс MatrixCheck. Арифметические операции. Вывод результатов в консоль.
 *
 * @author Anton Sipin (anton.sipin@gmail.com)
 */
public class MatrixCheck {
    public static boolean isWin(char[][] board) {
        boolean result = true;
        for (int row = 1; row < board.length; row++) {
            for (int column = 1; column < board.length; column++) {
                char sign = board[row][column];
                System.out.print(sign);
                char hasWinVertical = board[row - 1][column];
                char hasWinHor = board[row][column - 1];
                if (hasWinVertical != sign && hasWinHor != sign) {
                    result = false;
                    break;
                }
            }
            System.out.println();
        }
        return result;
    }

    /**
     * Метод Main.
     *
     * @param args - аргументы метода.
     */
    public static void main(String[] args) {
        char[][] hasWinVertical = {
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
        };
        boolean win = isWin(hasWinVertical);
        System.out.println("A board has a winner : " + win);
        System.out.println();
        char[][] hasWinHor = {
                {'_', '_', '_', '_', '_'},
                {'X', 'X', 'X', 'X', 'X'},
                {'_', '_', '_', '_', '_'},
                {'_', '_', '_', '_', '_'},
                {'_', '_', '_', '_', '_'},
        };
        boolean winHor = isWin(hasWinHor);
        System.out.println("A board has a winner : " + winHor);
        System.out.println();
        char[][] notWin = {
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', 'X', '_', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
        };
        boolean lose = isWin(notWin);
        System.out.println("A board has a winner : " + lose);
    }
}
