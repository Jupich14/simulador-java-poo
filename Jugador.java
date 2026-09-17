public class Jugador {
    
    //1.atributos (Las variables o caracteristicas del molde)
    String nombre;
    int nivel;

    //2.constructor (las instrucciones de que hacer cuando nace un nuevo objeto)
    public Jugador(String nombreInicial) {
        nombre = nombreInicial;
        nivel = 1; //Todo Jugador nuevo nace nivel 1 por defecto
    }

    //3. Método (las acciones que el objeto puede hacer)
    public void  entrenar(){
        nivel ++;
        System.out.println(nombre+"ha entrenado duro. ¡Ahora es nivel "+ nivel+ "!");
    }
    
        
       
}
