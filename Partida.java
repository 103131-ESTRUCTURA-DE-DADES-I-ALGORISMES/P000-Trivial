public class Partida {
    private static ArrayList<Pregunta> preguntas=new ArrayList<>();
    private static ArrayList<Jugador> jugadors=new ArrayList<>();

    public Partida() {
        preguntas.add(new Pregunta("El Titanic en el viatge inaugural va des de Southampton, Anglaterra fins a Washington, Estats Units", false, 2));
        preguntas.add(new Pregunta("El Brasil ha estat l'únic país llatinoamericà que ha organitzat uns Jocs Olímpics", false, 1));
        preguntas.add(new Pregunta("L'any 2017 es va fer el primer trasplantament de cervell d'éssers humans", true, 1));
        preguntas.add(new Pregunta("Michael Jackson era Musulmà", false, 2));
        preguntas.add(new Pregunta("Els assassins en sèrie tenen un coeficient intel·lectual inferior a la mitjana", false, 2));
        preguntas.add(new Pregunta("Durante la adultez nuestro cuerpo tiene 300 huesos mientras que en la niñez 206", false, 2));
        preguntas.add(new Pregunta("Guillermo Marconi en 1943 se reafirma como el inventor de la radio por encima de Nikola Tesla", false, 3));
        preguntas.add(new Pregunta("Cada dia produïm més d'un litre de saliva", true, 1));
        preguntas.add(new Pregunta("Los Angeles és la segona ciutat del món amb més mexicans", true, 2));
        preguntas.add(new Pregunta("El Koala dorm 22 hores al dia", true, 3));
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Collections.sort(preguntas);

        int num_correcte, score;
        String name, resposta;
        num_correcte=score=0; // == num_correcte=0,score=0 ?

        intro();
        joc();
        stats();
    }

    private void joc() {
        for (Pregunta pregunta : preguntas) {
            System.out.println("\n"+pregunta.getEnunciat()+"\nVerdader (v) o Fals(f)? "+pregunta.getScore+" punts.");

            Collections.shuffle(jugadors);
            for(Jugador j : jugadors){
                do{
                    System.out.println("Resposta de'n jugador/a "+J.getName()+": ");
                    resposta=scan.nextLine().toLowerCase();
                }while(!resposta.equals("f") || !resposta.equals("v"));

                if(pregunta.getValue()==resposta.equals("v")){
                    j.incrementScore(pregunta.getScore());
                    j.incrementEncertades();
                }
            }
            System.out.println("La resposta era: " + (pregunta.getValue(? "VERDADER" : "FALS")));
        }
    }

    private void stats() {
        System.out.println("\nHA GUANYAT: "+jugadors[i].getName());
        System.out.println("\n\nTAULA DE RESULTATS:");
        Collections.sort(jugadors);
        for(int i=0; i<len(jugadors); i++)
            System.out.println((i+1)+". "+jugadors[i].getName()+" amb "+jugadors[i].getScore()+"punts");
    }

    private void intro() {
        System.out.println("Benvingut a la partida d'trivial");
        // TODO: millorar l'explicacio
        System.out.println("Primer, per favor, introdueix el nom dels jugadors. Quan acabi, prem intro per començar");
       
        int cntJ=1; String name;
        do {
            System.out.println("\nNom del jugador "+cntJ+": ");
            name=scan.nextLine();
            if (!name.equals("")){
                Jugador jugador=new Jugador(name);
                jugadors.add(jugador);
            }
        } while (!name.equals(""));
        if (jugadors.length()==0) 
            throw new Exception("Que fas? no vols jugar? No hi ha jugadors");
    }
}