public class Grid
{
    char[][] cellValue ={{'-','-','-'},{'-','-','-'},{'-','-','-'}};

    public void displayGrid() {
        for(int i=0;i<cellValue.length;i++)
        {
            for(int j=0;j<cellValue[i].length;j++)
            {
                System.out.print(cellValue[i][j]+"    ");
            }
            System.out.println(" ");
        }
    }

    public boolean isFilled(int position) {

        if(cellValue[(position-1)/3][(position-1)%3]=='-') {
            return false;
        }
        return true;
    }

    public boolean hasEmpty()
    {
        for(int i=0;i<cellValue.length;i++)
        {
            for(int j=0;j<cellValue[i].length;j++)
            {
                if(cellValue[i][j]=='-')
                    return true;
            }
        }
        return false;
    }
    public char getCell(int row,int column)
    {
        return cellValue[row][column];
    }

    public void displayGridLayout() {
        for(int i=1;i<=9;i++)
        {
            System.out.print(i+"    ");
            if(i%3==0)
                System.out.println(" ");
        }
    }
}
