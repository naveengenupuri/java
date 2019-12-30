public class Tictactoe
{
    int turn=1;
    String winner=null;
    public void checkWinner(Person person,Grid grid)
    {
        if((grid.marked[0] == grid.marked[1]) && (grid.marked[1] == grid.marked[2]) && (grid.marked[0] != -1))
        {
                this.winner=person.name;
        }
        else if(grid.marked[3]==grid.marked[4] && grid.marked[4]==grid.marked[5]  && (grid.marked[3] != -1))
        {
            this.winner=person.name;
        }
        else if(grid.marked[6]==grid.marked[7] && grid.marked[7]==grid.marked[8] && (grid.marked[6] != -1))
        {
            this.winner=person.name;
        }
        else if(grid.marked[0]==grid.marked[3] && grid.marked[3]==grid.marked[6] && (grid.marked[0] != -1))
        {
            this.winner=person.name;
        }
        else if(grid.marked[1]==grid.marked[4] && grid.marked[4]==grid.marked[7] && (grid.marked[1] != -1))
        {
            this.winner=person.name;
        }
        else if(grid.marked[2]==grid.marked[5] && grid.marked[5]==grid.marked[8] && (grid.marked[2] != -1))
        {
            this.winner=person.name;
        }
        else if(grid.marked[0]==grid.marked[4] && grid.marked[4]==grid.marked[8] && (grid.marked[0] != -1))
        {
            this.winner=person.name;
        }
        else if(grid.marked[6]==grid.marked[4] && grid.marked[4]==grid.marked[2] && (grid.marked[6] != -1))
        {
            this.winner=person.name;
        }

    }
    public void displayGrid(Grid grid)
    {
        int iteration;
        for(iteration=0;iteration<grid.board.length;iteration++)
        {
            System.out.print(grid.board[iteration]+"    ");
            if(iteration%3==2)
            {
                System.out.println("");
            }

        }
    }

    public static void main(String[] args)
    {
        Tictactoe tictactoe=new Tictactoe();
        Grid grid=new Grid();
        Person player1=new Person("Manikanta","X",1);
        Person player2=new Person("Surya","O",2);
        int lastPosition=-1;
        while(grid.isEmpty()==true && tictactoe.winner==null)
        {
            System.out.println("----- Grid -----");
            tictactoe.displayGrid(grid);
            System.out.println("----------------");
            if(tictactoe.turn==1)
            {
                player1.markLocation(grid);
                tictactoe.turn=2;
                tictactoe.checkWinner(player1,grid);
            }
            else
            {
                player2.markLocation(grid);
                tictactoe.turn=1;
                tictactoe.checkWinner(player2,grid);
            }

        }

        if(tictactoe.winner==null)
        {
            System.out.println("Game Draw");
        }
        else
        {
            System.out.println(tictactoe.winner+" won the game!");
        }


    }

}