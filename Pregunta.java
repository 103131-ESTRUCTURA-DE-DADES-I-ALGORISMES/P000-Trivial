public class Pregunta {
    String afirmacio;
    boolean cert;
    int dificultat;
	
	public Pregunta(String afirmacio, boolean cert, int dificultat){
		this.afirmacio=afirmacio;
		this.cert=cert;
		this.dificultat=dificultat;
	}
	public String getAfirmacio(){ return this.afirmacio; }
	public boolean getCert() { return this.cert; }
	public int getDificultat() { return this.dificultat; }
}