public class Partida {
    private static ArrayList<Pregunta> preguntas = new ArrayList<>();

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

        Scanner sc = new Scanner(System.in);
        Collections.shuffle(preguntas);

        int correcte = 0;
        int puntuacio = 0;
        String nom, resposta;

        System.out.println("Ingresa tu nombre: ");
        nom = sc.nextLine();

        System.out.println("Muy bien " + nom + ", se estan mezclado las preguntas");
        System.out.println("Una vez mezcladas responde Verdadero (v) o  Falso (f) a las siguientes afirmaciones");

        for (int i = 0; i < preguntas.size(); i++) {
            System.out.println( i + ". " + preguntas.get(i).getAfirmacio());

            System.out.println("Verdadero (v) o falso(f)?");
            resposta = sc.nextLine();

            if (resposta == 'v') {
                if (preguntas.get(i).getCert() == true) {

                    System.out.println("Correcto");
                    correcte++;
                    puntuacio += preguntas.get(i).getDificultat();

                } else {
                    System.out.println("Incorrecto");
                }
            } else if ( resposta == 'f') {
                if ( preguntas.get(i).getCert() == false) {
                    System.out.println("Correcto");
                    correcte++;
                    puntuacio += preguntas.get(i).getDificultat();
                } else {
                    System.out.println("Incorrecto");
                }
            }
            System.out.println("");
        }
        System.out.println(" Has respondido correctamente a " + correcte );
        System.out.println(" Has obtenido " + puntuacio + " puntos");
        System.out.println(" El porcentage de aciertos es de  " + (correcte / preguntas.size()*100) );
    }
}