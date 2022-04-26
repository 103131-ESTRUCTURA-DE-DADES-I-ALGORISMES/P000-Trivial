public class Partida {
    private static ArrayList<Pregunta> preguntas=new ArrayList<>();

    public Partida() {
        preguntas.add(new Pregunta("La noche estrellada la pintó Vicent Van Gogh", true, 2));
        preguntas.add(new Pregunta("El jazz nació en Francia", false, 1));
        preguntas.add(new Pregunta("Napoleón Bonaparte murió envenenado", false, 1));
        preguntas.add(new Pregunta("Michael Jackson nació en Canadá", false, 2));
        preguntas.add(new Pregunta("Nueva Zelanda prohíbe poner a los niños ciertos nombres", true, 2));
        preguntas.add(new Pregunta("El nombre de Nike esta basado en una diosa griega", true, 2));
        preguntas.add(new Pregunta("Una banana fue la mascota de la Copa Mundial de Fútbol de 1982", false, 3));
        preguntas.add(new Pregunta("El francés es idioma oficial en Haití", true, 1));
        preguntas.add(new Pregunta("La capital de Islandia es Quebec", false, 2));
        preguntas.add(new Pregunta("Adolf Hitler fue abandonado de bebé en un orfanato", false, 3));
    }

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        // ordenar de + dificil a -
        Collections.shuffle(preguntas);

        int num_correcte, score;
        String name, resposta;

        num_correcte=0; score=0;

        System.out.println("Com et dius: "); name=scan.nextLine();

        System.out.println("Muy bien " + name + ", se estan mezclado las preguntas");
        System.out.println("Una vez mezcladas responde Verdadero (v) o  Falso (f) a las siguientes afirmaciones");

        for (int i=0; i<preguntas.size();i++) {
            System.out.println( i + ". " + preguntas.get(i).getAfirmacio());

            System.out.println("Verdadero (v) o falso(f)?");
            resposta=scan.nextLine();

            respostt

            if (resposta.toLowerCase().equals("v")) {
                if (preguntas.get(i).getValue() == true) {

                    System.out.println("Correcto");
                    num_correcte++;
                    score+=preguntas.get(i).getScore();

                } else {
                    System.out.println("Incorrecto");
                }
            } else if (resposta.toLowerCase().equals("f")) {
                if ( preguntas.get(i).getValue() == false) {
                    System.out.println("Correcto");
                    num_correcte++;
                    score += preguntas.get(i).getScore();
                } else {
                    System.out.println("Incorrecto");
                }
            }
            System.out.println("");
        }
        System.out.println(" Has respondido correctamente a " + num_correcte );
        System.out.println(" Has obtenido " + score + " puntos");
        System.out.println(" El porcentage de aciertos es de  " + (num_correcte / preguntas.size()*100) );
    }
}