import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private static final Random rand = new Random();
    private static final InputUser inputHandler = new InputUser();

    public static void main(String[] args) {

        runDiceGame();

    }

    public static int rollDice(){

        return rand.nextInt(6)+1;
    }

    public static void runDiceGame(){

        int rolls = inputHandler.getNumber("How many times would you like to roll the dice? (1-100) :",1,100);

        for(int i = 0 ; i < rolls ; i++){
            int result = rollDice();
            System.out.println("Roll "+(i+1) +": "+result);
        }
        inputHandler.closeScanner();
    }
}