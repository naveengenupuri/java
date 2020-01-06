public class SnakeLadder {
    private String winner;
    private boolean turn=true;
    private Board board;
    private Dice dice;
    Player player1,player2,currentPlayer;
    public SnakeLadder()
    {
        board=new Board();
        dice=new Dice();
        player1=new Player("Manikanta");
        player2=new Player("Naveen");

    }
    private boolean validPosition(Player player,int diceValue)
    {
        if(player.getPosition()+diceValue <= 100)
        {
            return true;
        }
        System.out.println("You cannot Jump over 100");
        return false;
    }
    private int checkSnakeLadder(int position)
    {
        position=board.checkSnake(position);
        position=board.checkLadder(position);
        return position;

    }
    private void updatePosition(Player player,int diceValue)
    {
         int position=this.checkSnakeLadder(player.getPosition()+diceValue);
         player.movePosition(position);
    }
    public void startGame()
    {
        while(this.winner==null)
        {
                currentPlayer=player2;
                if(this.turn)
                {
                    currentPlayer=player1;
                }
                System.out.println(currentPlayer.getName()+"'s turn \t Your current possition is "+currentPlayer.getPosition());
                int diceValue=currentPlayer.rollDice(dice);
                System.out.println("Dice Value is "+diceValue);
                if(this.validPosition(currentPlayer,diceValue))
                {
                    this.updatePosition(currentPlayer,diceValue);
                    System.out.println("Your new position is "+currentPlayer.getPosition());
                    this.checkWin(currentPlayer);
                    if(diceValue==6)
                    {
                        continue;
                    }

                }
                this.turn=!this.turn;

        }
        System.out.println(this.winner+" won the game");
    }

    private void checkWin(Player currentPlayer) {
        if(currentPlayer.getPosition()==100)
            this.winner=currentPlayer.getName();
    }

    public static void main(String[] args)
    {
        SnakeLadder snakeladder=new SnakeLadder();
        snakeladder.startGame();
    }
}
