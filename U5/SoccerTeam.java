package U5;

public class SoccerTeam {
    private int wins;
    private int losses;
    private int ties;
    private static int totalGoals;
    private static int gamesPlayed;

    public SoccerTeam() {
        wins = 0;
        losses = 0;
        ties = 0;
    }

    public void played(SoccerTeam other, int myScore, int otherScore) {
        totalGoals += myScore + otherScore;
        gamesPlayed++;
        if (myScore > otherScore) {
            this.wins++;
            other.losses++;
        } else if (myScore < otherScore) {
            other.wins++;
            this.losses++;
        } else {
            this.ties++;
            other.ties++;
        }
    }

    public static int getGoals(){
        return totalGoals;
    }
    public static int getGames(){
        return gamesPlayed;
    }
    public int getTournamentPoints() {
        return 3 * wins + ties;
    }
    public static void startTournament(){
        gamesPlayed = 0;
        totalGoals = 0;
    }

    public void reset() {
        this.wins = 0;
        this.losses = 0;
        this.ties = 0;
    }
    public String toString(){
        return " scored " + getTournamentPoints() + " tournament points";
    }
    public static String tournamentStats(){
        return "Across this tournament teams played " + gamesPlayed + " games and they scored " + totalGoals + " goals";
    }


    public static void main(String[] args) {
        SoccerTeam s1 = new SoccerTeam();
        SoccerTeam s2 = new SoccerTeam();
        SoccerTeam s3 = new SoccerTeam();
        SoccerTeam s4 = new SoccerTeam();

        s1.played(s2, 5, 2);
        s4.played(s3, 1, 1);
        s1.played(s4, 3, 2);
        s2.played(s3, 1, 4);
        
        System.out.println("Team 1" + s1);
        System.out.println("Team 2" + s2);
        System.out.println("Team 3" + s3);
        System.out.println("Team 4" + s4);
        System.out.println(tournamentStats());

        startTournament();
        System.out.println();
        System.out.println("New Tournament");
        System.out.println();
        
        s1.reset();
        s1.reset();
        s1.reset();
        s1.reset();

        s4.played(s2, 5, 4);
        s2.played(s3, 6, 6);
        s1.played(s4, 1, 4);
        s3.played(s1, 2, 7);
        
        System.out.println("Team 1" + s1);
        System.out.println("Team 2" + s2);
        System.out.println("Team 3" + s3);
        System.out.println("Team 4" + s4);
        System.out.println(tournamentStats());
    }
}
