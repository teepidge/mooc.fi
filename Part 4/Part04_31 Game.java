
public class Game {
    private String homeTeam;
    private String awayTeam;
    private String winningTeam;
    private String losingTeam;
    
    
    public Game(String homeTeam, String awayTeam, int pointsHome, int pointsAway) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        
        //for any game, decide who was the winner
        if (pointsHome > pointsAway) {
            this.winningTeam = this.homeTeam;
            this.losingTeam = this.awayTeam;
        } else {
            this.winningTeam = this.awayTeam;
            this.losingTeam = this.homeTeam;
        }
    }
    
    public String getHomeTeam() {
        return this.homeTeam;
    }

    public String getAwayTeam() {
        return this.awayTeam;
    }
    public String getWinningTeam() {
        return this.winningTeam;
    }
    public String getLosingTeam() {
        return this.losingTeam;
    }
    
}
