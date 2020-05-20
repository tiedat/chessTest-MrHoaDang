import java.util.Scanner;

public class Game {
    private int setColumn(char column) {
        switch (column) {
            case 'a':
                return 0;
            case 'b':
                return 1;
            case 'c':
                return 2;
            case 'd':
                return 3;
            case 'e':
                return 4;
            case 'f':
                return 5;
            case 'g':
                return 6;
            case 'h':
                return 7;
            default:
                return 8;

        }
    }

    public static void main(String[] args) {
        Bishop bishop1 = new Bishop();
        Game game = new Game();

        Scanner input = new Scanner(System.in);

        System.out.println("Enter present position bishop");
        String nowPosition = input.nextLine();

        char nowColumnChar = nowPosition.charAt(0);
        int nowColumn = game.setColumn(nowColumnChar);
        int nowRow = Integer.parseInt(nowPosition.substring(1)) - 1;

        bishop1.setX(nowColumn);
        bishop1.setY(nowRow);


        System.out.println("Enter next position bishop");
        String nextPosition = input.nextLine();
        char nextColumnChar = nextPosition.charAt(0);
        int nextColumn = game.setColumn(nextColumnChar);
        int nextRow = Integer.parseInt(nextPosition.substring(1)) - 1;

        boolean isValid = bishop1.isValid(nowColumn, nowRow, nextColumn, nextRow);
        System.out.println("Movement is: " + isValid);

    }
}
