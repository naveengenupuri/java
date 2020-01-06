public class Position {
    private int xcoordinate,ycoordinate;

    public Position(int xcoordinate,int ycoordinate)
    {
        this.xcoordinate=xcoordinate;
        this.ycoordinate=ycoordinate;

    }

    public double calculateDistance(Position position)
    {
        double distance;
        distance=  Math.sqrt( Math.pow(this.xcoordinate-position.xcoordinate,2) + (Math.pow(this.ycoordinate-position.ycoordinate,2)) );
        return distance;
    }

    public void printPosition() {
        System.out.println(this.xcoordinate+","+this.ycoordinate);
    }

    public void incrementXcoordinate() {
        this.xcoordinate++;
    }
    public void incrementYcoordinate() {
        this.ycoordinate++;
    }
    public void decrementXcoordinate() {
        this.xcoordinate--;
    }
    public void decrementYcoordinate() {
        this.ycoordinate--;
    }
}
