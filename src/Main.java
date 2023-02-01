import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int parameter1 = 0;
        int parameter2 = 0;
        String operation ="CARACTERES"; // Aqui declaramos un String, cadena es necesario para indicar que es un string
        Scanner teclado = new Scanner(System.in); // scanner es una clase de java.util, creamos un objeto dentro de esta clase
        //llamado teclado del tipo scaner, (System.in) se refiere a que el usuario ingresará algo por el teclado

        while(operation != "CADENA")
        {
            System.out.println("Bienvenido :) ");
            System.out.println("Captura Operacion (Favor de Ingresar SOLO letras mayusculas): ");
            System.out.println("Presione 0 para cancelar");
            operation = teclado.next(); // lo que se ingresará en el teclado se guardará en operation , teclado.next indica que se va a teclar algo

            switch (operation) {
                case "SUMA" -> {
                    System.out.println("Operando 1: ");
                    parameter1 = teclado.nextInt();
                    System.out.println("Operando 2: ");
                    parameter2 = teclado.nextInt();;
                    System.out.println(parameter1 + " + " + parameter2 + " = " + (parameter1 + parameter2));
                }
                case "MULTIPLICACION" -> {
                    System.out.println("Operando 1: ");
                    parameter1 = teclado.nextInt();;
                    System.out.println("Operando 2: ");
                    parameter2 = teclado.nextInt();;
                    System.out.println(parameter1 + " * " + parameter2 + " = " + (parameter1 * parameter2));
                }
                case "DIVISION" -> {
                    System.out.println("Operando 1: ");
                    parameter1 = teclado.nextInt();
                    System.out.println("Operando 2: ");
                    parameter2 = teclado.nextInt();
                    System.out.println(parameter1 + " / " + parameter2 + " = " + (parameter1 / parameter2));
                }
                case "RESTA" -> {
                    System.out.println("Operando 1: ");
                    parameter1 = teclado.nextInt();
                    System.out.println("Operando 2: ");
                    parameter2 = teclado.nextInt();
                    System.out.println(parameter1 + " - " + parameter2 + " = " + (parameter1 - parameter2));
                }
                case "0" ->
                    System.exit(0);
                default ->
                    System.out.println("Operacion no soportada");
            }
        }
    }
}

