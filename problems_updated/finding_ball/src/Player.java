public class Player
{
    private String name;
    private Position position;
    public Player(String name,int xcoordinate,int ycoordinate) {
        this.name=name;
        position=new Position(xcoordinate,ycoordinate);
    }
    public Position getPosition()
    {
        return this.position;
    }

    public void movePosition(Game game) {
        double previousDistance=0,presentDistance=0;
        previousDistance=game.getDistance();

        position.incrementXcoordinate();
        position.printPosition();
        presentDistance=game.getDistance();
        if(presentDistance>previousDistance)
        {

            position.decrementXcoordinate();
            System.out.println("You took wrong step so moving backward");
            position.printPosition();
        }


        previousDistance=presentDistance;

        position.incrementYcoordinate();
        presentDistance=game.getDistance();
        if(presentDistance>previousDistance)
        {

            position.decrementYcoordinate();
            System.out.println("You took wrong step so moving backward");
            position.printPosition();
        }



    }



}