public class Jugador extends Thread{
    
    //1.atributos (Las variables o caracteristicas del molde)
    String nombre;
    int nivel;

    //2.constructor (las instrucciones de que hacer cuando nace un nuevo objeto)
    public Jugador(String nombreInicial) {
        nombre = nombreInicial;
        nivel = 1; //Todo Jugador nuevo nace nivel 1 por defecto
    }

    //El Método 'run' es el motor del hilo
    @Override 
    public void run(){
        System.out.println(nombre+" Empieza el entrenamiento pesado...");

        try{
            //Le decimos al procesador que "duerma"(pause) este hilo por 3000 milisegundos (3 segundos)
            Thread.sleep(3000);
        }catch (InterruptedException e){
            System.out.println("El entrenamiento fue interumpido");
        }
        nivel++;
        System.out.println(nombre+" termino de entrenar. ¡Nivel "+nivel+" alcanzado!");
    }   
}
