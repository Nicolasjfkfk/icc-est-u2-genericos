import models.Persona;
import models.genericos.Caja;
import models.genericos.Par;

public class App {
    public static void main(String[] args) throws Exception {
       /*  Persona persona = new Persona();
        persona.setNombre("PABLO");
        persona.setEdad(50);  
              
        Caja<String> cajaString = new Caja<>();
        Caja<Integer> cajaInteger = new Caja<>();
        Caja<Persona> cajaPersona = new Caja<>();

        Par<String, Integer> par = new Par<>();
        
        cajaPersona.guardar(persona);
        cajaPersona.guardar(persona);
        
        cajaString.guardar("Guardo un String");
        cajaInteger.guardar(10);
        
        System.out.println(cajaPersona.obtener().getNombre());
        System.out.println(cajaPersona.obtener().getEdad());
        System.out.println(cajaString.obtener());
        System.out.println(cajaInteger.obtener());*/

  
        // NUEVA LOGICA DE TAREA
        // 1. Crear un arreglo de 10 Persona con datos
        Persona[] personas = new Persona[10];
        personas[0] = new Persona("Ana", 30);
        personas[1] = new Persona("Elizabeth", 15);
        personas[2] = new Persona("Andres", 45);
        personas[3] = new Persona("Anai", 20);
        personas[4] = new Persona("Pedro", 40);
        personas[5] = new Persona("Noemi", 25);
        personas[6] = new Persona("Carla", 35);
        personas[7] = new Persona("Sofi", 10);
        personas[8] = new Persona("Manuel", 50);
        personas[9] = new Persona("Eliza", 5);

        Par<String, Integer>[] mayores = new Par[10];
        Par<Integer, String>[] menores = new Par[10];
        int contadorMayores = 0;
        int contadorMenores = 0;

         // Separación de personas en mayores y menores
         for (int i = 0; i < personas.length; i++) {
            if (personas[i].getEdad() >= 18) {
                mayores[contadorMayores] = new Par<>();
                mayores[contadorMayores].establecerClave(personas[i].getNombre());
                mayores[contadorMayores].establecerValor(personas[i].getEdad());
                contadorMayores++;
            } else {
                menores[contadorMenores] = new Par<>();
                menores[contadorMenores].establecerClave(personas[i].getEdad());
                menores[contadorMenores].establecerValor(personas[i].getNombre());
                contadorMenores++;
            }
        }

        
        System.out.println("Menores de edad");
        for (int i = 0; i < contadorMenores; i++) {
            System.out.println(menores[i].obtenerClave() + " - " + menores[i].obtenerValor());
        }

      
        System.out.println("Mayores de edad");
        for (int i = 0; i < contadorMayores; i++) {
            System.out.println(mayores[i].obtenerClave() + " - " + mayores[i].obtenerValor());
        }
    }
}
