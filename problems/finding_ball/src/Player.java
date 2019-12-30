public class Player
{
    public void ballPath(Ball ball,Grid grid)
    {
        int xstart,ystart,moves=0;
        xstart=grid.xmin;
        ystart=grid.ymin;
        System.out.println("Path to the ball");
        while(xstart!=ball.xcoordinate || ystart!=ball.ycoordinate)
        {
            System.out.println(xstart+","+ystart);
            if(xstart<ball.xcoordinate)
            {
                xstart+=1;
            }
            else
            {
                ystart+=1;
            }
            moves+=1;

        }
        System.out.println(xstart+","+ystart);
        System.out.println("Ball path found in "+moves+" moves");
    }

}