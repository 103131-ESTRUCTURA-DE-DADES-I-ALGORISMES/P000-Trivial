public class Partida {
    private static ArrayList<Pregunta> preguntas=new ArrayList<>();

    public Partida() {
        preguntas.add(new Pregunta("El Titanic en el viatge inaugural va des de Southampton, Anglaterra fins a Washington, Estats Units", false, 2));
        preguntas.add(new Pregunta("El Brasil ha estat l'únic país llatinoamericà que ha organitzat uns Jocs Olímpics", false, 1));
        preguntas.add(new Pregunta("L'any 2017 es va fer el primer trasplantament de cervell d'éssers humans", true, 1));
        preguntas.add(new Pregunta("Michael Jackson era Musulmà", false, 2));
        preguntas.add(new Pregunta("Els assassins en sèrie tenen un coeficient intel·lectual inferior a la mitjana", false, 2));
        preguntas.add(new Pregunta("Durante la adultez nuestro cuerpo tiene 300 huesos mientras que en la niñez 206", false, 2));
        preguntas.add(new Pregunta("Guillermo Marconi en 1943 se reafirma como el inventor de la radio por encima de Nikola Tesla", false, 3));
        preguntas.add(new Pregunta("Cada dia produïm més d´un litre de saliva", true, 1));
        preguntas.add(new Pregunta("Los Angeles és la segona ciutat del món amb més mexicans", true, 2));
        preguntas.add(new Pregunta("El Koala dorm 22 hores al dia", true, 3));
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
            System.out.println( i + ". " + preguntas.get(i).getEnunciat());

            System.out.println("Verdadero (v) o falso(f)?");
            resposta=scan.nextLine().toLowerCase();

            if (preguntas.get(i).getValue()==resposta.equals("v")) {
                System.out.println("Correcto");
                score+=preguntas.get(i).getScore(); num_correcte++;
            } else System.out.println("Incorrecto");
            
            System.out.println("");
        }

        stats();
    }

    private void stats() {
        System.out.println(
            "Total de respostes encertades: "+num_correcte+"\n"+
            "Puntuació obtinguda: "+score+"\n"+
            "Tant per cent de respostes encertades respecte del total: "+(num_correcte / preguntas.size()*100)+"%"
        );
    }
}