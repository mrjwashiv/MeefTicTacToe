import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String rounds = "Y";
        int Player1wins = 0;
        int Player2wins = 0;
        System.out.println("First Player?");
        String FirstPlayer = scan.nextLine();

        System.out.println("Second Player?");
        String SecPlayer = scan.nextLine();

        while (rounds.equals("Y")) {

            int ROWS = 1;
            int COLS = 3;
            int repeats = 9;

            String[][] board = new String[ROWS][COLS];
            String[] Spaces = new String[9];
            int i = 0;
            Spaces[0] = "1";
            Spaces[1] = "2";
            Spaces[2] = "3";
            Spaces[3] = "4";
            Spaces[4] = "5";
            Spaces[5] = "6";
            Spaces[6] = "7";
            Spaces[7] = "8";
            Spaces[8] = "9";

            for (int rows = 0; rows < ROWS; rows++) {
                for (int cols = 0; cols < COLS; cols++) {
                    System.out.println("+---+---+---+");
                    for (int w = 8; w < Spaces.length; w--) {
                        if (i != 9) {
                            System.out.print("| " + Spaces[i] + " ");
                            i++;
                        }
                        if (i == 3 || i == 6 || i == 9) {
                            System.out.println("|");
                            break;
                        }
                    }
                }
            }

            System.out.print("+---+---+---+");
            System.out.println(" ");
            System.out.println("Who goes first?");
            String firstplayer = scan.next();

            while (repeats != 0) {
                if (Spaces[0].contains("X") && Spaces[1].contains("X") && Spaces[2].contains("X") ||
                        Spaces[3].contains("X") && Spaces[4].contains("X") && Spaces[5].contains("X") ||
                        Spaces[6].contains("X") && Spaces[7].contains("X") && Spaces[8].contains("X") ||
                        Spaces[0].contains("X") && Spaces[3].contains("X") && Spaces[6].contains("X") ||
                        Spaces[1].contains("X") && Spaces[4].contains("X") && Spaces[7].contains("X") ||
                        Spaces[2].contains("X") && Spaces[5].contains("X") && Spaces[8].contains("X") ||
                        Spaces[0].contains("X") && Spaces[4].contains("X") && Spaces[8].contains("X") ||
                        Spaces[2].contains("X") && Spaces[4].contains("X") && Spaces[6].contains("X")) {
                    break;
                }
                if (Spaces[0].contains("O") && Spaces[1].contains("O") && Spaces[2].contains("O") ||
                        Spaces[3].contains("O") && Spaces[4].contains("O") && Spaces[5].contains("O") ||
                        Spaces[6].contains("O") && Spaces[7].contains("O") && Spaces[8].contains("O") ||
                        Spaces[0].contains("O") && Spaces[3].contains("O") && Spaces[6].contains("O") ||
                        Spaces[1].contains("O") && Spaces[4].contains("O") && Spaces[7].contains("O") ||
                        Spaces[2].contains("O") && Spaces[5].contains("O") && Spaces[8].contains("O") ||
                        Spaces[0].contains("O") && Spaces[4].contains("O") && Spaces[8].contains("O") ||
                        Spaces[2].contains("O") && Spaces[4].contains("O") && Spaces[6].contains("O")) {
                    break;
                }
                System.out.println("Which space? (1,2,3,4,5,6,7,8,9)");
                int firstSpace = scan.nextInt();
                System.out.println("Which piece do you have?");
                String Player1piece = scan.next();
                Spaces[firstSpace - 1] = Player1piece;
                repeats--;

                for (int rows = 0; rows < ROWS; rows++) {
                    i = 0;
                    for (int cols = 0; cols < COLS; cols++) {
                        System.out.println("+---+---+---+");
                        for (int w = 8; w < Spaces.length; w--) {
                            if (i != 9) {
                                System.out.print("| " + Spaces[i] + " ");
                                i++;
                            }
                            if (i == 3 || i == 6 || i == 9) {
                                System.out.println("|");
                                break;
                            }
                        }
                    }
                    System.out.println("+---+---+---+");
                    if (Spaces[0].contains("X") && Spaces[1].contains("X") && Spaces[2].contains("X") ||
                            Spaces[3].contains("X") && Spaces[4].contains("X") && Spaces[5].contains("X") ||
                            Spaces[6].contains("X") && Spaces[7].contains("X") && Spaces[8].contains("X") ||
                            Spaces[0].contains("X") && Spaces[3].contains("X") && Spaces[6].contains("X") ||
                            Spaces[1].contains("X") && Spaces[4].contains("X") && Spaces[7].contains("X") ||
                            Spaces[2].contains("X") && Spaces[5].contains("X") && Spaces[8].contains("X") ||
                            Spaces[0].contains("X") && Spaces[4].contains("X") && Spaces[8].contains("X") ||
                            Spaces[2].contains("X") && Spaces[4].contains("X") && Spaces[6].contains("X")) {
                        System.out.println("Congrats " + FirstPlayer);
                        Player1wins++;
                        break;
                    }
                    if (Spaces[0].contains("O") && Spaces[1].contains("O") && Spaces[2].contains("O") ||
                            Spaces[3].contains("O") && Spaces[4].contains("O") && Spaces[5].contains("O") ||
                            Spaces[6].contains("O") && Spaces[7].contains("O") && Spaces[8].contains("O") ||
                            Spaces[0].contains("O") && Spaces[3].contains("O") && Spaces[6].contains("O") ||
                            Spaces[1].contains("O") && Spaces[4].contains("O") && Spaces[7].contains("O") ||
                            Spaces[2].contains("O") && Spaces[5].contains("O") && Spaces[8].contains("O") ||
                            Spaces[0].contains("O") && Spaces[4].contains("O") && Spaces[8].contains("O") ||
                            Spaces[2].contains("O") && Spaces[4].contains("O") && Spaces[6].contains("O")) {
                        System.out.println("Congrats " + SecPlayer);
                        Player2wins++;
                        break;
                    }
                }
            }
            System.out.println(FirstPlayer + " wins " + Player1wins);
            System.out.println(SecPlayer + " wins " + Player2wins);
            System.out.println("Wanna play again? (Y/N)");
            rounds = scan.next();
            if(rounds.equals("N")){
                break;
            }
        }
    }
}

