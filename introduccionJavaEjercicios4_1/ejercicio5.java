package introduccionJavaEjercicios4_1;

import java.util.Scanner;

/**
 * author Ashkan Sevinov Ashimov
 */
public class ejercicio5 {

    /*
    Sea un lector de caracteres. 
    El usuario introducir� una frase inicial. 
    Despu�s, podr� elegir un n�mero, y se dir� por pantalla qu� letra ocupa ese lugar. 
    Ojo: date cuenta de que lo m�s intuitivo para el usuario es que la primera letra sea el n�mero 1, aunque en el c�digo interno del programa se suela empezar por 0. 
    Ten en cuenta esa conversi�n. Por ejemplo: en "Mi mam� me mima", si el usuario dice 1 se devolver� una M.  
     */
    public static void main(String[] args) {

        // definicion de variables
        Scanner sc = new Scanner(System.in);
        String frase = ""; //frase por pantalla    
        char letras[] = new char[frase.length()]; // que tenga la cantidad de letras de frase
        int numFrase = 0; // inicializacion de pedir num por pantalla para sacar una letra
        // fin definicion de variables

        System.out.println("Dime una frase");
        frase = sc.nextLine();
        letras = frase.toCharArray(); // conversion de string a char

        System.out.println("Dime un numero");
        numFrase = sc.nextInt();
        numFrase = (numFrase - 1); //restar -1 para que al elegir el num "1", sea la primera letra

        /*
        En el siguiente if, verificaremos que el numero pedido por pantalla este dentro
        del rango de la frase, comparandolo con el array de letras
        */
        if ((numFrase >= 0 && numFrase <= letras.length)) { 
            System.out.println("La letra que has elegido es: " + letras[numFrase]);
        } else {
            System.out.println("Tiene que estar dentro del rango escrito");
        }

    }

}
