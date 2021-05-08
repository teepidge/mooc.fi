
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String fileName = scan.nextLine();

        System.out.println("Team:");
        String teamName = scan.nextLine();

        ArrayList<Game> games = new ArrayList<>();
        
        //variables for output
        int countGames = 0;
        int wins = 0;
        int losses = 0;
        
        try ( Scanner file = new Scanner(Paths.get(fileName))) {
            while (file.hasNextLine()) {
                //read next line
                String line = file.nextLine();

                //split line
                String[] lines = line.split(",");

                //store variables              
                String homeTeam = lines[0];
                String awayTeam = lines[1];
                int homePoints = Integer.valueOf(lines[2]);
                int awayPoints = Integer.valueOf(lines[3]);
                
                //create new game object and add to arraylist
                games.add(new Game(homeTeam, awayTeam, homePoints, awayPoints));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
       
        for (Game game : games) {
            //count games
            if (game.getHomeTeam().equals(teamName) || game.getAwayTeam().equals(teamName)) {
                    countGames++;
                }
            //count wins
            if (game.getWinningTeam().equals(teamName)) {
                wins++;
            }
            
            //count losses
            if (game.getLosingTeam().equals(teamName)) {
                losses++;
            }
        }
        //output numbers
        System.out.println("Games: " + countGames);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);

    }
}