// Update on 3rd - 4th January 2024

package HandCricket;

import java.util.*;

public class main {

    Scanner scanner = new Scanner(System.in);

    // Variables For Scores & Winings
    int PLAYER_WININGS = 0;
    int COMPUTER_WININGS = 0;

    final int over = 6;
    String player_name;

    public int computerRuns() { // Computer genrated outcomes 1 - 6
        int COMPUTER_RUNS = (int) (Math.random() * 7);
        while (true) {
            if (COMPUTER_RUNS != 0)
                return COMPUTER_RUNS;
            COMPUTER_RUNS = (int) (Math.random() * 7);
        }

    }

    // Computer genrated outcomes
    public int AutoToss() {
        return (int) (Math.random() * 1000) % 2 == 0 ? 1 : 0;
    }

    public void getPlayerInfo() {
        System.out.println("\n\n_________________________________________________________\n\n");
        System.out.print("\tEntr ur player name : ");
        player_name = scanner.next();
        System.out.println("_________________________________________________________\n\n");
    }

    public void setupMatch() { // Who will get batting and bolling
        int ComputerToss = AutoToss();

        System.out.println("Odd or Even to decide Batting or bolling ");
        System.out.print("Entr ur value : ");
        int player_ch = scanner.nextInt();

        while (true) {
            if ((ComputerToss % 2 == player_ch % 2))
                ComputerToss = AutoToss();
            else
                break;
        }
        int sum_of_OddEve = player_ch + ComputerToss;
        int oddEve = sum_of_OddEve % 2;

        int temp = AutoToss();
        System.out.println("Computer choice : " + temp);

        if (player_ch % 2 == oddEve) {
            // Player Get the choice of batting or Bolling
            System.out.println("\n\n_________________________________________________________\n");
            System.out.println("\t\t***You win this***");
            System.out.println("\t1. Batting \n\t2. Bolling");
            System.out.print("Enter Your choice: ");
            player_ch = scanner.nextInt();

            if (player_ch == 1) {
                System.out.println("\n\n_________________________________________________________\n");
                player_batting(0);
            } else if (player_ch == 2) {
                System.out.println("\n\n_________________________________________________________\n");
                comp_batting(0);
            } else {
                System.out.println("\n\n_________________________________________________________\n");
                System.out.println("\t\t***Error : Input Out of list***");
                System.out.println("\n\n_________________________________________________________\n");
            }

        } else {
            System.out.println("\n\n_________________________________________________________\n");
            System.out.println("***Computer win this***");
            if (temp == 0) {
                System.out.println("Computer had decided for Batting");
                comp_batting(0);
            } else {
                System.out.println("Computer had decided for Bolling");
                player_batting(0);
            }
            System.out.println("\n\n_________________________________________________________");
        }
    }

    // Computer
    public void comp_batting(int target_score_of_computer) {
        int PLAYER_SCORES = 0;
        int COMPTER_SCORES = 0;
        // Comp -> batting
        // Player -> bolling
        int target = target_score_of_computer + 1;
        int player_thrownRuns = 0, comp_thrownRuns = 0;
        System.out.println("\n\n_________________________________________________________\n\n");
        System.out.println("It will be " + over + " overs match\n\t\tHere You Goooo!!! ");

        int i;
        for (i = 0; i <= 6 * over; i++) {
            System.out.println("Throw your ball(1 to 6): ");
            player_thrownRuns = scanner.nextInt();
            comp_thrownRuns = computerRuns();
            System.out.println("Computer throw : " + comp_thrownRuns);

            if (player_thrownRuns <= 6) {
                if (player_thrownRuns == comp_thrownRuns) {
                    System.out.println(player_name + "'s, Taken a wickte of computer ");
                    System.out.println("Computer's, Your Total Score : " + COMPTER_SCORES);
                    break;
                } else {
                    COMPTER_SCORES += comp_thrownRuns;
                }

                if (target > 1) {
                    if (target <= COMPTER_SCORES) {
                        System.out.println("***Computer Won this***");
                        break;
                    }

                }

            } else {
                System.out.println("\n\n_________________________________________________________\n\n");
                System.out.println("\t***Thats a foul*** \n\t\t ->computer get 2 runs ");
                System.out.println("\n\n_________________________________________________________\n\n");
                comp_thrownRuns += 2;
                i--;
                continue;

            }

        }
        if (i <= 6) {
            System.out.println("\n\t****Match Just end !! ****  ");
        } else {
            System.out.println("Computer's, Your Total Score : " + COMPTER_SCORES);
            if (COMPTER_SCORES >= target) {
                if (COMPTER_SCORES > 1)
                    COMPUTER_WININGS++;
                System.out.println("\tComputers Winings : " + COMPUTER_WININGS);
            }
        }
        System.out.println("\n\n_________________________________________________________\n\n");
        System.out.println("Now That's " + player_name + "'s time to make runs ");

        player_batting(COMPTER_SCORES);
    }

    public void player_batting(int target_score_of_player) {
        int PLAYER_SCORES = 0;
        // Player -> batting
        // Comp -> bolling
        int target = target_score_of_player + 1;
        int overs = 6;
        int player_thrownRuns = 0, comp_thrownRuns = 0;
        System.out.println("\n\n_________________________________________________________\n\n");

        if (target > 1) {
            System.out.print("Target to match : " + target + '\n');
        }

        System.out.println("It will be " + overs + " overs match\n\t\tHere You Goooo!!! ");

        int i;
        for (i = 0; i <= 6 * overs; i++) {

            comp_thrownRuns = computerRuns();
            System.out.print("Enter your thrown(1 to 6) : ");
            player_thrownRuns = scanner.nextInt();

            System.out.println("Computer thrown Runs : " + comp_thrownRuns);
            if (player_thrownRuns <= 6 && player_thrownRuns > 0) {
                if (player_thrownRuns == comp_thrownRuns) {
                    System.out.println("Thats a Wicket " + player_name + ", just out");
                    System.out.println(player_name + ", Your Total Score : " + PLAYER_SCORES);
                    break;
                } else {
                    PLAYER_SCORES += player_thrownRuns;
                }

                if (target > 1) {
                    if (target <= PLAYER_SCORES) {
                        break;
                    }
                }

            } else {
                System.out.println("\n\n_________________________________________________________");
                System.out.println("\t***Error: Input Out of list***");
                System.out.println("Entr again ");
                System.out.println("_________________________________________________________");
                i--;
                continue;
            }
        }

        if (i <= 6) {
            System.out.println("\n\t****Match Just end !! ****  ");
        } else {
            System.out.println(player_name + "'s, Your Total Score : " + PLAYER_SCORES);
            if (PLAYER_SCORES >= target && target > 1) {
                if (PLAYER_SCORES > 1)
                    PLAYER_WININGS++;
                System.out.println("\t" + player_name + "'s Winings : " + PLAYER_WININGS);
            }
        }

        System.out.println("\n\n_________________________________________________________\n\n");
        System.out.println("Now That's computer's time to make runs ");
        comp_batting(PLAYER_SCORES);
    }

    public static void main(String[] args) {
        main myObj = new main();

        myObj.getPlayerInfo();
        myObj.setupMatch();
    }
}
