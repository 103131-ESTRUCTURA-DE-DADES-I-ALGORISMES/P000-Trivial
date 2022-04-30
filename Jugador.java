public class Jugador { 

    private String name;
    private int score;
    private int encertades;

    public Jugador(String name) {
        this.name=name;
        this.score=0;
        this.encertades=0;
    }


    public void incrementScore(int score) { this.score+=score; }
    public void decrementScore(int score) { this.score-=score; }
    public void incrementEncertades() { this.encertades++; }
    
    public String getName() { return this.name; }
    public int getScore() { return this.score; }
    public int getEncertades() { return this.encertades; }


    @Override
    public int compareTo(Jugador j) {
		return this.score-((Jugador)j).getscore();
    }
}