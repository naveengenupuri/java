public class Game
{
    private Grid grid;
    Player player1,player2;
    private boolean turn=true;
    private String winner=null;
    public Game()
    {
        grid=new Grid();
        player1=new Player("Manikanta",'O');
        player2=new Player("Naveen",'X');

    }

    private boolean checkForWinner()
    {
        for(int i=0;i<grid.cellValue.length;i++)
        {
            if(grid.getCell(i,0)==grid.getCell(i,1) && grid.getCell(i,1)==grid.getCell(i,2) && grid.getCell(i,0)!='-')
                return true;
            else if(grid.getCell(0,i)==grid.getCell(1,i) && grid.getCell(1,i)==grid.getCell(2,i) && grid.getCell(0,i)!='-')
                return true;
        }

        if(grid.getCell(0,0)==grid.getCell(1,1) && grid.getCell(1,1)==grid.getCell(2,2) && grid.getCell(1,1)!='-')
            return true;
        else if(grid.getCell(0,0)==grid.getCell(1,1) && grid.getCell(1,1)==grid.getCell(2,2) && grid.getCell(1,1)!='-')
            return true;
        return false;
    }

    private int markCell(Player currentPlayer)
    {
        System.out.println(currentPlayer.getName()+" enter position[1-9] to mark");
        int position;
        do {
            position=currentPlayer.enterGridPosition();
            if(position<1 || position>9)
                System.out.println("Invalid Position enter position between 1 and 9");
            else if(!grid.isFilled(position))
            {
                break;
            }
            System.out.println(position+" is already filled please mark another");
        }while(true);
        return position;
    }

    private void startGame()
    {
        Player currentPlayer=player1;
        System.out.println("Grid Positions are as followed");
        grid.displayGridLayout();
        while(winner==null && grid.hasEmpty())
        {
            currentPlayer=player2;
            if(this.turn)
                currentPlayer=player1;
            int position = this.markCell(currentPlayer);
            grid.cellValue[(position-1)/3][(position-1)%3]=currentPlayer.getSymbol();
            grid.displayGrid();
            if(this.checkForWinner())
            {
               break;
            }
            this.turn=!this.turn;
        }

        if(this.checkForWinner())
        {
            this.winner=currentPlayer.getName();
            System.out.println(this.winner+" Won the Game!!!");
        }
        else
        {
            System.out.println("Game draw");
        }


    }
    public static void main(String[] args)
    {
        Game game=new Game();
        game.startGame();

    }

}
