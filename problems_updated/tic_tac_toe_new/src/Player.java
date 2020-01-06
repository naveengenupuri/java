import java.util.Scanner;

public class Player {
    private String name;
    private char symbol;

    public Player(String name, char symbol) {
        this.name=name;
        this.symbol=symbol;
    }
    public String getName()
    {
        return this.name;
    }
    public char getSymbol()
    {
        return this.symbol;
    }

    public int enterGridPosition()
    {
        Scanner input=new Scanner(System.in);
        return input.nextInt();
    }
}
