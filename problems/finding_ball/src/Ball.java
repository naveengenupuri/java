public class Ball
{
    int xcoordinate,ycoordinate;
    //int[] coordinates=new int[2];

    public void placeBall(Grid grid)
    {
        this.xcoordinate=(int) (Math.random()*(grid.xmax-grid.xmin));
        this.ycoordinate=(int) (Math.random()*(grid.ymax-grid.ymin));
        System.out.println("Ball placed randomly in "+xcoordinate+","+ycoordinate+" coordinates");
    }
}