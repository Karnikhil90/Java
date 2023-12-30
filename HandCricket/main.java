package HandCricket;

import java.util.*;

public class main {

    Scanner scanner = new Scanner(System.in);

    // Global Variable
    int player_score = 0;
    int computer_score = 0;
    String player_name;

    public int computerRuns() { // Computer genrated outcomes 1 - 6
        double n;
        n = Math.random() * 7;
        int a = (int) n;
        return a;
    }

    public int computer_choice() {
        double rnd = 0;
        rnd = Math.random() * 100;
        if ((int) rnd % 2 == 0)
            return 0; // True
        return 1; // False
    }

    public void getPlayerInfo() {
        System.out.println("\n\n_________________________________________________________\n\n");
        System.out.print("\tEntr ur player name : ");
        player_name = scanner.next();
        System.out.println("_________________________________________________________\n\n");
    }

    public void setupMatch() { // Who will get batting and bolling

        double comp_OddEve = Math.random() * 100;

        System.out.println("Odd or Even to decide Batting or bolling ");
        System.out.print("Entr ur value : ");
        int player_ch = scanner.nextInt();

        int sum_of_OddEve = player_ch + (int) comp_OddEve;
        int oddEve = sum_of_OddEve % 2;

        int temp = computer_choice();
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
        // Comp -> batting
        // Player -> bolling
        int target = target_score_of_computer + 1;
        int over = 6;
        int player_thrownRuns = 0, comp_thrownRuns = 0;
        System.out.println("\n\n_________________________________________________________\n\n");
        System.out.println("It will be 2 overs match\n\t\tHere You Goooo!!! ");

        int i;
        for (i = 0; i <= over; i++) {
            System.out.println("Throw your ball(1 to 6): ");
            player_thrownRuns = scanner.nextInt();
            comp_thrownRuns = computerRuns();
            System.out.println("Computer throw : " + comp_thrownRuns);

            if (player_thrownRuns <= 6) {
                if (player_thrownRuns == comp_thrownRuns) {
                    System.out.println(player_name + "'s, Taken a wickte of computer ");
                    System.out.println("Computer's, Your Total Score : " + computer_score);
                    break;
                } else {
                    computer_score += comp_thrownRuns;
                }

                if (target > 1) {
                    if (target <= computer_score) {
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
            System.out.println("Match Just end !!  ");
        } else {
            System.out.println("Computer's, Your Total Score : " + computer_score);
        }
        System.out.println("\n\n_________________________________________________________\n\n");
        System.out.println("Now That's " + player_name + "'s time to make runs ");
        player_batting(computer_score);
    }

    public void player_batting(int target_score_of_player) {
        // Player -> batting
        // Comp -> bolling
        int target = target_score_of_player + 1;
        int overs = 6;
        int player_thrownRuns = 0, comp_thrownRuns = 0;
        System.out.println("\n\n_________________________________________________________\n\n");

        if (target > 1) {
            System.out.print("Target to match : " + target + '\n');
        }

        System.out.println("It will be 2 overs match\n\t\tHere You Goooo!!! ");

        int i;
        for (i = 0; i <= overs * 1; i++) {

            comp_thrownRuns = computerRuns();
            System.out.print("Enter your thrown(1 to 6) : ");
            player_thrownRuns = scanner.nextInt();

            System.out.println("Computer thrown Runs : " + comp_thrownRuns);
            if (player_thrownRuns <= 6) {
                if (player_thrownRuns == comp_thrownRuns) {
                    System.out.println("Thats a Wicket " + player_name + ", just out");
                    System.out.println(player_name + ", Your Total Score : " + player_score);
                    break;
                } else {
                    player_score += player_thrownRuns;
                }

                if (target > 1) {
                    if (target <= player_score) {
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

        if (target <= player_score && target > 1) {
            System.out.println("\n\n_________________________________________________________");
            System.out.println("\n\n\t\t***You Win This Game***\n\n");
            System.out.println(player_name + ", Your Total Score : " + player_score);
        } else {
            if (target > 1 && i + 1 < 6) {
                System.out.println("you cant win this game");
                System.out.println(player_name + ", Your Total Score : " + player_score);

            }
        }

        System.out.println("\n\n_________________________________________________________\n\n");
        System.out.println("Now That's computer's time to make runs ");
        comp_batting(player_score);

    }

    public static void main(String[] args) {
        main myObj = new main();

        myObj.getPlayerInfo();
        myObj.setupMatch();
    }
}
