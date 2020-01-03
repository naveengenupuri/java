import java.util.Scanner;

public class Game
{
    Grid grid;
    Player player1,player2;
    private boolean turn=true;
    private String winner=null;
    public Game()
    {
        grid=new Grid();
        player1=new Player("Manikanta","O");
        player2=new Player("Naveen","X");

    }

    private boolean checkForWinner()
    {
        if((grid.gridValue[0] == grid.gridValue[1]) && (grid.gridValue[1] == grid.gridValue[2]) && (grid.gridValue[0] != 0))
        {
            return true;
        }
        else if(grid.gridValue[3]==grid.gridValue[4] && grid.gridValue[4]==grid.gridValue[5]  && (grid.gridValue[3] != 0))
        {
            return true;
        }
        else if(grid.gridValue[6]==grid.gridValue[7] && grid.gridValue[7]==grid.gridValue[8] && (grid.gridValue[6] != 0))
        {
            return true;
        }
        else if(grid.gridValue[0]==grid.gridValue[3] && grid.gridValue[3]==grid.gridValue[6] && (grid.gridValue[0] != 0))
        {
            return true;
        }
        else if(grid.gridValue[1]==grid.gridValue[4] && grid.gridValue[4]==grid.gridValue[7] && (grid.gridValue[1] != 0))
        {
            return true;
        }
        else if(grid.gridValue[2]==grid.gridValue[5] && grid.gridValue[5]==grid.gridValue[8] && (grid.gridValue[2] != 0))
        {
            return true;
        }
        else if(grid.gridValue[0]==grid.gridValue[4] && grid.gridValue[4]==grid.gridValue[8] && (grid.gridValue[0] != 0))
        {
            return true;
        }
        else if(grid.gridValue[6]==grid.gridValue[4] && grid.gridValue[4]==grid.gridValue[2] && (grid.gridValue[6] != 0))
        {
            return true;
        }
        return false;
    }

    private int enterPosition()
    {
        int position;
        String player=player2.name;
        Scanner input=new Scanner(System.in);
        if(this.turn==true)
            player = player1.name;

        System.out.println(player+" enter position to mark");

        do {
            position=input.nextInt();
            if(position<1 || position>9)
                System.out.println("Invalid Position enter position again");
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
        int position=-1;
        while(winner==null && grid.isEmpty())
        {
            grid.displayGrid();
            position = this.enterPosition();
            if(this.turn==true)
            {
                grid.board[position-1]=player1.symbol;
                grid.gridValue[position-1]=1;
            }
            else
            {
                grid.board[position-1]=player2.symbol;
                grid.gridValue[position-1]=2;
            }

            if(this.checkForWinner())
            {
               break;
            }
            this.turn=!this.turn;
        }

        if(this.checkForWinner())
        {
            if(this.turn==true)
                this.winner=player1.name;
            else
                this.winner=player2.name;
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
