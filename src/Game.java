import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Bishop bishop1 = new Bishop();
        Game game = new Game();

        Scanner input = new Scanner(System.in);

        System.out.println("Enter present position bishop");
        String nowPosition = input.nextLine();

        char nowColumnChar = nowPosition.charAt(0);
        int nowColumn = nowColumnChar - 97;
        int nowRow = Integer.parseInt(nowPosition.substring(1)) - 1;

        bishop1.setX(nowColumn);
        bishop1.setY(nowRow);


        System.out.println("Enter next position bishop");
        String nextPosition = input.nextLine();
        char nextColumnChar = nextPosition.charAt(0);
        int nextColumn = nextColumnChar - 97;
        int nextRow = Integer.parseInt(nextPosition.substring(1)) - 1;

        boolean isValid = bishop1.isValid(nowColumn, nowRow, nextColumn, nextRow);
        System.out.println("Movement is: " + isValid);

    }
}
