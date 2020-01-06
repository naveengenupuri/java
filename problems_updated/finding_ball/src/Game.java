public class Game
{
    Grid grid;
    Player player;
    private Ball ball;
    public Game() {
        grid = new Grid(10);
        player = new Player("Naveen",0,0);
    }

    private void placeBall()
    {
        int xvalue,yvalue;
        xvalue=(int) (Math.random()*(grid.getGridSize()));
        yvalue=(int) (Math.random()*(grid.getGridSize()));
        ball=new Ball(xvalue,yvalue);
        System.out.println("Ball placed randomly in "+xvalue+","+yvalue+" coordinates");
    }

    public double getDistance()
    {
        return player.getPosition().calculateDistance(ball.getPosition());
    }

    private void startGame()
    {
        this.placeBall();
        while(player.getPosition().calculateDistance(ball.getPosition())!=0)
        {
            player.movePosition(this);
            player.getPosition().printPosition();
        }
        player.getPosition().printPosition();
    }

    public static void main(String[] args)
    {
        Game game=new Game();
        game.startGame();
    }

}