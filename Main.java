import java.util.ArrayList; // 1. Traemos ls herramienta para trabajar

public class Main{
    public static void main(String[] arg){
        System.out.println("---iniciando torneo masivo ---");

        // 2. creamos una lista dinamica que SOLO acepta objetos del molde 'jugador'
        ArrayList<Jugador> listaJugadores = new ArrayList<>();

        //3. agregamos objetos 'Jugador' directamente dentro de la lista
        listaJugadores.add(new Jugador("Joel"));
        listaJugadores.add(new Jugador("Rival 1"));
        listaJugadores.add(new Jugador("Jefe Final"));

        //la lista sabe exactamente cuantos elementos tiene en todo momento usando .size()
        System.out.println("Tenemos"+listaJugadores.size()+ " Jugadores registrados. " );

        //4. Ciclo especial 'for-each'. se lee: "Por cada Jugador 'J' dentro de 'listaJugadores', ha esto:"
        for(Jugador j : listaJugadores){
            j.start();// Iniciar el el hilo en paralelo
            
        } 
    }
}