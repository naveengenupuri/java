public class Ball
{
    int xcor,ycor;
    //int[] coordinates=new int[2];

    public void placeBall(Grid grid)
    {
        this.xcor=(int) (Math.random()*(grid.xmax-grid.xmin));
        this.ycor=(int) (Math.random()*(grid.ymax-grid.ymin));
        System.out.println("Ball placed randomly in "+xcor+","+ycor+" coordinates");
    }
}