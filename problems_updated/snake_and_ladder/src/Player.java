public class Player {
    private String name;
    private int position=0;
    public Player(String name)
    {
        this.name=name;
    }
    public int rollDice(Dice dice)
    {
        return dice.rollDice();
    }

    public String getName() {
        return this.name;
    }
    public int getPosition()
    {
        return this.position;
    }

    public void movePosition(int position) {
        this.position=position;
    }
}
