import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);

        try {
            int a = 10;
            int b = Integer.parseInt(scanner.nextLine());
            System.out.println("Division " + (a / b));
        } catch(NumberFormatException nfe){
            System.out.println("No capturaste el dato correcto");
        }finally{
            System.out.println("Siempre se ejecuta...");
        }

        System.out.println("Fin del programa...");
    }
}