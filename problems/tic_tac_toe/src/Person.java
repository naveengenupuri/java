import java.util.Scanner;
public class Person
{
    String name="",symbol="";
    int symbolValue;
    public Person(String name,String symbol,int symbolValue)
    {
        this.name=name;
        this.symbol=symbol;
        this.symbolValue=symbolValue;
    }
    public void markLocation(Grid grid)
    {
        int gridNumber=0;
        Scanner input=new Scanner(System.in);

        do
        {
            System.out.println(this.name+" Enter position");
            gridNumber=input.nextInt();
            if(gridNumber<1 || gridNumber>9)
            {
                System.out.println("Invalid grid position [1-9] only");
                continue;
            }
            boolean filled=grid.isFilled(gridNumber-1);
            if(filled==true)
            {
                System.out.println("Position is already filled");
                continue;
            }
            else
            {
                grid.marked[gridNumber-1]=this.symbolValue;
                grid.board[gridNumber-1]=this.symbol;
                break;
            }

        }while(true);

    }
}