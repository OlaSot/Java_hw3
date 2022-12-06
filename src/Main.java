import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);



    public static void main(String[] args) {

        int a;

        System.out.println("Enter a number");
        a = scanner.nextInt();

        System.out.println("You've entered: " + a);

        System.out.println(sum());

        }


    public static int sum(){
        System.out.println("First number");
        int a = scanner.nextInt();

        System.out.println("Second number");
        int b = scanner.nextInt();

        System.out.println("Third number");
        int c = scanner.nextInt();

        return a+b+c;

    }
}