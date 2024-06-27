import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {

        //clase Scanner que permite que el usuario escriba.

        Scanner scanner = new Scanner (System.in);

        //Declaraciones y asignacionaciones

        String palabraSecreta = "constelaciones";
        int intentosMax = 9;
        int intentos = 0;
        boolean palabraacertada = false; 

        //arreglos:

        char [] letrasacertadas = new char[palabraSecreta.length()];

        //Bucle : Estructura de control (iterativa).

        for (int i = 0; i < letrasacertadas.length; i++) {
            letrasacertadas[i] ='_';
        }
        //Bucle : Estructura de control (iterativa).

        while (!palabraacertada && intentos < intentosMax) {
                                           //tenemos un String en una palabra de chars
            System.out.println("Palabra a Acertada : " + String.valueOf(letrasacertadas) +" (" + palabraSecreta.length() + " letras)");
            System.out.println("Introduce una letra, por favor: ");

            //uso de clase Scanner para pedir una letra :char
           
            char letra = Character.toLowerCase(scanner.next().charAt(0));
            boolean letraCorrecta = false;
            for (int i = 0; i < palabraSecreta.length(); i++) { 
                // if : Estructura de control condicional.
                if(palabraSecreta.charAt(i) == letra){
                    letrasacertadas[i] = letra;
                    letraCorrecta = true;
                }
            }
            if (!letraCorrecta) {
                intentos++;
                System.out.println("¡letra incorrecta! Te quedan " + (intentosMax - intentos) + " intentos.");
            }
            if(String.valueOf(letrasacertadas).equals(palabraSecreta)){
                palabraacertada = true;
                System.out.println("¡Felicidades; has adivinado la palabra secreta: "+ palabraSecreta);
            }
        }
        if(!palabraacertada){
            System.out.println("¡Que pena, has fallado! GAME OVER, THE END.");
        }
        scanner.close();

    }
}
