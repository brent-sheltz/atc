
/**
 * Write a description of class map here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class map
{
    // instance variables - replace the example below with your own
    private int[][] mapd = new int[100][100];

    /**
     * Constructor for objects of class map
     */
    public map()
    {
        // initialise instance variables
       
        for(int col = 0 ; col<100 ; col++)
        {
            for(int row = 0 ; row<100;row++)
            {
                mapd[col][row] = 0 ;
                
                
            }
        }
    }
    public static String key (int a )  
    {
       if (a == 0)
       {
       
            return "dirt";
        }
        else if (a == 1) 
        {
            return "runway"; 
        }
        else if (a == 2) 
        {
            return "building"; 
        }
        else if (a == 3) 
        {
            return "tower"; 
        }
        else 
        {
           return " not in num System";
        }
    }
    public String returntype(int y, int x,int[][] s)
    {
        int a =s[y][x];
        return key(a);
        
    }
    
}
