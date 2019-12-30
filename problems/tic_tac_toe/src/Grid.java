public class Grid
{
    String[] board={"*","*","*","*","*","*","*","*","*"};
    int[] marked={-1,-1,-1,-1,-1,-1,-1,-1,-1};

    public boolean isFilled(int val) {
        if(marked[val]==-1)
            return false;
        return true;
    }

    public boolean isEmpty()
    {
        for(int iteration=0;iteration<marked.length;iteration++)
        {
            if(this.marked[iteration]==-1)
                return true;
        }
        return false;
    }
}