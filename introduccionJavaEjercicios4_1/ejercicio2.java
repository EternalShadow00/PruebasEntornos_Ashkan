package introduccionJavaEjercicios4_1;

public class ejercicio2 {

    public static void main(String[] args) {
        /*
        Genere un boleto de loter�a primitiva que dar� una combinaci�n al azar. 
        La loter�a est� compuesta por 6 n�meros entre 1 y 49. Adem�s, hay un reintegro del 0 al 9. 
        Ahora ser� realista: NO se pueden repetir n�meros. 
         */
        //declaracion de variables
        int boleto[];
        int reintegro = 0;
        int i = 0;
        int j = 0;
        int k = 0;
        //fin declaracion de variables
        boleto = new int[6]; //tamano del array de boleto
        /*
        Explicacion del for siguiente:
            La variable i, recorrer� todo el array del boleto del 0 al 5 y generar� un n�mero
            aleatorio, y puede que se repita.
            Para que no se repita, dentro del for, crearemos otro for para que la variable j,
            recorra todo el array del boleto y que realice la comprobaci�n con un if
            para las dos variables.
                Si las dos variables coinciden, la variable i generar� un numero nuevo y restar�
                a la variable j un -1 para que compruebe el mismo espacio del array
         */
        for (i = 0; i < boleto.length; i++) {
            boleto[i] = (int) Math.floor(Math.random() * 49 + 1);
            for (j = 0; j < i; j++) {
                if (boleto[i] == boleto[j]) {
                    boleto[i] = (int) Math.floor(Math.random() * 49 + 1);
                    j = - 1;
                }
            }
        }
        for (k = 0; k < boleto.length; k++) {
            System.out.print(boleto[k] + " "); // imprimir por pantalla el boleto
        }
        reintegro = ((int) Math.floor(Math.random() * 10)); // numero aleatorio de 0 a 9
        System.out.println("\nReintegro: " + reintegro); // imprimir el n�mero aleatorio
    }
}
