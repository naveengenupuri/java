public class Grid
{
    String[] board={"*","*","*","*","*","*","*","*","*"};
    int[] marked={-1,-1,-1,-1,-1,-1,-1,-1,-1};

    public boolean filled(int val) {
        if(marked[val]==-1)
            return false;
        return true;
    }

    public boolean isEmpty() {
        /* int value=-1; */
        for(int i=0;i<9;i++)
        {
            if(this.marked[i]==-1)
                return true;
        }
        return false;
    }
}