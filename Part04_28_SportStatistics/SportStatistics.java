//Write a program that prompts user for a file name, after which it reads the match
//statistics from the file. The program then prompts the user for the name of a team,
//and prints the data specified in the following parts for that team.

import java.util.Scanner;
import java.util.ArrayList;
import java.nio.file.Paths;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> stats = new ArrayList<>();

        // prompt user for a file name
        System.out.println("Filename: ");
        String file = scanner.nextLine();

        System.out.println("Team: ");
        String team = scanner.nextLine();
        int counter = 0;
        int win = 0;
        int loss = 0;

        try (Scanner reader = new Scanner(Paths.get(file))) {
            
             while (reader.hasNextLine()) {
                //adding lines of csv to stats arraylist
                String line = reader.nextLine();
                stats.add(line);

                //split at commas and put inot array called pieces
                String[] pieces = line.split(",");
                //assign index of pieces array to values
                String homeTeam = pieces[0];
                String awayTeam = pieces[1];

                int homePoints = Integer.valueOf(pieces[2]);
                int awayPoints = Integer.valueOf(pieces[3]);

                if (team.equals(homeTeam)) {
                    counter++;
                }

                if (team.equals(awayTeam)) {
                    counter++;
                }

                if ((team.equals(homeTeam)) && (homePoints > awayPoints)) {
                    win++;
                }

                if ((team.equals(awayTeam)) && (awayPoints > homePoints)) {
                    win++;
                }
            }

            System.out.println("Games: " + counter);
            System.out.println("Wins: " + win);
            System.out.println("Losses: " + (counter-win));
        } catch (Exception e) {
            System.out.println("Error!");
        }
    }
}
