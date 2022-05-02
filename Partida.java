package trivia;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Partida {
    private static ArrayList<Pregunta> preguntes=new ArrayList<>();
    private static ArrayList<Jugador> jugadors=new ArrayList<>();

    private static Scanner scan;
    
    public Partida() {
        preguntes.add(new Pregunta("El Titanic en el viatge inaugural va des de Southampton, Anglaterra fins a Washington, Estats Units", false, 2));
        preguntes.add(new Pregunta("El Brasil ha estat l'únic país llatinoamericà que ha organitzat uns Jocs Olímpics", false, 1));
        preguntes.add(new Pregunta("L'any 2017 es va fer el primer trasplantament de cervell d'éssers humans", true, 1));
        preguntes.add(new Pregunta("Michael Jackson era Musulmà", false, 2));
        preguntes.add(new Pregunta("Els assassins en sèrie tenen un coeficient intel·lectual inferior a la mitjana", false, 2));
        preguntes.add(new Pregunta("Cada dia produïm més d'un litre de saliva", true, 1));
        preguntes.add(new Pregunta("Los Angeles és la segona ciutat del món amb més mexicans", true, 2));
        preguntes.add(new Pregunta("El Koala dorm 22 hores al dia", true, 3));
    }

    public static void main(String[] args) throws Exception {
        scan=new Scanner(System.in);
        
        Partida partida=new Partida();
        Collections.sort(preguntes);
        
        int num_correcte, score;
        num_correcte=score=0; // == num_correcte=0,score=0 ?

        System.out.println(preguntes.size());
        
        partida.intro();
        preguntes.forEach(pregunta->partida.joc(pregunta));
        partida.stats();
    }

    private void joc(Pregunta pregunta) {
    	System.out.println("\n"+pregunta.getEnunciat()+"\nVerdader (v) o Fals(f)? "+pregunta.getScore()+" punts.");

        Collections.shuffle(jugadors);
        jugadors.forEach(jugador -> this.tirada(jugador, pregunta));
        System.out.println("La resposta era: " + (pregunta.getValue() ? "VERDADER" : "FALS"));
    }

    private void tirada(Jugador j, Pregunta pregunta) {
    	String resposta;
    	do{
            System.out.println("Resposta de'n jugador/a "+j.getName()+": ");
            resposta=scan.nextLine().toLowerCase();
        } while(!resposta.equals("f") && !resposta.equals("v"));

        if(pregunta.getValue()==resposta.equals("v")){
            j.incrementScore(pregunta.getScore());
            j.incrementEncertades();
        }
    }
    
    private void stats() {
        System.out.println("\n\n\nHA GUANYAT: "+jugadors.get(0).getName());
        System.out.println("\n\nTAULA DE RESULTATS:");
        Collections.sort(jugadors);
        for(int i=0; i<jugadors.size(); i++)
            System.out.println((i+1)+". "+jugadors.get(i).getName()+" amb "+jugadors.get(i).getScore()+" punts");
    }

    private void intro() throws Exception {
        System.out.println("Benvingut a la partida d'trivial");
        System.out.println("Introdueix el nom dels jugadors. Quan acabi, premi intro per començar");
       
        int cntJ=1; String name;
        do {
            System.out.println("\nNom del jugador "+cntJ+": ");
            name=scan.nextLine();
            if (!name.equals("")){
                Jugador jugador=new Jugador(name);
                jugadors.add(jugador);
                cntJ++;
            }
        } while (!name.equals(""));
        if (jugadors.size()==0) 
            throw new Exception("Que fas? no vols jugar? (No hi han jugadors)");
    }
}