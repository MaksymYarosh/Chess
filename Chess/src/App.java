import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> players = new ArrayList<>();
        System.out.println("How many players?");
        int numberOfPlayers = sc.nextInt();
        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= numberOfPlayers; i++) {
            System.out.println("Enter the name of player #" + i);
            players.add(input.nextLine());
        }
        System.out.println("Here is the list of all players: ");
        System.out.println(players);
        for (String x : players) {
            System.out.println(x);
        }
System.out.println("Trying to commit");
    }
}