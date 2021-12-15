package git.branches.develop.test;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean exit = false;
        while (!exit){

            System.out.println("Enter your name: \n" +
                    "If you want to go out enter (wq)");
            Scanner scan = new Scanner(System.in);
            String input = scan.nextLine();

            if (input.equals("wq")){
                System.out.println("Bye - bye");
                exit = true;
            }else {
                Develop develop = new Develop();
                develop.greeting(input);
            }
        }
    }
}
