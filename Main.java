public class Main{
    public static void main(String[]arg){
        System.out.println("--- Iniciando simulador Poo");

        //Creamos un nuevo objeto usando la palabra clave 'new'
        Jugador jugador1 = new Jugador("Joel");
        Jugador jugador2 = new Jugador("Mi rival Yo");

        //Hacemos que el objeto realice acciones
        jugador1.start();
        jugador2.start();

        System.out.println("El arbitro dice: ¡Ambos jugadores estan entrenando al mismo tiempo!");
    }
}