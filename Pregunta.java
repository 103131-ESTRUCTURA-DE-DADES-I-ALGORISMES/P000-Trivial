public class Pregunta {
    String enunciat;
    boolean val;
    int score;
	
	public Pregunta(String enunciat, boolean val, int score){
		this.enunciat=enunciat;
		this.val=val;
		this.score=score;
	}
	public String getEnunciat(){ return this.enunciat; }
	public boolean getValue() { return this.cert; }
	public int getScore() { return this.sore; }
}