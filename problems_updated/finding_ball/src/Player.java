public class Player
{
    String name;
    int xstart,ystart;
    public Player(String name,int xstart,int ystart) {
        this.name=name;
        this.xstart=xstart;
        this.ystart=ystart;
    }


    public void movePlace(Game game,Grid grid)
    {
        double previousDistance=0,presentDistance=0,horizontal=0;
        while(game.calculateDistance()!=0)
        {
            previousDistance=game.calculateDistance();
            System.out.println(xstart+","+ystart);
                xstart++;
                presentDistance=game.calculateDistance();
                if(presentDistance>previousDistance)
                {
                    xstart--;
                    break;
                }
        }

        while(game.calculateDistance()!=0)
        {
            previousDistance=game.calculateDistance();

            ystart++;
            presentDistance=game.calculateDistance();
            System.out.println(xstart+","+ystart);
            if(presentDistance>previousDistance)
            {
                ystart--;
                break;
            }
        }


    }


}