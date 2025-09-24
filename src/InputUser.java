
import java.util.Scanner;

public class InputUser {

    private final Scanner scanner;


    public InputUser() {

        scanner = new Scanner(System.in);

    }

    public int getNumber (String msg, int min , int max)
    {

        while(true){

            System.out.print(msg);
            String input = scanner.nextLine();
            try {

                int choice = Integer.parseInt(input.trim());
                if( choice >= min && choice <= max) {

                    return choice;
                }
                else {

                    System.out.println("Enter a number between " + min + " and " + max + ".");
                }
            }catch (NumberFormatException e) {
                System.out.println("Error: you must enter an integer");
            }
        }
    }

    public void closeScanner(){

        scanner.close();
    }
}
