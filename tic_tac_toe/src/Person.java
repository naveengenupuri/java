import java.util.Scanner;
public class Person
{
    String name="",symbol="";
    public Person(String name,String symbol)
    {
        this.name=name;
        this.symbol=symbol;
    }
    public int markLocation(Grid grid)
    {
        int val=0;
        Scanner input=new Scanner(System.in);
        //System.out.println("Enter the location from 1 to 9 where u want ");

        do
        {
            System.out.println(this.name+" Enter position");
            val=input.nextInt();
            if(val<1 || val>9)
            {
                System.out.println("Invalid grid position [1-9] only");
                continue;
            }
            //checking whether specified position in grid is filled or not
            boolean check=grid.filled(val-1);
            if(check==true)
            {
                System.out.println("Position is already filled");
                continue;
            }
            else
            {
                if(this.symbol=="X") {
                    grid.marked[val-1]=1;
                    grid.board[val-1]=this.symbol;
                    break;
                }
                else
                {
                    grid.marked[val-1]=2;
                    grid.board[val-1]=this.symbol;
                    break;
                }
            }

        }while(true);

    return val;
    }
}