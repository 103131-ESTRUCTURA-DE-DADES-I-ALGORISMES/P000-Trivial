package trivia;

public class Jugador implements Comparable<Jugador> { 

    private String name;
    private int score;
    private int encertades;
    private int respostes;

    public Jugador(String name) {
        this.name=name;
        this.score=0;
        this.encertades=0;
        this.respostes=0;
    }


    public void incrementScore(int score) { this.score+=score; }
    public void incrementEncertades() { this.encertades++; }
    public void incrementRespostes() { this.respostes++; }
    
    public String getName() { return this.name; }
    public int getScore() { return this.score; }
    public int getEncertades() { return this.encertades; }
    public int getRespostes() { return this.respostes; }

    public String toString(){
        return this.getName()+" amb "+this.getScore()+" punts i un "+(encertades*100/respostes)+"% d'encerts.";
    }

    @Override
    public int compareTo(Jugador j) {
		return ((Jugador)j).getScore()-this.score;
    }
}