import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        while (true) {
            System.out.println("*** Aplicacion Calculadora ***");
            // Mostramos el menu
            mostrarMenu();

            try {
                var opcion = Integer.parseInt(consola.nextLine());
                if (opcion >= 1 && opcion <= 4) {
                    ejecutarOpcion(opcion, consola);
                } else if (opcion == 5) {
                    System.out.println("Hasta luego");
                    break;
                } else {
                    System.out.println("Opcion erronea: " + opcion);
                }
                System.out.println();// Salto de linea
            } catch (Exception e) {
                System.out.println("Opcion erronea: " + e.getMessage());
            }
        }// fin while

    }// fin main

    private static void mostrarMenu(){
        System.out.println("""
                    1. Suma
                    2. Resta
                    3. Multiplicacion
                    4. Division
                    5. Salir
                    """);
        System.out.print("Selecciona una opcion: ");

    }
    private static void ejecutarOpcion(int opcion, Scanner consola){
        System.out.print("Proporciona valor operando1: ");
        var operando1 = Double.parseDouble(consola.nextLine());
        System.out.print("Proporciona valor operando2:  ");
        var operando2 = Double.parseDouble(consola.nextLine());
        double resultado;
        switch (opcion) {
            case 1 -> { // Suma
                resultado = operando1 + operando2;
                System.out.println("Resultado: " + resultado);

            }
            case 2 -> { // Resta
                resultado = operando1 - operando2;
                System.out.println("Resultado: " + resultado);
            }
            case 3 -> { // Multiplicacion
                resultado = operando1 * operando2;
                System.out.println("Resultado: " + resultado);
            }
            case 4 -> { // Division
                if (operando2 != 0) {
                    resultado = operando1 / operando2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("No se puede dividir entre 0");
                }
            }
            default -> System.out.println("Opcion erronea: " + opcion);
            }
        }
}// fin Clase