/**
 * @since 30th December, 2023 
 * @author Nikhil Karmakar
 * @Licence MIT
 * @version v2.0 
 * 
 * HandCricket [v2.0]: Hand Cricket in Java code...
 * Explain :
 * This project simulates a hand cricket match between a player and a computer. 
 * It helps beginners learn Java through interactive gameplay, covering key concepts like 
 * object-oriented programming, control structures, user input, and randomization. 
 * Players can choose to bat or bowl, score runs, and play multiple matches, 
 * making it an engaging way to practice coding skills.
 * 
 * Update :
 * First Version (v1.0): Was very basic 
 * v2.0 : Is same as early but now the flow & way of write code is changed.
 * 
 * Flow of the Program :
 * 1. Ask for the player's name.
 * 2. Call `setupMatch()` to initiate the game.
 * 3. Handle the toss and determine who bats first.
 * 4. Alternate between player and computer turns to score runs.
 * 5. Display results after the match and ask if the player wants to play again.
 * 
 * 
 * Code Flow & Explain funtions :
 * 1. `getPlayerInfo()` : Prompts the user to enter their name.
 * 2. `setupMatch()` : Initializes the match by determining the toss and setting up the batting/bowling order.
 * 3. `playerBatting(int targetScore)` : Manages the player's batting turn, including score input and checking for outs.
 * 4. `computerBatting(int targetScore)` : Handles the computer's batting turn, processing computer runs and outs.
 * 5. `displayScores()` : Displays the scores at the end of the match and prompts the player to play again.
 * 6. `askToPlayAgain()` : Asks the player if they want to play another game, restarting the match if they agree.
 */

package HandCricket;

import java.util.Scanner;

public class main {
    private Scanner scanner;
    private int playerWins, computerWins;
    private final int balls;
    private final int over = 6;
    private String playerName;

    // Constructor for initialization
    public main() {
        scanner = new Scanner(System.in);
        playerWins = 0;
        computerWins = 0;
        balls = 1 * over; // Default match overs
    }

    // Generates random runs for the computer (1 to 6)
    private int generateComputerRuns() {
        int computerRuns;
        do {
            computerRuns = (int) (Math.random() * 7);
        } while (computerRuns == 0); // Ensure run is between 1 and 6
        return computerRuns;
    }

    // Generates random toss (0 or 1)
    private int generateToss() {
        return (int) (Math.random() * 1000) % 2;
    }

    // Fetches player information
    public void getPlayerInfo() {
        System.out.println("_________________________________________________________");
        System.out.print("Enter your player name: ");
        playerName = scanner.next();
        System.out.println("_________________________________________________________\n");
    }

    // Toss and setup for the match
    public void setupMatch() {
        int computerToss = generateToss();

        System.out.println("Odd or Even to decide batting or bowling.");
        System.out.print("Enter your value (1 for Odd, 2 for Even): ");
        int playerChoice = scanner.nextInt();

        // Keep generating toss until a decision is made
        while (computerToss % 2 == playerChoice % 2) {
            computerToss = generateToss();
        }

        int sum = playerChoice + computerToss;
        boolean playerWonToss = (sum % 2 == playerChoice % 2);

        if (playerWonToss) {
            System.out.println("\nYou won the toss!");
            System.out.println("1. Batting\n2. Bowling");
            System.out.print("Enter your choice: ");
            playerChoice = scanner.nextInt();

            if (playerChoice == 1) {
                playerBatting(0);
            } else if (playerChoice == 2) {
                computerBatting(0);
            } else {
                System.out.println("Error: Invalid choice.");
            }

        } else {
            System.out.println("\nComputer won the toss!");
            if (generateToss() == 0) {
                System.out.println("Computer chose to bat.");
                computerBatting(0);
            } else {
                System.out.println("Computer chose to bowl.");
                playerBatting(0);
            }
        }
    }

