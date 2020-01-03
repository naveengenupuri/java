public class Grid
{
    String[] board ={"-", "-", "-","-", "-", "-","-", "-", "-"};
    int[] gridValue = {0,0,0,0,0,0,0,0,0};

    public void displayGrid() {
        for(int i=0;i<board.length;i++)
        {
            System.out.print(board[i]+"    ");
            if(i%3==2) {
                System.out.println("");
            }
        }
    }

    public boolean isFilled(int position) {
        if(gridValue[position-1]==0)
            return false;
        return true;
    }

    public boolean isEmpty()
    {
        for(int iteration=0;iteration<gridValue.length;iteration++)
        {
            if(this.gridValue[iteration]==0)
                return true;
        }
        return false;
    }
}
