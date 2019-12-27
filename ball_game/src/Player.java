public class Player
{
    public void findPath(Ball b1,Grid grid)
    {
    	int xstart,ystart;
    	xstart=grid.xmin;
    	ystart=grid.ymin;
    	//(xstart==b1.xcor) && (ystart==b1.ycor)
    	System.out.println("Path to the ball");
        while(true)
        {
            System.out.println(xstart+","+ystart);
            if(xstart<b1.xcor)
            {
                xstart+=1;
            }
            else if(ystart<b1.ycor)
            {
                ystart+=1;
            }
            else
            {
                System.out.println("Ball path found");
                break;
            }

        }
        
    }

}