package trivia;

public class Pregunta implements Comparable<Pregunta>{
    String enunciat;
    boolean val;
    int score;
	
	public Pregunta(String enunciat, boolean val, int score){
		this.enunciat=enunciat;
		this.val=val;
		this.score=score;
	}
	public String getEnunciat(){ return this.enunciat; }
	public boolean getValue() { return this.val; }
	public int getScore() { return this.score; }

	@Override
    public int compareTo(Pregunta p) {
        int s=((Pregunta)p).getScore();
        return s-this.score; // de mes a menys facil.
    }
}