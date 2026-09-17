public class Main{
    public static void main(String[]arg){
        System.out.println("--- Iniciando simulador Poo");

        //Creamos un nuevo objeto usando la palabra clave 'new'
        Jugador personajePrincipal = new Jugador("Joel");

        //Hacemos que el objeto realice acciones
        personajePrincipal.entrenar();
        personajePrincipal.entrenar();
    }
}