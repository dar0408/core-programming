// Rock-Paper-Scissors is a game played between a minimum of two players. Each player can choose either rock, paper, or scissors. Here the game is played between a user and a computer. Based on the rules, either a player or a computer will win. Show the stats of player and computer win in a tabular format across multiple games. Also, show the winning percentage between the player and the computer.

import java.util.Scanner;

public class RockPaper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of games: ");
        int games = sc.nextInt();
        String[][] stats = playGame(games);
        displayStats(stats);
    }

    public static String[][] playGame(int games) {
        String[] choices = {"Rock", "Paper", "Scissors"};
        String[][] stats = new String[games][3];
        int playerWins = 0;
        int computerWins = 0;
        for (int i = 0; i < games; i++) {
            int playerChoice = getPlayerChoice();
            int computerChoice = getComputerChoice();
            String winner = findWinner(choices[playerChoice], choices[computerChoice]);
            if (winner.equals("Player")) {
                playerWins++;
            } else if (winner.equals("Computer")) {
                computerWins++;
            }
            stats[i][0] = choices[playerChoice];
            stats[i][1] = choices[computerChoice];
            stats[i][2] = winner;
        }
        stats[games - 1][0] = "Player Wins: " + playerWins;
        stats[games - 1][1] = "Computer Wins: " + computerWins;
        stats[games - 1][2] = "Player Win Percentage: " + (playerWins * 100 / games) + "%";
        return stats;
    }

    public static int getPlayerChoice() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice (0 for Rock, 1 for Paper, 2 for Scissors): ");
        return sc.nextInt();
    }

    public static int getComputerChoice() {
        return (int) (Math.random() * 3);
    }

    public static String findWinner(String playerChoice, String computerChoice) {
        if (playerChoice.equals("Rock") && computerChoice.equals("Scissors")) {
            return "Player";
        } else if (playerChoice.equals("Scissors") && computerChoice.equals("Paper")) {
            return "Player";
        } else if (playerChoice.equals("Paper") && computerChoice.equals("Rock")) {
            return "Player";
        } else if (playerChoice.equals(computerChoice)) {
            return "Draw";
        } else {
            return "Computer";
        }
    }

    public static void displayStats(String[][] stats) {
        System.out.println("Player\tComputer\tWinner");
        for (int i = 0; i < stats.length - 1; i++) {
            System.out.println(stats[i][0] + "\t" + stats[i][1] + "\t" + stats[i][2]);
        }
        System.out.println(stats[stats.length - 1][0]);
        System.out.println(stats[stats.length - 1][1]);
        System.out.println(stats[stats.length - 1][2]);
    }
}


// Hint => 
// The rule is: rock-scissors: rock will win (rock crushes scissors); rock-paper: paper wins (paper covers rock); scissors-paper: scissors win (scissors cuts paper)
// Create a Method to find the Computer Choice using the Math.random
// Create a Method to find the winner between the user and the computer
// Create a Method to find the average and percentage of wins for the user and the computer and return a String 2D array
// Create a Method to display the results of every game and also display the average and percentage wins 
// In the main take user input for the number of games and call methods to display results