    // Computer's batting turn
    private void playerBatting(int targetScore) {
        int playerScore = 0;
        boolean isChasing = targetScore > 0; // Check if the player is chasing a target
        int target = targetScore + 1;

        if (isChasing) {
            System.out.println("Your target is: " + target);
        }

        System.out.println("\nYou are batting!");
        for (int i = 0; i < 6 * balls; i++) {
            System.out.print("Enter your shot (1 to 6): ");
            int playerThrownRuns = scanner.nextInt();

            if (playerThrownRuns > 6 || playerThrownRuns < 1) {
                System.out.println("Invalid input. Enter a number between 1 and 6.");
                i--; // Skip current iteration due to invalid input
                continue;
            }

            int compThrownRuns = generateComputerRuns();
            System.out.println("Computer bowls: " + compThrownRuns);

            // Out if the player's thrown runs equal the computer's thrown runs
            if (playerThrownRuns == compThrownRuns) {
                System.out.println("Wicket! You're out.");
                break;
            }

            playerScore += playerThrownRuns;

            // Check if the player wins when chasing
            if (isChasing && playerScore >= target) {
                System.out.println("You won the match!");
                playerWins++;
                displayScores();
                return;
            }
        }

        System.out.println(playerName + "'s total score: " + playerScore);

        // If this was the first innings, computer bats next
        if (!isChasing) {
            computerBatting(playerScore);
        } else {
            // If this was the second innings, display the final results
            if (playerScore < target) {
                System.out.println("Computer won the match!");
                computerWins++;
            }
            displayScores();
        }
    }

    private void computerBatting(int targetScore) {
        int computerScore = 0;
        boolean isChasing = targetScore > 0; // Check if the computer is chasing a target
        int target = targetScore + 1;

        if (isChasing) {
            System.out.println("Computer's target is: " + target);
        }

        System.out.println("\nComputer is batting!");
        for (int i = 0; i < 6 * balls; i++) {
            System.out.print("Throw your ball (1 to 6): ");
            int playerThrownRuns = scanner.nextInt();

            if (playerThrownRuns > 6 || playerThrownRuns < 1) {
                System.out.println("Invalid input. Computer gets 2 extra runs.");
                computerScore += 2;
                continue;
            }

            int compThrownRuns = generateComputerRuns();
            System.out.println("Computer hits: " + compThrownRuns);

            // Out if the computer's thrown runs equal the player's thrown runs
            if (playerThrownRuns == compThrownRuns) {
                System.out.println("Wicket! Computer is out.");
                break;
            }

            computerScore += compThrownRuns;

            // Check if the computer wins when chasing
            if (isChasing && computerScore >= target) {
                System.out.println("Computer won the match!");
                computerWins++;
                displayScores();
                return;
            }
        }

        System.out.println("Computer's total score: " + computerScore);

        // If this was the first innings, player bats next
        if (!isChasing) {
            playerBatting(computerScore);
        } else {
            // If this was the second innings, display the final results
            if (computerScore < target) {
                System.out.println(playerName + " won the match!");
                playerWins++;
            }
            displayScores();
            askToPlayAgain();
        }
    }

    // Displays the scores after each game
    private void displayScores() {
        System.out.println("_________________________________________________________\n");
        System.out.println("\n\n--- Game Over ---");
        System.out.println(playerName + "'s total wins: " + playerWins);
        System.out.println("Computer's total wins: " + computerWins);
        System.out.println("_________________________________________________________\n");
    }

    private void askToPlayAgain() {
        System.out.print("Do you want to play another game? (yes/no): ");
        String response = scanner.next().trim().toLowerCase();

        if (response.equals("yes") || response.equals("y")) {
            setupMatch(); // Start a new match
        } else if (response.equals("yes") || response.equals("y")) {
            System.out.println("Thanks for playing!");
            scanner.close(); // Close the scanner when done

        } else {
            System.out.println("ErrorType : Invalid Choice !");
            scanner.close(); // Close the scanner when done
        }
    }

    public static void main(String[] args) {
        main game = new main();
        game.getPlayerInfo();
        game.setupMatch();
    }
}
