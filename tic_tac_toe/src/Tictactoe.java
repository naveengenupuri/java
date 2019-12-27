public class Tictactoe
{
    int turn=1;
    String winner="";
    public void checkWinner(Person per,Grid grid)
    {
        if((grid.marked[0] == grid.marked[1]) && (grid.marked[1] == grid.marked[2]) && (grid.marked[0] != -1))
        {
                this.winner=per.name;
        }
        else if(grid.marked[3]==grid.marked[4] && grid.marked[4]==grid.marked[5]  && (grid.marked[3] != -1))
        {
            this.winner=per.name;
        }
        else if(grid.marked[6]==grid.marked[7] && grid.marked[7]==grid.marked[8] && (grid.marked[6] != -1))
        {
            this.winner=per.name;
        }
        else if(grid.marked[0]==grid.marked[3] && grid.marked[3]==grid.marked[6] && (grid.marked[0] != -1))
        {
            this.winner=per.name;
        }
        else if(grid.marked[1]==grid.marked[4] && grid.marked[4]==grid.marked[7] && (grid.marked[1] != -1))
        {
            this.winner=per.name;
        }
        else if(grid.marked[2]==grid.marked[5] && grid.marked[5]==grid.marked[8] && (grid.marked[2] != -1))
        {
            this.winner=per.name;
        }
        else if(grid.marked[0]==grid.marked[4] && grid.marked[4]==grid.marked[8] && (grid.marked[0] != -1))
        {
            this.winner=per.name;
        }
        else if(grid.marked[6]==grid.marked[4] && grid.marked[4]==grid.marked[2] && (grid.marked[6] != -1))
        {
            this.winner=per.name;
        }

    }
    public void displayGrid(Grid grid)
    {
        for(int i=1;i<10;i++)
        {
            System.out.print(grid.board[i-1]+"    ");
            if(i%3==0)
            {
                System.out.println("");
            }

        }
        //grid.board[8]="g";
    }
    public static void main(String[] args)
    {
        Tictactoe ttt=new Tictactoe();
        Grid grid=new Grid();
        Person p1=new Person("player1","X");
        Person p2=new Person("player2","O");
        //ttt.displayGrid(grid);
        int lastPosition=-1;
        while(grid.isEmpty()==true)
        {
            System.out.println("----- Grid -----");
            ttt.displayGrid(grid);
            System.out.println("----------------");
            if(ttt.turn==1)
            {
                lastPosition=p1.markLocation(grid);
                ttt.turn=2;
                ttt.checkWinner(p1,grid);
                if(ttt.winner!="")
                {
                    break;
                }

            }
            else
            {
                lastPosition=p2.markLocation(grid);
                ttt.turn=1;
                ttt.checkWinner(p2,grid);
                if(ttt.winner!="")
                {
                    break;
                }
            }

        }
        if(ttt.winner!="")
        {
            System.out.println(ttt.winner+" won the game!");
        }
        else
        {
            System.out.println("Game Draw");
        }


    }

}