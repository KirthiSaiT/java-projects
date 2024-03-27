import java.util.*;
import java.util.Random;


class Gaming {
    public String rps() {
        String[] game = {"rock", "paper", "scissor"};
        String computer = game[new Random().nextInt(game.length)];

        Scanner sc = new Scanner(System.in);
        String player;

        while (true) {
            System.out.print("Enter Your Move (rock, paper, or scissor): ");
            player = sc.nextLine();
            if (player.equalsIgnoreCase("rock") || player.equalsIgnoreCase("paper") || player.equalsIgnoreCase("scissor")) {
                break;
            }
            System.out.println("Not a valid move");
        }

        System.out.println("Computer played: " + computer);

        if (player.equalsIgnoreCase(computer)) {
            System.out.println("The game is a tie");
        } else if (player.equalsIgnoreCase("rock")) {
            if (computer.equalsIgnoreCase("paper")) {
                System.out.println("Computer wins");
            } else if (computer.equalsIgnoreCase("scissor")) {
                System.out.println("Player wins");
            }
        } else if (player.equalsIgnoreCase("scissor")) {
            if (computer.equalsIgnoreCase("rock")) {
                System.out.println("Computer wins");
            } else if (computer.equalsIgnoreCase("paper")) {
                System.out.println("Player wins");
            }
        } else if (player.equalsIgnoreCase("paper")) {
            if (computer.equalsIgnoreCase("rock")) {
                System.out.println("Player wins");
            } else if (computer.equalsIgnoreCase("scissor")) {
                System.out.println("Computer wins");
            }
        }
        return null;
    }
}


public class Main {
    public static void main(String[] args) {
        Gaming dev=new Gaming();
        dev.rps();
        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Would you like to play again? (Y/N): ");
            String again = sc.nextLine();
            if (again.equalsIgnoreCase("yes")) {
                System.out.println("Game begins now............!");

                dev.rps();

            } else if (again.equalsIgnoreCase("no")) {
                System.out.println("Thank you for playing!");
            }
        }
    }
}
