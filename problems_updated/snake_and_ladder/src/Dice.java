import java.util.Scanner;

public class Dice {
    public int rollDice()
    {
        Scanner input=new Scanner(System.in);
        input.nextLine();
        return (int) ((Math.random()*6)+1);
    }
}
