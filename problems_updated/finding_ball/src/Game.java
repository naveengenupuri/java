public class Game
{
    Grid grid;
    Player player;
    Ball ball;
    public Game() {

        player = new Player("Naveen",0,0);
        grid = new Grid(0,0,10,10);

    }

    private void placeBall()
    {
        int xvalue,yvalue;
        xvalue=(int) (Math.random()*(grid.xmax-(grid.xmin+1)));
        yvalue=(int) (Math.random()*(grid.ymax-(grid.ymin+1)));
        ball=new Ball(xvalue,yvalue);
        System.out.println("Ball placed randomly in "+xvalue+","+yvalue+" coordinates");
    }

    public double calculateDistance()
    {
        double distance;
        int xlocation,ylocation;
        xlocation=player.xstart;
        ylocation=player.ystart;

        distance=  Math.sqrt( Math.pow(xlocation-ball.getXcoordinate(),2) + (Math.pow(ylocation-ball.getYcoordinate(),2)) );
        return distance;
    }

    private void startGame()
    {
        placeBall();
        player.movePlace(this,grid);

    }

    public static void main(String[] args)
    {
        Game game=new Game();
        game.startGame();
    }

}