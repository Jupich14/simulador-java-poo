public class Main {
    public static void  main(String[]args){
        String nombre = "Joel";
        int nivel = 1;
        System.out.println("Hola, Soy "+ nombre + " y estoy en el nivel "+ nivel + " de Java" );

        //cCondicionales 
        if (nivel==1){
            System.out.println("Soy un estudiante, que aprende rapido");
        }else{
            System.out.println("Ya tango experienia en esto");
        }
        //Ciclos For 
        for(int i = 1; i<= 3;i++){
            System.out.println("Completando practica de numeros "+ i);
            nivel++; // esto signicia auto incremento a una varible nivel = nivel + 1
        }
        System.out.println("Entrenamiento terminado! Ahora soy nivel "+ nivel);
    }
}